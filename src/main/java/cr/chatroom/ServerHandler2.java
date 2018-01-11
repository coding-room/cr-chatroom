package cr.chatroom;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

/**
 * @Author TDKnight
 * @Date 2018/1/10
 */
public class ServerHandler2 extends SimpleChannelInboundHandler {

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object msg) throws Exception {
//        ByteBuf in = (ByteBuf) msg;
//        System.out.println(in.toString(CharsetUtil.UTF_8));
//        System.out.println("Yes, A new client in = " + channelHandlerContext.name());
//        System.out.println("Handler2");
    }
}
