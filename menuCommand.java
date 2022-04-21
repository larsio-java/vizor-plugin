package me.larnsio.vizor.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class menuCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


            Player p = (Player) sender;


            Inventory I1 = Bukkit.createInventory(p, 9, ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "TEST");
            ItemStack item = new ItemStack(Material.DIAMOND_AXE, 1);
            ItemMeta IM = item.getItemMeta();


            IM.setDisplayName(ChatColor.GREEN + "CLICK ME");
            item.setItemMeta(IM);
            I1.setItem(0, item);

            p.openInventory(I1);

            return false;
    }}