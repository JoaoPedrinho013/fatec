<?php

$aluno = "Pedro";
$prova = 8;
$trabalho = 9.3;

$media = ($prova*0.7) + ($trabalho*0.3);

echo "<h1>BOLETIM</h1>";
echo "<b>Aluno:</b> " . $aluno . "<br>";
echo "<b>Prova:</b> " . $prova . "<br>";
echo "<b>Trabalho:</b> " . $trabalho . "<br>";
echo "<b>Média:</b> " . $media . "<hr>";

if($media > 5) {
    echo "<b>Status:</b> APROVADO <br>";
} else {
    echo "<b>Status:</b> REPROVADO <br>";
}
?>