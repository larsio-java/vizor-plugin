package me.larnsio.vizor.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class bed implements Listener {


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        System.out.println("a player joined the server");
    }

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event){

        Player player = event.getPlayer();
        player.setFoodLevel(1);
        player.setHealth(18);
    }

    @EventHandler
    public void onExpBottleBreak(ExpBottleEvent e){
        e.setShowEffect(false);
    }
}

