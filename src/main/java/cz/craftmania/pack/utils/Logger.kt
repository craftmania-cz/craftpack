package cz.craftmania.pack.utils

import cz.craftmania.pack.Main
import org.bukkit.Bukkit
import org.bukkit.ChatColor

class Logger {

    companion object {

        fun info(text: String) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW.toString() + "[CraftPack] " + ChatColor.WHITE + text)
        }

        fun danger(text: String) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW.toString() + "[CraftPack] " + ChatColor.RED + text)
        }

        fun success(text: String) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW.toString() + "[CraftPack] " + ChatColor.GREEN + text)
        }

        fun debug(text: String) {
            if (Main.debug) {
                Bukkit.getConsoleSender()
                    .sendMessage(ChatColor.BLUE.toString() + "[DEBUG - CraftPack] " + ChatColor.WHITE + text)
            }
        }
    }
}