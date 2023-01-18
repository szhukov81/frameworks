<%-- 
    Document   : StudentsInfo
    Created on : 17 янв. 2023 г., 11:54:19
    Author     : serega
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Statistics</title>
    </head>
    <body>
        <h1>Statistics</h1>
        <table> 
            <tbody> 
                <tr>
                    <td><label for="name">Mean age:</label></td>
                    <td>${stat.getMeanAge()}</td>
                </tr>
                <tr>
                    <td><label for="surname">Popular mail domain:</label></td>
                    <td>${stat.getPopularMailDomain()}</td>
                </tr>
            </tbody>
        </table>   
    </body>
</html>
