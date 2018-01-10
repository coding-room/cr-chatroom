package cr.chatroom;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import org.springframework.stereotype.Component;


/**
 * 设置各种Handler
 *
 * @Author TDKnight
 * @Date 2018/1/10
 */
@Component
public class NettyWebSocketChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {

    }

}
