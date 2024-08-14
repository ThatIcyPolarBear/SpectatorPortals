package me.carp.spectatorPortals.listeners;

import me.carp.spectatorPortals.SpectatorPortals;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;

public class PlayerPortalEventListener implements Listener {

    SpectatorPortals plugin;

    public PlayerPortalEventListener(SpectatorPortals plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerPortalEvent(PlayerPortalEvent event) {
        Player player = event.getPlayer();
        if (plugin.isPlayerInPortal(player)) {
            player.setGameMode(org.bukkit.GameMode.SPECTATOR);
        }
    }
}
