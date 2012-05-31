package com.gmail.dubbiubbi.greentext;

import org.bukkit.plugin.java.JavaPlugin;

public class GreenText extends JavaPlugin {
	@Override
	public void onEnable() {
		this.getLogger().info("GreenText loaded!");
	}

	@Override
	public void onDisable() {
		this.getLogger().info("GreenText unloaded!");
	}
}
