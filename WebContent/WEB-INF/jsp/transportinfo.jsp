<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单运输详情</title>
</head>
<body>
    <table>
        <tr>
            <td>物流编号</td>
            <td>:&nbsp&nbsp&nbsp&nbsp${transport.trackingno}</td>
        </tr>
        <tr>
            <td>物流公司</td>
            <td>:&nbsp&nbsp&nbsp&nbsp<a href="../logistics/display.do?lname=${transport.lname}">${transport.lname}</a></td>
        </tr>
        <tr>
            <td>货主</td>
            <td>:&nbsp&nbsp&nbsp&nbsp${transport.oname}</td>
        </tr>
        <tr>
            <td>货物</td>
            <td>:&nbsp&nbsp&nbsp&nbsp${transport.cname}</td>
        </tr>
        <tr>
            <td>出发地</td>
            <td>:&nbsp&nbsp&nbsp&nbsp${transport.starting}</td>
        </tr>
        <tr>
            <td>目的地</td>
            <td>:&nbsp&nbsp&nbsp&nbsp${transport.destination}</td>
        </tr>
        <tr>
            <td>开始时间</td>
            <td>:&nbsp&nbsp&nbsp&nbsp${transport.start_time}</td>
        </tr>
        <tr>
            <td>结束时间</td>
            <td>
                <c:if test="${not empty transport.end_time}">:&nbsp&nbsp&nbsp&nbsp${transport.end_time}</c:if > 
                <c:if test="${empty transport.end_time}">:&nbsp&nbsp&nbsp&nbsp正在运输中......</c:if > 
            </td>
        </tr>
    </table>
     
</body>
</html>