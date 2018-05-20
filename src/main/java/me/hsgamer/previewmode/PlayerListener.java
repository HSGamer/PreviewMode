package me.hsgamer.previewmode;

import fr.xephi.authme.events.LoginEvent;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerListener implements Listener {
    @EventHandler
    public void onRegistered(LoginEvent e) {
        if (!(e.getPlayer().hasPermission("previewmode.bypass") || e.getPlayer().isOp())) {
            e.getPlayer().setGameMode(GameMode.SPECTATOR);
            e.getPlayer().sendMessage(ChatColor.RED + "You are in Preview Mode");
        }
        else {
            e.getPlayer().sendMessage(ChatColor.GREEN + "You are bypassed PreviewMode. Enjoy your game");
        }
    }
}
