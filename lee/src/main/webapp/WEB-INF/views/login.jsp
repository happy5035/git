<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Custom TextBox - jQuery EasyUI Demo</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/static/easyui/1.4/themes/metro/easyui.css" />">
	<link rel="stylesheet" type="text/css" href="<c:url value="/static/easyui/1.4/themes/icon.css" />">
	<script type="text/javascript" src="<c:url value="/static/easyui/1.4/jquery.min.js" />"></script>
	<script type="text/javascript" src="<c:url value="/static/easyui/1.4/jquery.easyui.min.js" />"></script>
	<script type="text/javascript" src="<c:url value="/static/easyui/1.4/locale/easyui-lang-zh_CN.js" />"></script>
	<script type="text/javascript" src="<c:url value="/static/js/main.js" />"></script>
	<script type="text/javascript">
	//获取验证码    
	function changeValidateCode(obj) {
		var timenow = new Date().getTime();
		document.getElementById("imgObj").src = "VerifyCode?d="
				+ timenow;
	}
	</script>
</head>
<body>
   
    <form action="login" method="post" id="loginForm">
    <div  style="width:400px;padding:10% 70px 20px 35%">
        <div style="margin-bottom:10px">
            <input name="username" class="easyui-textbox" style="width:100%;height:40px;padding:12px" data-options="prompt:'用户名',iconCls:'icon-man',iconWidth:38">
        </div>
        <div style="margin-bottom:20px">
            <input name="password" class="easyui-textbox" type="password" style="width:100%;height:40px;padding:12px" data-options="prompt:'密码',iconCls:'icon-lock',iconWidth:38">
        </div>
        <div style="margin-bottom:20px">
            <input name="validateCode" class="easyui-textbox"  style="width:75%;height:40px;padding:12px" data-options="prompt:'验证码'">
            <img height="30" id="imgObj" title="点击我,换一个！"
									src="VerifyCode" onclick="changeValidateCode()"
									 />
        </div>
        <div>
            <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'" style="padding:5px 0px;width:100%;" onclick="submitForm('#loginForm')">
                <span style="font-size:14px;">登录</span>
            </a>
        </div>
    </div>
    </form>
</body>
</html>

