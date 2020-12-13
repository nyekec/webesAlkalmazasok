<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@page contentType = "text/html;charset = UTF-8 " pageEncoding = "UTF-8" language = "java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
</head>
<style>
fieldset {
border-radius: 10px;
   background: #ccd9ff;
   width: 50%;
}

input[type=text]{
	width: 200px;
}

input[type=number]{
	width: 50px;
}

label {
font-size: 20px;
}

</style>
<body>
<h1>Űrlap</h1>
<form action="/UrlapWZRZNC/addPerson" method="post">
<fieldset>

<label>Név:</label>
<input type="text" name="nev" placeholder="Írd be a neved...">
<br><p></p>
<label>PIN kód:</label>
<input type="text" name="pin" placeholder="Írd be a PIN kódod..." maxlength="4">
<br><p></p>
<label>Kedvenc gyümölcs:</label>
<input type="text" name="gyumolcs" placeholder="Kedvenc gyümölcs...">
<br><p></p>
<label>Életkor:</label>
<input type="text" name="eletkor" placeholder="Tényleges életkor...">
<br><p></p>
<label>Lábméret:</label>
<input type="text" name="labmeret" placeholder="Lábméret...">
<br><p></p>
<label>Önbizalom:</label>
0
<input type="range" value="50" name="onbizalom">
100
<br><p></p>
<input type="submit" value="Elküldöm">

</fieldset>
</form>

</body>
</html>