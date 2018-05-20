package me.hsgamer.previewmode;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class PreviewMode extends JavaPlugin implements Listener {

    private boolean IsEnabled;

    @Override
    public void onEnable() {

        this.saveDefaultConfig();
        IsEnabled = this.getConfig().getBoolean("enabled");

        if (IsEnabled) {
            getServer().getPluginManager().registerEvents(new PlayerListener(), this);
            getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Preview Mode has beed Enabled");
        } else {
            getServer().getConsoleSender().sendMessage(ChatColor.RED + "PreviewMode is disabled. This plugin is useless now");
        }

    }

    @Override
    public void onDisable() {

        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Preview Mode has been Disabled");
        this.saveConfig();

    }

}
