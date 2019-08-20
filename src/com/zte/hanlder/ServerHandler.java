package com.zte.hanlder;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelUpstreamHandler;

public class ServerHandler extends SimpleChannelUpstreamHandler
{
	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception
	{
		String message = (String) e.getMessage();
		System.out.println("server receive:" + message);
		Date now = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");
		message += "	server recive time:" + dateformat.format(now);
		e.getChannel().write(message + "\n");
	}
}
