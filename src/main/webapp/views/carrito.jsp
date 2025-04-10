<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="models.Producto" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>POSEIDON STORE | SISE</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<script src="https://unpkg.com/@tailwindcss/browser@4"></script>
</head>

<body>

	<div class="flex gap-4 bg-[rgb(0,180,100)] text-m flex justify-center h-[40px] items-center px-4 py-2">
            <h1 class="font-bold">BIENVENIDOS A POSEIDON Ψ</h1>
    </div>
	
	<header>
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
				<a href="/comercio-electronico/categorias" class="text-ml font-bold p-2 transition duration-300 hover:text-green-400 hover:shadow-sm">Categorias</a>
				<a href="/comercio-electronico/marcas" class="text-ml font-bold p-2 transition duration-300 hover:text-green-400 hover:shadow-sm">Marcas</a>
            	<a href="" class="text-ml font-bold p-2 transition duration-300 hover:text-green-400 hover:shadow-sm">Ofertas</a>
				<a href="" class="text-ml font-bold p-2 transition duration-300 hover:text-green-400 hover:shadow-sm">Vender</a>
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

                <a href="/comercio-electronico/carrito" class="rounded-md cursor-pointer border border-green border-solid"><svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="size-6">
	  					<path stroke-linecap="round" stroke-linejoin="round" d="M2.25 3h1.386c.51 0 .955.343 1.087.835l.383 1.437M7.5 14.25a3 3 0 0 0-3 3h15.75m-12.75-3h11.218c1.121-2.3 2.1-4.684 2.924-7.138a60.114 60.114 0 0 0-16.536-1.84M7.5 14.25 5.106 5.272M6 20.25a.75.75 0 1 1-1.5 0 .75.75 0 0 1 1.5 0Zm12.75 0a.75.75 0 1 1-1.5 0 .75.75 0 0 1 1.5 0Z" />
				</svg></a>

            </div>
        </div>
	</header>
	
</body>
</html>