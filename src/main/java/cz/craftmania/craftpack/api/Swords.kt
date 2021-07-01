package cz.craftmania.craftpack.api

import cz.craftmania.craftcore.spigot.builders.items.ItemBuilder
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

enum class Swords (
    private val id: Int,
    private val itemName: String,
    private val material: Material,
    private val modelData: Int,
    private val inVersion: String) {

    SKYWARD(1, "§bSkyward Sword", Material.NETHERITE_SWORD, 100001, "1.2.0"),
    ENDERITE(2, "§bEnderite Sword", Material.NETHERITE_SWORD, 100002, "1.2.0"),
    KATANA(3, "§bKatana", Material.NETHERITE_SWORD, 100003, "1.2.0"),
    ICE_ROSE_SWORD(4, "§dIce Rose Sword", Material.NETHERITE_SWORD, 100004, "1.3.0"),
    WAKES_SECRET(5, "§bWake's Secret Sword", Material.NETHERITE_SWORD, 100005, "1.3.7"),

    FOREST_SWORD(30, "§aForest Sword", Material.WOODEN_SWORD, 100001, "1.3.7"),

    POMLAZKA(100, "§6Pomlázka", Material.STICK, 100001, "1.3.0");

    fun getItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).setLore("§7Přidáno v: §f" + this.inVersion).build();
    }

    fun getPureItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).build();
    }
}