package me.larnsio.vizor;

import me.larnsio.vizor.commands.*;
import me.larnsio.vizor.listeners.bed;
import me.larnsio.vizor.listeners.joinleavelistener;
import me.larnsio.vizor.listeners.shearsheeplistener;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;


public final class Main extends JavaPlugin implements CommandExecutor, TabCompleter {

    public Plugin waitTime;
    rtpManager rtpManager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        rtpManager = new rtpManager(this);
        System.out.println(ChatColor.GREEN + "Plugin is enabled for the vizor power you need");
     //config VV
       getConfig().options().copyDefaults();
       saveDefaultConfig();






        //all registraties VVVV
        getServer().getPluginManager().registerEvents(new bed(), this);
        getServer().getPluginManager().registerEvents(new shearsheeplistener(), this);
        getServer().getPluginManager().registerEvents(new joinleavelistener(), this);
        getCommand("godmode").setExecutor(new godcommand());
        getCommand("suicide").setExecutor(new suicidecommand());
        getCommand("eat").setExecutor(new feedcommand());
        getCommand("heal").setExecutor(new healcommand());
        //getCommand("menu").setExecutor(new menuCommand());
        getCommand("fly").setExecutor(new flycommand());
        getCommand("armourstand").setExecutor(new Clearcommand());
        getCommand("vanish").setExecutor(new vanish());
        getCommand("rtp").setExecutor(new rtp(this));
        rtpManager = new rtpManager(this);
    } //<---- OnEnable
    @Override
    public void onDisable(){

    }//<---- onDisable

    public me.larnsio.vizor.commands.rtpManager getRtpManager() {
        return rtpManager;
    }
}
