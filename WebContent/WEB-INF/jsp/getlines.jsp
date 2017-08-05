<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>线路详情</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>物流公司</td>
            <td>线路编号</td>
            <td>出发地</td>
            <td>目的地</td>
            <td>运载能力</td>
            <td>价格</td>
            <td>平均用时</td>
            <td>是否可用</td>
            <td>公司详情</td>
        </tr>
    <c:forEach items="${lines}" var="line">
        <tr>
            <td>${line.lname}</td>
            <td>${line.line_no}</td>
            <td>${line.line_start}</td>
            <td>${line.line_end}</td>
            <td>${line.weight}</td>
            <td>${line.price}</td>
            <td>${line.time}</td>
            <td>${line.used}</td>
            <td><a href="../logistics/display.do?lname=${line.lname}">公司主页</a></td>
        </tr>
    </c:forEach>
    </table>
</body>
</html>