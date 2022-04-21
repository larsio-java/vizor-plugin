package me.larnsio.vizor.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class colorizor {

    public static void sendmessage(Player p, String str){
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', str));

    }

}
