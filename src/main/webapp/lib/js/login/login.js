layui.use(['table','layer','form'], function(){
var table=layui.table,
 layer=layui.layer,
 form=layui.form;

    // 登录过期的时候，跳出ifram框架
    /* if (top.location != self.location) top.location = self.location;*/

    // 粒子线条背景
    $(document).ready(function(){
        $('.layui-container').particleground({
            dotColor:'#5cbdaa',
            lineColor:'#5cbdaa'
        });
    });
    // 进行登录操作
    form.on('submit(login)', function (data) {
        data = data.field;
        if (data.username == '') {
            layer.msg('用户名不能为空');
            return false;
        }
        if (data.password == '') {
            layer.msg('密码不能为空');
            return false;
        }
        if (data.captcha == '') {
            layer.msg('验证码不能为空');
            return false;
        }
        /**
         * 1.先写一个ajax测试跳转是否有问题
         * 2.跳转没问题就把拦截器关掉
         * 3.跳转,拦截器都没问题就是前端框架有问题
         */

        $.ajax({
            url : '/to/login',
            type : 'post',
            data : {
                name:'aa',
                password:'123'
            },
            dataType : 'text',
            success : function(msg) {
                layer.msg("123");
               /* window.location.href="${pageContext.request.contextPath}/index";*/
            },
            error:function(){
                layer.close(loadIndex);
                layer.msg("网络异常，请稍后重试");
            },


        })
        /*$.ajax({
            url: "/adminer/index",
            type: "post",
            data:{
                name:$("input[name=username]"),
                password:$("input[name=password]")
            },
            dataType:'json',//json
            success:function (data) {
                alert("123");
            },
            error:function(){
                layer.msg("网络异常，请稍后重试");
            }
        });*/
        /*return false;*/
    });
});