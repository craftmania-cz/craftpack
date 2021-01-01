package cz.craftmania.pack.api

import org.bukkit.Material

enum class Hats(
        private val id: Int,
        private val itemName: String,
        private val material: Material,
        private val modelData: Int,
        private val inVersion: String) {

    KOALA(1, "§7§lCoala", Material.CARVED_PUMPKIN, 100001, "0.0.2"),
    PANDA(2, "§f§lPanda", Material.CARVED_PUMPKIN, 100002, "0.0.2"),
    HORSE(3, "§6§lHorse", Material.CARVED_PUMPKIN, 100003, "0.0.2");

    fun getName(): String {
        return this.itemName
    }

    fun getMaterial(): Material {
        return this.material
    }

    fun getModelData(): Int {
        return this.modelData
    }

    fun getAddedVersion(): String {
        return this.inVersion;
    }
}