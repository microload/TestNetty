package com.zte.hanlder;



import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelUpstreamHandler;

public class HelloServerHandler extends SimpleChannelUpstreamHandler{
	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception
	{
		System.out.println("Hello world, I'm server.");
	}
    @Override
    public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e)
    {
    System.out.println("Hello world, I'm server.");
    }
}
