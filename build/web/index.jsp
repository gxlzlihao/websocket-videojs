<%-- 
    Document   : index
    Created on : Nov 16, 2013, 5:32:58 PM
    Author     : gxlzlihao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Study WebSocket</title>
        <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
        <script type="text/javascript">
            var ws = null;
            if('WebSocket' in window)
                    ws = new WebSocket("ws://localhost:8080/websocket/mywebsocket.do");
                else if('MozWebSocket' in window)
                    ws = new MozWebSocket("ws://localhost:8080/websocket/mywebsocket.do");
                else
                    alert("web socket not supported!!");
                
                ws.onmessage = function(evt){
                    $("#messages").append("<p>receives and broadcasts message: "+evt.data+"</p>");
                };
                
                ws.onclose = function(evt){
                    alert("close");
                };
                
                ws.onopen = function(evt){
                    alert("open");
                };
        </script>
    </head>
    <body> 
    <center>
        <div id="messages">
            <h1>The messages:</h1>
        </div>
    </center>
    </body>
</html>
