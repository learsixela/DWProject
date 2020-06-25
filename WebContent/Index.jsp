<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hola Clase 20200624</h1>
    <form action="clase" method="GET">
    	<input type= "text" value="" name="nombre" id="nombre">
        <button type="submit">Llamado al Metodo Get</button>
    </form>
    <br>
    <form action="clase" method="POST">
    	<input type= "text" value="" name="apellido" id="apellido">
        <button type="submit">LLamado al Metodo Post</button>
    </form>
    
    <form action="Index.jsp" method="POST">
    	<h3>LLAMADO AL JSP POST</h3>
    	<p>Filas: </p><input type= "text" value="" name="filas" id="filas"> <br>
    	<p>Columnas: </p><input type= "text" value="" name="columnas" id="columnas"><br>
        <button type="submit">Enviar</button>
    </form>
    <% 
    	String sFila = request.getParameter("filas");
    	String scolumnas = request.getParameter("columnas");
    	
    	int iColumnas =0;
    	int iFilas =0;
    
    	if(null != sFila && !sFila.equals("")){
    		 iFilas = Integer.parseInt(sFila.toString().trim()); 
    	}
    	if(null != scolumnas && !scolumnas.equals("")){
    		 iColumnas = Integer.parseInt(scolumnas.toString().trim()); 
    	}
    %>
    
    <p>total de filas: <%= iFilas %></p>
     <p>total de columnas: <%= iColumnas %></p>
    
    
</body>
</html>