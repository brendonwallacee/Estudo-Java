<%-- 
    Document   : Serie
    Created on : 11 de mar. de 2024, 19:47:21
    Author     : Brendon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            int serie = 1;
            int troca = 0, num = 1;
            
            for (int idx = 1; idx <= 10; idx++){
                troca = serie;
                serie = serie + num;
                num = troca;
           
        %>
        <p>Mostrando...</p>
        <%
            out.print(serie); 
            %>
            <p>,</p>
            <%
                }
            %>
    </body>
</html>
