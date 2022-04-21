package me.larnsio.vizor.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class suicidecommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // /suicide - kills the player


            if(sender instanceof Player){

                Player p =(Player) sender;
                p.setHealth(0.0);
                p.sendMessage(ChatColor.DARK_RED + "your dead now please be careful next time ");
            }



        return true;
    }
}

