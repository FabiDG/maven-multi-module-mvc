<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>This is the homepage!</p>
        <br>
        
<!--         così manca /my-mvc-project ma se ce lo metto, poi lo prende doppio -->

        <form action="processToView">
        	Porzione <input type="text" name="portion"><br>
        	Lingua (ita,eng,fra) <input type="text" name="lang"><br>
        	Iniziale (true,false) <input type="text" name="initial"><br>
        	<input type="submit">
        </form>
        
    </body>
</html>
