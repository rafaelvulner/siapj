<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="/resources/css/bootstrap.css" rel="stylesheet"
	type="text/css" />
<link href="/resources/css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>

	<div class="container">

		<div class="formulario col-md-6">
			<form action="formulario" enctype='multipart/form-data' method="post">

				<div class="form-group">
					Nome: <input type="text" id="nome" name="nomeReclamante" class="form-control" />

				</div>

				<div class="form-group">
					Processo: <input type="file" id="processo" name="processo"
						class="" accept=".pdf"/>
				</div>

				<div class="form-group">
					Telefone: <input type="text" id="telefone" name="telefone"
						class="form-control" />
				</div>

				<div class="form-group">
					E-mail: <input type="email" id="email" name="email"
						class="form-control" />
				</div>
				
				<button type="submit" class="btn btn-primary"> Enviar</button>
			</form>

		</div>
	</div>
</body>
</html>