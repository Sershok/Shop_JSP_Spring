<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>person</title>
    <style>
        label {
            display: inline-block;
            width: 230px;
            vertical-align: top;
            text-align: left;
            margin: 5px;
            padding: 3px;
        }

        body {
            background: rgba(32, 54, 45, 0.6);
            font-family: Verdana;
            width: 1240px;
            margin: 0 auto;

        }

        button {
            margin-top: 7px;
            font-size: 20px;
            border-radius: 10px;
        }

        input {
            margin: 5px;
            padding: 3px;
        }

        input:hover {
            font-size: 15px;
            background-color: silver;
        }

        button:hover {
            font-size: 21px;
            background-color: darkolivegreen;
            transition-duration: 0.7s;
        }



    </style>
</head>
<body>

<div align="center">
    <h2>User Registration</h2>

    <form:form action="/person/create" method="post" modelAttribute="person">
        <form:label path="firstName">First name:</form:label>
        <form:input cssStyle=" align-content: baseline" maxlength="15" placeholder="Serhii" path="firstName"/><br/>

        <form:label path="lastName">Last name:</form:label>
        <form:input cssStyle=" align-content: baseline" maxlength="15" placeholder="Ponomarenko" path="lastName"/><br/>

        <form:label path="email">E-mail:</form:label>
        <form:input cssStyle=" align-content: baseline" placeholder="agentlukas321@gmail.com"
                    path="email"/><br/>

        <form:button>Person</form:button>
    </form:form>

</div>
</form>
</body>
</html>



