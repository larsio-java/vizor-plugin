package me.larnsio.vizor.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class feedcommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;

            p.setFoodLevel(20);
            p.sendMessage(ChatColor.DARK_GREEN + "" +ChatColor.BOLD + "your hunger bar is filled");

        }

        return true;
    }
}
