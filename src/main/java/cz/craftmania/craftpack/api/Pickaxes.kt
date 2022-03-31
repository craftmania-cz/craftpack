package cz.craftmania.craftpack.api

import cz.craftmania.craftcore.builders.items.ItemBuilder
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

enum class Pickaxes (
    private val id: Int,
    private val itemName: String,
    private val material: Material,
    private val modelData: Int,
    private val inVersion: String) {

    ICE_ROSE_PICKAXE(1, "§dIce Rose Pickaxe", Material.NETHERITE_PICKAXE, 100001, "1.3.0"),
    GINGER_PICKAXE(2, "§6Ginger Pickaxe", Material.NETHERITE_PICKAXE, 100002, "1.4.3"),
    PLANT_SET_PICKAXE(3, "§aPlant Set Pickaxe", Material.NETHERITE_PICKAXE, 100003, "1.4.5"),
    BANANA_PICKAXE(4, "§eBanana Pickaxe", Material.NETHERITE_PICKAXE, 100004, "2.0.3");

    fun getItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).setLore("§7Přidáno v: §f" + this.inVersion).build();
    }

    fun getPureItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).build();
    }
}