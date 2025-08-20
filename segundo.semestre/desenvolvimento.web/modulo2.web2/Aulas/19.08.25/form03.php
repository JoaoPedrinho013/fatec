<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 19/08/25 | Form 02</title>

</head>

<body>

    <form action="#" method="post">
        <label for="">Aluno: </label>
        <input type="text" name="txtaluno">
        <br><br>
        <label for="">Curso: </label>
        <input type="radio" name="rdcurso" value="ADS">ADS
        <input type="radio" name="rdcurso" value="DSM">DSM
        <br><br>
        <label for="">Período</label>
        <select name="sltperiodo" id="">
            <option value="Vespertino">Vespertino</option>
            <option value="Noturno">Noturno</option>
        </select>
        <br><br>
        <label for="">Ciclos Concluidos: </label>
        <input type="checkbox" name="ciclos[]" value="1">1°
        <input type="checkbox" name="ciclos[]" value="2">2°
        <input type="checkbox" name="ciclos[]" value="3">3°
        <input type="checkbox" name="ciclos[]" value="4">4°
        <input type="checkbox" name="ciclos[]" value="5">5°
        <input type="checkbox" name="ciclos[]" value="6">6°
    <br><br>
        <input type="submit" value="Enviar">
    </form>
</body>

</html>


<?php
if ($_SERVER["REQUEST_METHOD"] === "POST") {
    $aluno = $_POST["txtaluno"];
    $curso = $_POST["rdcurso"];
    $periodo = $_POST["sltperiodo"];
    $ciclos = $_POST["ciclos"];


    echo "<br><br><br>";
    echo "Aluno: $aluno";
    echo "<br>";
    echo "Curso: $curso";
    echo "<br>";
    echo "Período: $periodo";
    echo "<br>";
    echo "Ciclos concluidos: ";
     foreach ($ciclos as $ciclo) {
        echo $ciclo . ", ";
        
    };
}
?>