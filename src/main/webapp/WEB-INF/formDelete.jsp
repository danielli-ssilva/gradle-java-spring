<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Remover Tarefas</title>
</head>
<body>
    <h1>Remover Tarefa</h1>
    <p>Tem certeza que deseja remover a tarefa ${tarefa.descricao} ?</p>
    <form action="/tarefas/delete" method="post">
        <input type="hidden" name="id" value="${tarefa.id}" />
        <button type="submit">Remover</button>
    </form>
</body>
</html>