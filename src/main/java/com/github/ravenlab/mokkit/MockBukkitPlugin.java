package com.github.ravenlab.mokkit;

import org.bukkit.plugin.Plugin;

public abstract class MockBukkitPlugin implements Plugin {

	private String name;
	public MockBukkitPlugin(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}