package com.zte;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;

import com.zte.hanlder.ServerFactory;

public class ServerMain
{
	private static final int port = 7000;

	public static void main(String[] args)
	{
		ServerBootstrap serverBootstrap = new ServerBootstrap(new NioServerSocketChannelFactory(Executors.newCachedThreadPool(), Executors.newCachedThreadPool()));
		serverBootstrap.setPipelineFactory(new ServerFactory());
		serverBootstrap.setOption("child.tcpNoDelay", "true");
		serverBootstrap.setOption("child.keepAlive", "true");
		serverBootstrap.bind(new InetSocketAddress(port));

	}

}
