package cz.craftmania.pack

import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {

    override fun onEnable() {

        // Instance
        instance = this
    }

    override fun onDisable() {
        instance = null
    }

    companion object {
        var instance: Main? = null
            private set
    }
}