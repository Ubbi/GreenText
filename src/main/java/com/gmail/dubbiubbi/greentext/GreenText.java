package com.gmail.dubbiubbi.greentext;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class GreenText extends JavaPlugin implements Listener {
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);

		this.getLogger().info("GreenText loaded!");
	}

	@Override
	public void onDisable() {
		this.getLogger().info("GreenText unloaded!");
	}

	@EventHandler
	public void onPlayerChat(PlayerChatEvent event) {
		String message = event.getMessage();
		message = ChatColor.GREEN + message;
		event.setMessage(message);
	}
}
