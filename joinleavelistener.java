package me.larnsio.vizor.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class joinleavelistener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        Player player =e.getPlayer();
        if (player.hasPlayedBefore()){

            e.setJoinMessage(ChatColor.AQUA + "welkom terug" + ChatColor.DARK_AQUA + " " + ChatColor.BOLD + player.getDisplayName()+ChatColor.AQUA + "!!!");

        }else{
            e.setJoinMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + player.getDisplayName() + ", " + ChatColor.GREEN + "welkom op de server ");
        }


    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e){

        Player player = e.getPlayer();

        e.setQuitMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.GOLD + "moest gaan waardoor hij de server heeft verlaten");

    }

}
