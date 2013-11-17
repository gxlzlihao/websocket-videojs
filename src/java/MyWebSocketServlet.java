/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//packages for WebSocketServlet
import javax.servlet.http.HttpServletRequest;
import org.apache.catalina.websocket.StreamInbound;
import org.apache.catalina.websocket.WebSocketServlet;

/**
 *
 * @author gxlzlihao
 */
public class MyWebSocketServlet extends WebSocketServlet {

    /**
     *
     * @param arg0
     * @return
     */
    protected StreamInbound createWebSocketInbound(String arg0){
        System.out.println("##########");
        return new MyMessageInbound();
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    @Override
    protected StreamInbound createWebSocketInbound(String string, HttpServletRequest hsr) {
        System.out.println("################");
        return new MyMessageInbound();
    }
}
