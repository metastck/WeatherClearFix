package dev.metastck.weatherclearfix;

import dev.metastck.weatherclearfix.events.PlayerCommandPreprocess;
import dev.metastck.weatherclearfix.events.ServerCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(new PlayerCommandPreprocess(), this);
        Bukkit.getPluginManager().registerEvents(new ServerCommand(), this);
    }
}
