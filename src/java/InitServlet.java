/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.catalina.websocket.MessageInbound;

/**
 *
 * @author gxlzlihao
 */
public class InitServlet extends HttpServlet {

    private static List<MessageInbound> socketList;
    
    /**
     *
     * @param config
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig config) throws ServletException{
        InitServlet.socketList = new ArrayList<MessageInbound>();
        super.init(config);
        System.out.println("Server start==================");
    }
    
    public static List<MessageInbound> getSocketList(){
        return InitServlet.socketList;
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
}
