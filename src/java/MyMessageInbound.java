/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;

import org.apache.catalina.websocket.MessageInbound;
import org.apache.catalina.websocket.WsOutbound;

/**
 *
 * @author gxlzlihao
 */
public class MyMessageInbound extends MessageInbound {
    /**
     *
     * @param arg0
     * @throws IOException
     */
    @Override
    protected void onBinaryMessage(ByteBuffer arg0) throws IOException{
    }
    
    /**
     *
     * @param msg
     * @throws IOException
     */
    @Override
    protected void onTextMessage(CharBuffer msg) throws IOException{
        for(MessageInbound messageInbound : InitServlet.getSocketList()){
            CharBuffer buffer = CharBuffer.wrap(msg);
            WsOutbound outbound = messageInbound.getWsOutbound();
            outbound.writeTextMessage(buffer);
            outbound.flush();
            
            System.out.println("succeed broadcasting a message!!");
        }
    }
    
    /**
     *
     * @param status
     */
    @Override
    protected void onClose(int status){
        InitServlet.getSocketList().remove(this);
        super.onClose(status);
    }
    
    /**
     *
     * @param outbound
     */
    @Override
    protected void onOpen(WsOutbound outbound){
        super.onOpen(outbound);
        InitServlet.getSocketList().add(this);
    }
}
