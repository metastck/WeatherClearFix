package dev.metastck.weatherclearfix.events;

import dev.metastck.weatherclearfix.utils.Config;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.util.Random;

public class PlayerCommandPreprocess implements Listener {
    @EventHandler
    public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent e){
        if (e.getMessage().equalsIgnoreCase("/weather clear") && e.getPlayer().isOp()) {
            e.setCancelled(true);
            Random r = new Random();
            int duration = r.nextInt((Config.max - Config.min) + 1) + Config.min;
            Bukkit.getWorld(Config.world).setClearWeatherDuration(duration);
            e.getPlayer().sendMessage("Set the weather to clear");
        }
    }
}
