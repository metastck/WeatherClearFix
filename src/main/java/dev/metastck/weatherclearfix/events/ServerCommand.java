package dev.metastck.weatherclearfix.events;

import dev.metastck.weatherclearfix.utils.Config;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerCommandEvent;

import java.util.Random;

public class ServerCommand implements Listener {
    @EventHandler
    public void onServerCommand(ServerCommandEvent e){
        System.out.println(e.getCommand());
        if (e.getCommand().equalsIgnoreCase("weather clear")) {
            e.setCancelled(true);
            Random r = new Random();
            int duration = r.nextInt((Config.max - Config.min) + 1) + Config.min;
            Bukkit.getWorld(Config.world).setClearWeatherDuration(duration);
            e.getSender().sendMessage("Set the weather to clear");
        }
    }
}
