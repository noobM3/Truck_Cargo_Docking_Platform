<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>账号信息</title>

    <link rel="stylesheet" type="text/css" href="../jquery-easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../jquery-easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="../jquery-easyui/themes/color.css">
    <link rel="stylesheet" type="text/css" href="../jquery-easyui/themes/xyy.css">
    <script type="text/javascript" src="../jquery-easyui/jquery.min.js"></script>
    <script type="text/javascript" src="../jquery-easyui/easyloader.js"></script>

<style type="text/css">  
table.altrowstable {  
    font-family: verdana,arial,sans-serif;  
    font-size:11px;  
    color:#333333;  
    border-width: 1px;  
    border-color: #a9c6c9;  
    border-collapse: collapse;  
}  
table.altrowstable th {  
    border-width: 1px;  
    padding: 8px;  
    border-style: solid;  
    border-color: #a9c6c9;  
}  
table.altrowstable td {  
    border-width: 1px;  
    padding: 8px;  
    border-style: solid;  
    border-color: #a9c6c9;  
}  
.oddrowcolor{  
    background-color:#d4e3e5;  
}  
.evenrowcolor{  
    background-color:#c3dde0;  
}  
</style>

</head>
<body bgcolor="#F0F8FF">
        <table class="altrowstable" id="alternatecolor">
            <tr>
                <td>账号</td>
                <td>：${owner.ono}</td>
            </tr>
            <tr>
                <td>用户</td>
                <td>：${owner.oname}</td>
            </tr>
            <tr>
                <td>性别</td>
                <td>：${owner.sex}</td>
            </tr>
            <tr>
                <td>电话</td>
                <td>：${owner.phone}</td>
            </tr>
            <tr>
                <td>认证状态</td>
                <td>
                    <c:if test="${owner.cer == '0'}">：未认证</c:if > 
                    <c:if test="${owner.cer == '1'}">：已认证</c:if > 
                </td>
            </tr>
        </table>
    
    
    
    <script type="text/javascript">
    
    function altRows(id){  
        if(document.getElementsByTagName){    
              
            var table = document.getElementById(id);    
            var rows = table.getElementsByTagName("tr");   
               
            for(i = 0; i < rows.length; i++){            
                if(i % 2 == 0){  
                    rows[i].className = "evenrowcolor";  
                }else{  
                    rows[i].className = "oddrowcolor";  
                }        
            }  
        }  
    }  
      
    window.onload=function(){  
        altRows('alternatecolor');  
    }  
    
/*     $('#win').window({
        collapsible:false,
        minimizable:false,
        maximizable:false
    }); */
    </script>
</body>
</html>