<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Shop</title>
    <style type="text/css">
        body {
            background: rgba(32, 54, 45, 0.6);
            font-family: Verdana;
            width: 1240px;
            margin: 0 auto;

        }

        button {
            border-radius: 15px;
            background: burlywood;
            font-size: 20px;
            border: 5px solid rgba(0, 0, 0, 0.5);
        }

        button:hover {
            padding: 5px;
            font-size: 25px;
            border-radius: 0px;
            background-color: crimson;
            transition-duration: 0.5s;
        }

        table {
            align-content: center;
            background-color: rgba(123, 43, 153, 0.5);
            border: 3px solid;
            margin: 20px;
            padding: 10px;
            border-radius: 4px;
        }
        td {
            border: 2px solid;
            font-size: 25px;
        }
        h1 {
            padding-bottom: 5px;
            border-bottom: dotted;
            font-size: 2em;
        }
        p{
            padding-top: 10px;
            margin-top: 10px;
            font-size: 20px;
        }
        p:hover{
            font-size: 25px;
            transition-duration: 0.5s;
            display: inline-block;
            border: 3px dotted;
        }

    </style>
</head>
<body>
<h1 align="center">Internet Shop</h1>
<table>
    <tr>
        <td>Login</td>
        <td>Cart</td>
        <td>Shop</td>
    </tr>
    <tr>
        <td>
            <button><a href="/login">Login</a></button>
        </td>
        <td>
            <button><a href="/createCart">Cart</a></button>
        </td>
        <td>
            <button><a href="/createShop">Shop</a></button>
        </td>
    </tr>
</table>
<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry.
    Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it
    to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially
    unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with
    desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
</p>
<p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.
    The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here,
    content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem
    Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.
    Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).
</p>

</body>
</html>