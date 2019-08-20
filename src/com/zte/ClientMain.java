package com.zte;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;

import com.zte.hanlder.ClientFactory;

public class ClientMain
{

	public static void main(String[] args)
	{
		ClientBootstrap bootstrap = new ClientBootstrap(new NioClientSocketChannelFactory(Executors.newCachedThreadPool(), Executors.newCachedThreadPool()));
		SocketAddress socketAddress = new InetSocketAddress("127.0.0.1", 7000);
		bootstrap.setPipelineFactory(new ClientFactory());
		bootstrap.connect(socketAddress);
	}

}
