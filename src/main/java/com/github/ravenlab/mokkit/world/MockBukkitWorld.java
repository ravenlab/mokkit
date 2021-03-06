package com.github.ravenlab.mokkit.world;

import org.bukkit.World;

public abstract class MockBukkitWorld implements World {

	private String name;
	
	public MockBukkitWorld(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}