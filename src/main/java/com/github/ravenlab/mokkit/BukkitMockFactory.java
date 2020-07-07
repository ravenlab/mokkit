package com.github.ravenlab.mokkit;

import java.util.UUID;

import org.mockito.Mockito;

import com.github.ravenlab.mokkit.command.MockBukkitCommandSender;
import com.github.ravenlab.mokkit.command.MockNoCommandBukkitServer;
import com.github.ravenlab.mokkit.entity.MockBukkitPlayer;
import com.github.ravenlab.mokkit.plugin.MockBukkitPlugin;
import com.github.ravenlab.mokkit.server.MockBukkitServer;
import com.github.ravenlab.mokkit.world.MockBukkitWorld;

public class BukkitMockFactory {

	public MockBukkitServer createServer() {
		return Mockito.spy(MockBukkitServer.class);
	}
	
	public MockNoCommandBukkitServer createNoCommandServer() {
		return Mockito.spy(MockNoCommandBukkitServer.class);
	}
	
	public MockBukkitPlugin createPlugin(String name) {
		return Mockito.mock(MockBukkitPlugin.class,
				Mockito.withSettings().useConstructor(name).defaultAnswer(Mockito.CALLS_REAL_METHODS));
	}
	
	public MockBukkitWorld createWorld(String name) {
		return Mockito.mock(MockBukkitWorld.class,
				Mockito.withSettings().useConstructor(name).defaultAnswer(Mockito.CALLS_REAL_METHODS));
	}
	
	public MockBukkitPlayer createPlayer(String name, UUID uuid) {
		return Mockito.mock(MockBukkitPlayer.class, 
				Mockito.withSettings().useConstructor(name, uuid).defaultAnswer(Mockito.CALLS_REAL_METHODS));
	}
	
	public MockBukkitCommandSender createSender(String name) {
		return Mockito.mock(MockBukkitCommandSender.class, 
				Mockito.withSettings().useConstructor(name).defaultAnswer(Mockito.CALLS_REAL_METHODS));
	}
}