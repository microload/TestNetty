package com.zte.hanlder;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

public class HelloClineHandler extends SimpleChannelHandler{
@Override
public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e)
{
	System.out.println("Hellow world, I'm client.");
	
}
	
	
}
