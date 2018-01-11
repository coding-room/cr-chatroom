package cr.chatroom;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.net.InetSocketAddress;

/**
 * @Author TDKnight
 * @Date 2018/1/10
 */
@Component
public class WebSocketServer {

    @Autowired
    private ServerBootstrap serverBootstrap;

    @Autowired
    private InetSocketAddress tcpSocketAddress;

    private Channel serverChannel;

    public void start() throws Exception {
        ChannelFuture channelFuture = serverBootstrap.bind(tcpSocketAddress).sync();
        serverChannel = channelFuture.channel().closeFuture().sync().channel();
    }

    @PreDestroy
    public void stop() throws Exception {
        serverChannel.close();
        serverChannel.parent().close();
    }
}
