package com.zte;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;


import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;

import com.zte.hanlder.HelloServerFactory;

public class HelloServer {

	public static void main(String[] arg)
	{
		ServerBootstrap bootstrap = new ServerBootstrap(new NioServerSocketChannelFactory(Executors.newCachedThreadPool(),Executors.newCachedThreadPool()));
		bootstrap.setPipelineFactory(new HelloServerFactory());
		bootstrap.bind(new InetSocketAddress(8000));
	}


}



