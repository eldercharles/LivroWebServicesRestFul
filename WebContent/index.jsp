<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulário</title>
</head>
<body>
       <%// <%  <h1 align="center">Olá, Mundo!!!</h1>   <--- Comentario      %>
       
       
       
       <form method="POST" action="<%=request.getContextPath()%>/hello">  <%  //Action define o caminho da pagina... %>
       Nome: <input type="text" name="nome"/>
       <br/><br />
       Sobrenome: <input type="text" name="sobrenome"/>
       <br />
       <input type="submit" name="Enviar" />
       
       </form> 

</body>
</html>