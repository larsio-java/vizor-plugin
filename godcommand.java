package me.larnsio.vizor.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class godcommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

       if(sender instanceof Player){
           Player p = (Player) sender;

           if (p.isInvulnerable()){

               p.setInvulnerable(false);
               p.sendMessage(ChatColor.DARK_RED + "God mode disabled");

           }else{

               p.setInvulnerable(true);
               p.sendMessage(ChatColor.DARK_GREEN + "God mode enabled");

           }
       }

        return true;
    }
}
