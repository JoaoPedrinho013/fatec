<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 19/08/25 | Form 02</title>

</head>

<body>

    <form action="#" method="post">
        <label for="">Nome: </label>
        <input type="text" name="txtnome">
        <label for="">Sobrenome: </label>
        <input type="text" name="txtsobrenome">
        <input type="submit" value="Enviar">
    </form>
</body>

</html>


<?php
if ($_SERVER["REQUEST_METHOD"] === "POST") {
    $nome = $_POST["txtnome"] ?? "";
    $sobrenome = $_POST["txtsobrenome"] ?? "";

    echo "Olá, $nome $sobrenome";
}
?>