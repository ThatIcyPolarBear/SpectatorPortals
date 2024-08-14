package me.carp.spectatorPortals.listeners;

import me.carp.spectatorPortals.SpectatorPortals;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMoveListener implements Listener {

    SpectatorPortals plugin;

    public PlayerMoveListener(SpectatorPortals plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerMoveEvent(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Material material = player.getEyeLocation().getBlock().getType();
        if (plugin.isPlayerInPortal(player)) {
            if (material != Material.NETHER_PORTAL && material != Material.END_PORTAL && material != Material.END_GATEWAY) {
                plugin.removePlayerFromPortal(player);
            }
        } else {
            if (material == Material.NETHER_PORTAL || material == Material.END_PORTAL || material == Material.END_GATEWAY) {
                if (player.getGameMode() != org.bukkit.GameMode.SPECTATOR) {
                    return;
                }
                plugin.addPlayerToPortal(player);
            }
        }
    }
}
