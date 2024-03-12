<%-- 
    Document   : SerieJSTL
    Created on : 11 de mar. de 2024, 19:59:46
    Author     : Brendon
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Teste</h1>
        <c:set var="serie" value="1"/>
        <c:set var="troca" value="0"/>
        <c:set var="num" value="0"/>
        <c:forEach var="x" begin="${param.v1}" end="${param.v2}" step="1">
            <c:set var="troca" value="${serie}"/>
            <c:set var="serie" value="${serie+num}"/>
            <c:set var="num" value="${troca}"/>
            <c:out value="${serie} "/>
        </c:forEach>
        
    </body>
</html>
