package me.carp.spectatorPortals;

import me.carp.spectatorPortals.listeners.PlayerInteractEventListener;
import me.carp.spectatorPortals.listeners.PlayerMoveListener;
import me.carp.spectatorPortals.listeners.PlayerPortalEventListener;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public final class SpectatorPortals extends JavaPlugin {
    
    Set<UUID> playersInPortal = new HashSet<>();

    @Override
    public void onEnable() {
        // Plugin startup logic
        PluginManager pluginManager = getServer().getPluginManager();
        pluginManager.registerEvents(new PlayerPortalEventListener(this), this);
        pluginManager.registerEvents(new PlayerMoveListener(this), this);
        pluginManager.registerEvents(new PlayerInteractEventListener(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic 
    }

    public boolean isPlayerInPortal(Player player) {
        return playersInPortal.contains(player.getUniqueId());
    }

    public void removePlayerFromPortal(Player player) {
        player.setGameMode(GameMode.SPECTATOR);
        playersInPortal.remove(player.getUniqueId());
    }

    public void addPlayerToPortal(Player player) {
        player.setVelocity(new Vector(0, 0, 0));
        player.setGameMode(GameMode.CREATIVE);
        playersInPortal.add(player.getUniqueId());
    }
}
