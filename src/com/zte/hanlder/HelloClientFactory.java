package com.zte.hanlder;

import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;

public class HelloClientFactory implements ChannelPipelineFactory{
  public ChannelPipeline getPipeline() throws Exception
  {
	  return Channels.pipeline(new HelloClineHandler());
  }
	
	
	
	
}
