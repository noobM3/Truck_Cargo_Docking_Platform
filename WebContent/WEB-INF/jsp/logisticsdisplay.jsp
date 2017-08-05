<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>公司详情</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>编号</td>
            <td>${logistics.lno}</td>
        </tr>
        <tr>
            <td>名称</td>
            <td>${logistics.lname}</td>
        </tr>
        <tr>
            <td>认证状态</td>
            <td>${logistics.cer}</td>
        </tr>
        <tr>
            <td>规模</td>
            <td>${logistics.scale}</td>
        </tr>
        <tr>
            <td>联系电话</td>
            <td>${logistics.l_phone}</td>
        </tr>
        <tr>
            <td>电子邮箱</td>
            <td>${logistics.email}</td>
        </tr>
        <tr>
            <td>地址</td>
            <td>${logistics.address}</td>
        </tr>
        <tr>
            <td>成功承运</td>
            <td>${logistics.s_time}</td>
        </tr>
        <tr>
            <td>纠纷承运</td>
            <td>${logistics.f_time}</td>
        </tr>
        
    </table>
</body>
</html>