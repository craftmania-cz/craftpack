package cz.craftmania.craftpack.api

import cz.craftmania.craftcore.builders.items.ItemBuilder
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
    LIGHTSABER_RED(6, "§cLightsaber: Red", Material.NETHERITE_SWORD, 100006, "1.4.0"),
    SCYTHE(7, "§eScythe", Material.NETHERITE_SWORD, 100007, "1.4.1"),
    SCORPION(8, "§eScorpion Sword", Material.NETHERITE_SWORD, 100008, "1.4.2"),
    FROST_SWORD(9, "§bFrost Sword", Material.NETHERITE_SWORD, 100009, "1.4.3"),
    PLANT_SET_SWORD(10, "§aPlant Set Sword", Material.NETHERITE_PICKAXE, 100010, "1.4.5"),

    FOREST_SWORD(30, "§aForest Sword", Material.WOODEN_SWORD, 100001, "1.3.7"),

    MECHA_SWORD(50, "§aMecha Sword", Material.IRON_SWORD, 100001, "1.4.5"),

    POMLAZKA(100, "§6Pomlázka", Material.STICK, 100001, "1.3.0");

    fun getItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).setLore("§7Přidáno v: §f" + this.inVersion).build();
    }

    fun getPureItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).build();
    }
}