package me.larnsio.vizor.commands;

import me.larnsio.vizor.Main;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.concurrent.ThreadLocalRandom;

public class rtpManager {
    Main plugin;
    int waitTime;
    int radiusX;
    int radiusZ;
    public rtpManager(Main plugin){
        this.plugin = plugin;

        waitTime = plugin.getConfig().getInt("teleportWaitTime");
        radiusX = plugin.getConfig().getInt("radius-X");
        radiusZ = plugin.getConfig().getInt("radius-Z");

    }

    public void randomTeleportPlayer(Player p){

    colorizor.sendmessage(p, "&aTeleporting in: " + waitTime);

    new BukkitRunnable(){

        @Override
        public void run(){
            Location location = getRandomLocation(p);
            p.teleport(location);
            colorizor.sendmessage(p, "&2Teleport success!");

        }
    }.runTaskLater(plugin,waitTime);
    }
    private Location getRandomLocation(Player p){
        World world = p.getLocation().getWorld();
        int randomX = ThreadLocalRandom.current().nextInt(-radiusX,radiusX);
        int randomZ = ThreadLocalRandom.current().nextInt(-radiusZ,radiusZ);
        int randomY = world.getHighestBlockYAt(randomX,randomZ);

        return new Location(world, randomX,randomY,randomZ);
    }
}
