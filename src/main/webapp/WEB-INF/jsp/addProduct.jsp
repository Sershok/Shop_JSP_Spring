<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Shop</title>
    <style type="text/css">
        body {
            background: rgba(32, 54, 45, 0.6);
            font-family: "Arial";
        }

        button {
            position: center;
            border-radius: 15px;
            background: burlywood;
            font-size: 20px;
        }

        h1 {
            padding-bottom: 5px;
            border-bottom: dotted;
            font-size: 2em;
        }

        p {
            padding-top: 10px;
            margin-top: 10px;
            font-size: 20px;
        }
    </style>
</head>
<body>
<h1 align="center">Product</h1><br>
<h3>Add Product</h3>
<button class="a"><a href="/product/create">Product</a></button>
<h3>View Products</h3>
<button class="a"><a href="/product/productList">Product List</a></button>
<h3>View Products</h3>
<button class="a"><a href="/product/delete">Product Delete</a></button>
<br>

<h1 align="center"> Cart</h1><br>
<h3>Add Product from Shop </h3>
<button class="b"><a href="/shop/add_product">Shop</a></button>
<h3>View Shop</h3>
<button class="b"><a href="/shop/get">Shop List</a></button>
<h3>Create Shop</h3>
<button class="b"><a href="/shop/create">Shop Create</a></button>
</body>
</html>