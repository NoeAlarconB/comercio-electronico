<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="models.Categoria" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>POSEIDON STORE | SISE</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<script src="https://unpkg.com/@tailwindcss/browser@4"></script>
</head>
<body>
	<header>
		<div class="flex gap-4 bg-green-100 justify-center h-[60px] items-center">
		    <a href="/comercio-electronico" class="h-auto hover:bg-green-700 p-2 rounded-md cursor-pointer  ">Inicio</a>
		    <a href="/comercio-electronico/categorias" class="h-auto hover:bg-green-700 p-2 rounded-md cursor-pointer border border-black border-solid">Categorias</a>
		    <a class="h-auto hover:bg-green-700 p-2 rounded-md cursor-pointer ">Marcas</a>
	 </div>
	</header>
	
	<main class="p-4">
		<div class="flex w-full justify-center p-4 gap-8 flex-wrap">
			<%
				List<Categoria> categorias = (List<Categoria>) request.getAttribute("categorias");
				if (categorias != null && !categorias.isEmpty()) {
					for(Categoria categoria: categorias) {
			%>		
			<div class="flex bg-gray-200 w-[200px] justify-center flex-col p-4 gap-2 items-center rounded-md border border-gray-300 border-solid hover:border-green-600 cursor-pointer">
				<img class="rounded-sm" src="<%= categoria.getImagenUrl()%>" width="150px">
				<p class="text-center font-bold text-gray-600"><%= categoria.getNombre() %></p>
			</div>
			<% 	} %>			
			<%	} else { %>
				<p>No se encontraron registros</p>
			<% } %>
		</div>
		
	</main>

</body>
</html>