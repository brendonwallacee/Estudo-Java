<%-- 
    Document   : Calculadora
    Created on : 11 de mar. de 2024, 19:10:10
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
        <h1>Calculadora Teste</h1>
        <%
            double v1 = Double.parseDouble(request.getParameter("v1"));
            double v2 = Double.parseDouble(request.getParameter("v2"));
            char op = request.getParameter("op").charAt(0);
            double res=0;
            switch (op) {
                    case '+':
                        res = v1 + v2;
                        break;
                    case '-':
                        res = v1 - v2;
                        break;
                    case '*':
                        res = v1 * v2;
                        break;
                    case '/':
                        res = v1 / v2;
                        break;
                    default:
                        throw new AssertionError();
                }
            
            
            out.println("Resultado: "+res);
            
            
            %>
    </body>
</html>
