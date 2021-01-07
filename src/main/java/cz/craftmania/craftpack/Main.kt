package cz.craftmania.craftpack

import cz.craftmania.craftpack.utils.Logger
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {

    override fun onEnable() {

        // Instance
        instance = this

        debug = this.config.getBoolean("debug", false);

        Logger.success("Plugin byl úspěšně načten.")
    }

    override fun onDisable() {
        instance = null
    }

    companion object {
        var instance: Main? = null
            private set

        var debug: Boolean = false;
    }


}