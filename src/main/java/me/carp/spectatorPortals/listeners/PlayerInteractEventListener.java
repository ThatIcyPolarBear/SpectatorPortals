package me.carp.spectatorPortals.listeners;

import me.carp.spectatorPortals.SpectatorPortals;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteractEventListener implements Listener {

    SpectatorPortals plugin;

    public PlayerInteractEventListener(SpectatorPortals plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (plugin.isPlayerInPortal(player)) {
            event.setCancelled(true);
        }
    }
}
