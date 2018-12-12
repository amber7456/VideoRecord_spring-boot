function detail(id) {
    var url = "video/detail/" + id;
    // iframe层 parent.
    layer.open({
        type: 2,
        title: '资源详情',
        shadeClose: true,
        maxmin: true,
        shade: [0.3, '#333'],
        offset: '10px',
        area: ['1200px', '90%'],
        anim: 5,
        isOutAnim: false,
        content: url
    });

}

function editVideo(div, id) {
    var url = "video/edit/" + id;
    $(div).parent().slideUp(200);// 滑动消失
    // iframe层parent.
    layer.open({
        type: 2,
        title: '资源编辑',
        shadeClose: false,
        maxmin: true,
        shade: [0.3, '#333'],
        area: ['1200px', '90%'],
        anim: 5,
        isOutAnim: false,
        content: url
    });
}

function deleteVideo(div, id, name) {
    $(div).parent().slideUp(200); // 滑动
    // 询问框parent.
    layer.confirm('确认删除记录：' + name, {
        offset: '200px',
        btn: ['确定', '取消']
    }, function (confirmIndex) {
        var url = "video/" + id;
        var method = "DELETE";
        sendRequest(url, method, null, function (resp) {
            layer.close(confirmIndex);
            if (resp.data == 1) {
                layer.alert("删除成功！！！", {
                    offset: '200px'
                }, function (index) {
                    layer.close(index);
                    // 刷新
                    callBackSearch();
                });
            } else {
                layer.alert("删除失败！！！", {
                    offset: '200px'
                });
            }
        });
    });
}