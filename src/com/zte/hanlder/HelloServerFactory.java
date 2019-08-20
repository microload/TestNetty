package com.zte.hanlder;

import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.handler.timeout.IdleStateHandler;
import org.jboss.netty.util.HashedWheelTimer;

public class HelloServerFactory implements ChannelPipelineFactory{
	public ChannelPipeline getPipeline() throws Exception
	{
		//ChannelPipeline pipeline = Channels.pipeline(new IdleStateHandler(new HashedWheelTimer(), 10, 0, 0));
		//pipeline.addLast("helloServerHandler", new HelloServerHandler());
		 return Channels.pipeline(new HelloServerHandler());
		//return pipeline;
	}
	
	
}
