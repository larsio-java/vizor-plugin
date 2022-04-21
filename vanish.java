package me.larnsio.vizor.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class vanish implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

    if (sender instanceof Player p){
        if (p.isInvisible()){
            p.setInvisible(false);
            p.sendMessage(ChatColor.RED + "you are now visible");
        }else {p.setInvisible(true);
                p.sendMessage(ChatColor.GREEN + "You Poofd away");
             }
        }
        return true;
    }
}
