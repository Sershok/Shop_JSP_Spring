<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Registration Success</title>
    <style type="text/css">
        body {
            background: rgba(132, 54, 45, 0.2);
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
        h2 {
            padding-bottom: 5px;
            border-bottom: dotted;
            font-size: 1.7em;
            margin-top: 10px;
            margin-bottom: 10px;
        }
        td {
            border: 2px solid;
            font-size: 25px;
        }

        table {
            text-align: center;
            margin-top: 6px;
            padding: 6px;
            border: 3px solid;
            border-radius: 10px;
            background-color: rgba(98, 123, 175, 0.4);
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
    <br><br>
    <h2>Registration Succeeded!</h2><br>
    <table border="1px">
        <tr>
            <td>First Name</td>
            <td>Last Name</td>
            <td>Email</td>
        </tr>
        <tr>
            <td>${personDto.firstName}</td>
            <td>${personDto.lastName}</td>
            <td>${personDto.email}</td>
        </tr>
    </table>
    <br>

</div>
</body>
</html>