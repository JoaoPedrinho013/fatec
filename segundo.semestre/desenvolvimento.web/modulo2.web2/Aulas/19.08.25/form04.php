<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 19/08/25 | Form 02</title>

</head>

<body>

    <form action="#" method="post">
        <label for="">Valor 1:</label>
        <input type="text" name="txtvalor1">
        <br><br>
        <label for="">Valor 2:</label>
        <input type="text" name="txtvalor2">
    <br><br>
        <input type="submit" value="Somar" name="btnsoma">
        <input type="submit" value="Multiplicar" name="btnmulti">
    </form>
</body>

</html>


<?php
if ($_SERVER["REQUEST_METHOD"] === "POST") {
    
    $valor1 = $_POST["txtvalor1"];
    $valor2 = $_POST["txtvalor2"];

    if (isset($_POST["btnsoma"])) {
        echo "Soma: " . $valor1 + $valor2;
    }
    if (isset($_POST["btnmulti"])) { 
        echo "Multiplicação: " . $valor1 * $valor2;
    }





}
?>