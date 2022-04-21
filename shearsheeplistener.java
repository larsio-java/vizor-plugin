package me.larnsio.vizor.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class shearsheeplistener implements Listener {
    @EventHandler
    public void onShearSheep(PlayerShearEntityEvent e){

        Player player = e.getPlayer();
        Entity entity = e.getEntity();

        if (entity.getType() == EntityType.MUSHROOM_COW){
            player.sendMessage(ChatColor.RED + "this is not a sheep");
        e.setCancelled(true);
        }

    }
}
