<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Add Success</title>
    <style type="text/css">
        body {
            background: rgba(32, 54, 45, 0.6);
            font-family: Verdana;
            width: 1240px;
            margin: 0 auto;

        }

        button {
            margin-top: 7px;
            font-size: 15px;
            border-radius: 10px;
            float: left;
        }

        button:hover {
            font-size: 21px;
            background-color: darkolivegreen;
            transition-duration: 0.7s;
        }

        td {
            font-size: 13px;
            background: rgba(123, 104, 121, 0.8);
            text-align: center;
        }

        table {
            background: rgba(123, 104, 121, 0.8);
            border: 2px solid rgba(13, 104, 121, 0.8);
        }

        td:hover {
            background-color: rgba(198, 123, 175, 0.7);
            transition-duration: 1.5s;

        }
    </style>
</head>
<body>
<div align="center">
    <button><a href="/">Main</a></button>
    <br>
    <h2>Add Succeeded!</h2>
    <table border="3" align="center">
        <tr>
            <td>Price</td>
            <td>Product</td>
            <td></td>
        </tr>
        <c:forEach items="${product}" var="product">
            <tr>
                <td>${product.name}</td>
                <td>${product.price}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
