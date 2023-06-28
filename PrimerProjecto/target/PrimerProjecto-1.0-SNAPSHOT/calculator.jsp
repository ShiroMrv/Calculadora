<%-- 
    Document   : calculator
    Created on : 28 jun. 2023, 15:03:36
    Author     : kuron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
    <title>Calculadora</title>
</head>
    <body class="bg-dark text-light">
        <div class="container text-center">
        <h1 class="container text-center p-4">Calculadora</h1>
        <form action="calculator" method="post">
            <label for="num1" class="container p-3">Numero 1:</label>
            <input type="text" name="num1" id="num1" class="form-control-sm"> <br>
            
            <label for="num2" class="container p-3">Numero 2:</label>
            <input type="text" name="num2" id="num2" class="form-control-sm"> <br>
            
            <label for="operator" class="container p-3">Operador:</label>
            <select name="operator" id="operator" class="form-select-sm  mb-3">
                <option value="add">Sumar</option>
                <option value="subtract">Restar</option>
                <option value="multiply">Multiplicar</option>
                <option value="divide">Dividir</option>
            </select><br>
            
            <input class="btn btn-primary" type="submit" value="Calcular">
            </form>
        
        <h2 class="container p-5">Resultado: ${result} </h2>

        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
    </body>
</html>
