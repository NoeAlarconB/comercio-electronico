<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="models.Subcategoria" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>POSEIDON STORE | SISE</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<script src="https://unpkg.com/@tailwindcss/browser@4"></script>
</head>
<body>
	
	<div class="flex gap-4 bg-[rgb(0,200,110)] text-m flex justify-center h-[40px] items-center px-4 py-2">
            <h1 class="font-bold">BIENVENIDOS A POSEIDON Ψ</h1>
    </div>
    
	<%
		List<Subcategoria> subcategorias = (List<Subcategoria>) request.getAttribute("subcategorias");
	%>
	
	<header class="sticky top-0 bg-white shadow-md z-50">
			<div class="bg-[rgb(0,180,100)] h-0.5">
	    	</div>
		<div class="container mx-auto flex justify-between h-[75px] items-center">
            <div class="flex items-center space-x-3">
                <img src="https://images.squarespace-cdn.com/content/v1/5ee9d957b8c54e3c6056b014/1594124926985-D05H8VK3E4T8WL8XHAHL/2-01.png" 
                     class="h-25">
                <div>
                    <p class="text-lg font-bold">Poseidon</p>
                    <p class="text-lm font-bold">Store</p>
                </div>
            </div>

            <div class="flex space-x-6 text-sm uppercase font-semibold">
            	<a href="/comercio-electronico" class="text-ml font-bold p-2 transition duration-300 hover:text-green-400 hover:shadow-sm">Inicio</a>
				<a href="/comercio-electronico/categorias" class="text-ml font-bold p-2 transition duration-300 hover:text-green-400 hover:shadow-sm rounded-md cursor-pointer border border-green border-solid">Categorias</a>
				<a href="/comercio-electronico/marcas" class="text-ml font-bold p-2 transition duration-300 hover:text-green-400 hover:shadow-sm">Marcas</a>
            </div>

            <div class="flex space-x-4 text-lg">
                <div class="flex items-center space-x-1">
                    <img src="https://upload.wikimedia.org/wikipedia/commons/5/50/Flag_of_Peru_Bandera_del_Per%C3%BA_B.png?20080710185009" 
                         class="h-4">
                    <p class="text-sm">PE</p>
                </div>
                <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="size-6">
                	<path stroke-linecap="round" stroke-linejoin="round" d="m21 21-5.197-5.197m0 0A7.5 7.5 0 1 0 5.196 5.196a7.5 7.5 0 0 0 10.607 10.607Z" />
                </svg>
                
                <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="size-6">
                	<path stroke-linecap="round" stroke-linejoin="round" d="M15.75 6a3.75 3.75 0 1 1-7.5 0 3.75 3.75 0 0 1 7.5 0ZM4.501 20.118a7.5 7.5 0 0 1 14.998 0A17.933 17.933 0 0 1 12 21.75c-2.676 0-5.216-.584-7.499-1.632Z" />
                </svg>

                <a href="/comercio-electronico/carrito"><svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="size-6">
	  					<path stroke-linecap="round" stroke-linejoin="round" d="M2.25 3h1.386c.51 0 .955.343 1.087.835l.383 1.437M7.5 14.25a3 3 0 0 0-3 3h15.75m-12.75-3h11.218c1.121-2.3 2.1-4.684 2.924-7.138a60.114 60.114 0 0 0-16.536-1.84M7.5 14.25 5.106 5.272M6 20.25a.75.75 0 1 1-1.5 0 .75.75 0 0 1 1.5 0Zm12.75 0a.75.75 0 1 1-1.5 0 .75.75 0 0 1 1.5 0Z" />
				</svg></a>

            </div>
        </div>
	</header>
	
	<main class="p-4">
		<div class="flex w-full justify-center p-4 gap-4 flex-wrap">
			<% if (subcategorias != null && !subcategorias.isEmpty()) { %>
				<% for(Subcategoria subcategoria: subcategorias) { %>
					<a href="/comercio-electronico/productos?idSubcategoria=<%= subcategoria.getIdSubcategoria() %>" 
					class="flex bg-gray-200 hover:scale-103 transition transform duration-300 w-[200px] 
						   justify-center flex-col p-4 gap-2 items-center rounded-md border border-gray-300 
						   border-solid hover:border-green-600 cursor-pointer">
						<img class="rounded-sm" src="<%= subcategoria.getImagenUrl() %>" width="150px">
						<span class="text-center font-bold text-gray-600"><%= subcategoria.getNombre() %></span>
					</a>
				<% 	} %>
			<%	} else { %>
				<p>No se encontraron registros</p>
			<% } %>
		</div>
		
		<% if (subcategorias != null && !subcategorias.isEmpty()) { %>
		<% } %>
		
	</main>
	
	<div class="h-20"></div>
	
	<footer class="bg-[rgb(0,45,40)] text-white p-8">
			<div class="mx-auto w-full max-w-screen-xl">
				<div class="grid grid-cols-2 gap-5 pb-9 px-4 py-6 md:grid-cols-4">
					<div>
						<h1 class="flex w-full px-4 font-bold text-lg">Comprar</h1>
						<ul class="flex w-full p-4 gap-1 flex-wrap justify-center flex-col font-medium text-gray-600">
							<li><a href="" class="hover:underline">Como hacer un pedido </a></li>
							<li><a href="" class="hover:underline">Envíos y devoluciones </a></li>
							<li><a href="" class="hover:underline">Rastrear mi pedido</a></li>
							<li><a href="" class="hover:underline">Mi cuenta</a></li>
							<li><a href="" class="hover:underline ">Localizador de tiedas</a></li>
						</ul>
					</div>
					
					<div>
						<h1 class="flex w-full px-4 font-bold text-lg" >Acerca de</h1>
						<ul class="flex w-full p-4 gap-1 flex-wrap justify-center flex-col font-medium text-gray-600">
							<li><a href="" class="hover:underline">Política de privacidad</a></li>
							<li><a href="" class="hover:underline">Política de Cookies</a></li>
							<li><a href="" class="hover:underline">Terminos y Condiciones</a></li>
							<li><a href="" class="hover:underline">Configuracion de Cookies</a></li>
						</ul>
					</div>
					
					<div>
						<h1 class="flex w-full px-4 font-bold text-lg">¿Necesitas ayuda?</h1>
						<ul class="flex w-full p-4 gap-1 flex-wrap justify-center flex-col font-medium text-gray-600">
							<li><a href="" class="hover:underline">Contáctenos</a></li>
							<li><a href="" class="hover:underline">Preguntas Frecuentes</a></li>
						</ul>
					</div>
					
					<div>
						<h1 class="flex w-full px-4 font-bold text-lg">Redes Sociales</h1>
						<ul class="flex w-full p-4 gap-1 flex-wrap justify-center flex-col font-medium text-gray-600">
							<li><a href="" class="hover:underline">Facebook</a></li>
							<li><a href="" class="hover:underline">Instagram</a></li>
							<li><a href="" class="hover:underline">Youtube</a></li>
							<li><a href="" class="hover:underline">Tiktok</a></li>
							<li><a href="" class="hover:underline">x</a></li>
						</ul>
					</div>
				</div>
				
				<div class="text-center my-6">
			      <h3 class="font-bold text-xl">Descarga la aplicación ahora</h3>
			      <div class="flex justify-center gap-4 mt-4">
			        <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/91/Download_on_the_App_Store_RGB_blk.svg/2560px-Download_on_the_App_Store_RGB_blk.svg.png" alt="App Store" class="h-10">
			        <img src="https://www.drii.usach.cl/sites/drii/files/disponible-en-google-play-badge-2.png" alt="Google Play" class="h-10">
			        <img src="https://static-00.iconduck.com/assets.00/app-huawei-uk-icon-2048x614-y4lce193.png" alt="App Gallery" class="h-10">
			      </div>
			    </div>
			    
			     <div class="text-left my-6 ml-6">
			     	<h3 class="font-bold text-xl">Métodos de pago</h3>
			      	<div class="flex justify-start gap-4 mt-4">
			      		<img src="https://images.ctfassets.net/7nqb12anqb19/2WIAQowqokoIaJB6cvZXYD/348b37f3de99b90130122a9734032617/visa.svg">
						<img src="https://images.ctfassets.net/7nqb12anqb19/Ehc1Aj2RtAoa0JgXplUNQ/0c7048761173428efe3393402030db5f/amex.svg">			        	
						<img src="https://images.ctfassets.net/7nqb12anqb19/42z59fhQdTVjPxNlJtSYsp/941ec2e2464ad1fe2473a746b8e4345b/applePay.svg">			       		
						<img src="https://images.ctfassets.net/7nqb12anqb19/4XnCHtLvce9mL5lawnxLqU/2a27776093c876f2f043fdfcfb5218a8/dinersClub.svg">			      		
						<img src="https://images.ctfassets.net/7nqb12anqb19/6oOOvbAEhxMIeNpGkiVduk/c7db0d77b710e3be91edcb6c39a30635/discover.svg">
			    	    <img src="https://images.ctfassets.net/7nqb12anqb19/12eMt1ehopmWkECRNusO4H/7585dbbad063aabb6e23ab0a49bd9c2c/googlePay.svg">
				        <img src="https://images.ctfassets.net/7nqb12anqb19/4p9uD5dLB0vG4E77tUNqSy/b3e2f21d24eacbb6c05b9524cbe7825f/maestro.svg">
				        <img src="https://images.ctfassets.net/7nqb12anqb19/6nK1eMkcOSI0Y9SNZbJWoW/33625360fd95888800c9ab104f32d824/mastercard.svg">
				        <img src="https://images.ctfassets.net/7nqb12anqb19/2SaozX3rAX8xlxccWUsea9/69c89907fd9f946892abf38b5e169073/unionPay.svg">
			      </div>
			    </div>
				
				<div class="px-4 py-4 md:flex md:items-center md:justify-between">
			        <span class="text-sm sm:text-center">Poseidón Store | © 2025 Todos los derechos reservados.</span>
			    </div>
			</div>
		</footer>
	
</body>
</html>





