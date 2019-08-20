package com.zte.hanlder;

import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.handler.codec.frame.DelimiterBasedFrameDecoder;
import org.jboss.netty.handler.codec.frame.Delimiters;
import org.jboss.netty.handler.codec.string.StringDecoder;
import org.jboss.netty.handler.codec.string.StringEncoder;
import org.jboss.netty.handler.timeout.IdleStateHandler;
import org.jboss.netty.util.HashedWheelTimer;

public class ServerFactory implements ChannelPipelineFactory
{

	public ChannelPipeline getPipeline() throws Exception
	{
		ChannelPipeline pipeline = Channels.pipeline(new IdleStateHandler(new HashedWheelTimer(), 10, 0, 0));
		pipeline.addLast("frameDecoder", new DelimiterBasedFrameDecoder(100 * 1024 * 1024, Delimiters.lineDelimiter()));
		pipeline.addLast("StringEncoder", new StringEncoder());
		pipeline.addLast("StringDecoder", new StringDecoder());
		pipeline.addLast("serverHandler", new ServerHandler());
		return pipeline;
	}

}
