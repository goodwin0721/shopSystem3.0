$(document).ready(function(){
    $("#usernameTx").blur(function (){
        var username = $("#usernameTx").val();
        var url = "/" + window.location.pathname.split("/")[1] +"/m/isExist";
        if(username.trim() !=""){
            $.ajax({
                url:url,
                data:{"username":username},
                type:"POST",
                success:function (data) {
                    console.log(data);
                    var msg = (data + "").trim();
                    console.log(msg);
                    if(msg == "false"){
                        $("#isE").css("color","green");
                        $("#isE").html("用户名合法");
                    }
                    else{
                        $("#isE").css("color","red");
                        $("#isE").html("用户名已存在");
                    }
                }
            })
        }
    });
});