<%@page contentType = "text/html;charset = UTF-8" pageEncoding = "UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>A kitöltött adatok</h2>
      <table>
         <tr>
            <td>Név:</td>
            <td>${nev}</td>
         </tr>
         <tr>
            <td>PIN Kód:</td>
            <td>${pin}</td>
         </tr>
         <tr>
            <td>Kedvenc Gyümölcs:</td>
            <td>${gyumolcs}</td>
         </tr>
          <tr>
            <td>Életkor:</td>
            <td>${eletkor}</td>
         </tr>
          <tr>
            <td>Lábméret:</td>
            <td>${labmeret}</td>
         </tr>
          <tr>
            <td>Önbizalom:</td>
            <td>${onbizalom}</td>
         </tr>
      </table>  
   </body>
   
</html>