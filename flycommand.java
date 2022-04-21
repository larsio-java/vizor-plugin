package me.larnsio.vizor.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;

public class flycommand implements CommandExecutor {

    private ArrayList<Player> list_of_flying_players = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;
        if (list_of_flying_players.contains(p)) {

            list_of_flying_players.remove(p);

            p.setAllowFlight(false);
            p.sendMessage(ChatColor.DARK_RED + "you cant" + ChatColor.RED + "" +ChatColor.BOLD + " fly " + ChatColor.DARK_RED + "anymore");


        }else if (!list_of_flying_players.contains(p)){


            list_of_flying_players.add(p);
            p.setAllowFlight(true);
            p.sendMessage(ChatColor.BLUE + "you can now "+ ChatColor.AQUA + "" + ChatColor.BOLD + "fly");

                 }
             }
        return true;
    }
}
