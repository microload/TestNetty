package com.zte;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;

import com.zte.hanlder.HelloClientFactory;

public class HelloClient {
  public static void main(String[] arg)
  {
	 ClientBootstrap bootstrap = new ClientBootstrap(new NioClientSocketChannelFactory(Executors.newCachedThreadPool(),Executors.newCachedThreadPool()));
	 bootstrap.setPipelineFactory(new HelloClientFactory());
	  bootstrap.connect(new InetSocketAddress("127.0.0.1",8000));
  }
  
	
	
	
}
