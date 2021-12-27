package dev.metastck.weatherclearfix.utils;

import dev.metastck.weatherclearfix.Main;
import org.bukkit.configuration.file.FileConfiguration;

public class Config {
    public static int max;
    public static int min;
    public static String world;

    static{
        FileConfiguration config = Main.getPlugin(Main.class).getConfig();
        max = config.getInt("weather-duration.max");
        min = config.getInt("weather-duration.min");
        world = config.getString("main-world");
    }
}
