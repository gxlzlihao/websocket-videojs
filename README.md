#websocket+videojs
This project implements a simple remote video player. The user can control remote video`s playing through websocket and tomcat server.  The control page is stored in control_panel folder and the video page locates in video_panel folder. Both of them use websocket to interact with the server.

The server is implemented in tomcat, using websocket servlet to distribute the requests. It contains a initialization servlet and a distribution servlet. I f you like, you can also implement the server using Jetty. From Jetty8, websocket servlet is supported in Jetty. From version 7.0.27, tomcat could support websocket servlet. Below is my development tools:

* tomcat-7.0.39
* netbeans-7.3
* MacOs-10.7.5

Hope you enjoy this project! Before you start running this project, dont forget to change the ip address in video page and control page to let them find the server.  