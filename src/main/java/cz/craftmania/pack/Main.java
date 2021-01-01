package cz.craftmania.pack;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;

    @Override
    public void onEnable() {

        // Instance
        instance = this;
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    public static Main getInstance() {
        return instance;
    }
}
