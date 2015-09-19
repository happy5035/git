<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加学生</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/main.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/static/easyui/1.4/themes/metro/easyui.css" />">
	<link rel="stylesheet" type="text/css" href="<c:url value="/static/easyui/1.4/themes/icon.css" />">
	<script type="text/javascript" src="<c:url value="/static/easyui/1.4/jquery.min.js" />"></script>
	<script type="text/javascript" src="<c:url value="/static/easyui/1.4/jquery.easyui.min.js" />"></script>
	<script type="text/javascript" src="<c:url value="/static/easyui/1.4/locale/easyui-lang-zh_CN.js" />"></script>
	<script type="text/javascript" src="<c:url value="/static/js/main.js" />"></script>
	<script type="text/javascript" src="<c:url value="/static/js/validateboxRules.js" />"></script>
</head>
<body>   
        <div style="padding:10px 20px 20px 10px">
        <div class="ftitle">学生信息</div>
        <form id="studentInfoForm" name="studentInfoForm" method="post" >
            <table>
                <tr>
                    <td>姓名:</td>
                    <td>
                    	<input class="easyui-validatebox textbox" type="text" id="name" name="name"                               
		                 data-options="" />
					</td>
				</tr>
				<tr>
                    <td>班级:</td>
                    <td>
                    	<input class="easyui-validatebox textbox" type="text" name="classname" 
		                 data-options="" />
                    </td>
                </tr>
				<tr>
                    <td>电话:</td>
                    <td><input class="easyui-validatebox textbox" type="text" name="cellphone" data-options=""></input></td>
                </tr>
                <tr>
                	<td>邮箱:</td>
                    <td><input class="easyui-validatebox textbox" type="text" name="email" data-options=""></input></td>
                </tr>
               
            </table>
           
        </form>
        
        </div>
</body>
</html>
