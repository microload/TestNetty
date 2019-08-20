package com.zte.hanlder;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelUpstreamHandler;

public class ClientHandler extends SimpleChannelUpstreamHandler
{
	@Override
	public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception
	{
		String message = "I am Client....\n";
		e.getChannel().write(message);

	}

	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception
	{
		String receiveMessage = (String) e.getMessage();
		System.out.println("client receive: " + receiveMessage);
	}
}
