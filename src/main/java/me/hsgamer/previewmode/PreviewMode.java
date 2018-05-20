package me.hsgamer.previewmode;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class PreviewMode extends JavaPlugin implements Listener {

    public boolean IsEnabled;

    @Override
    public void onEnable() {

        this.saveDefaultConfig();
        IsEnabled = this.getConfig().getBoolean("enabled");

        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Preview Mode has beed Enabled");

    }

    @Override
    public void onDisable() {

        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Preview Mode has been Disabled");
        this.saveConfig();

    }

}
