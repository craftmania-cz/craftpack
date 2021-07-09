package cz.craftmania.craftpack.api

import cz.craftmania.craftcore.builders.items.ItemBuilder
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

enum class Bows (
    private val id: Int,
    private val itemName: String,
    private val material: Material,
    private val modelData: Int,
    private val inVersion: String) {

    FOREST(1, "§aForest Bow", Material.BOW, 100001, "1.3.7");

    fun getItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).setLore("§7Přidáno v: §f" + this.inVersion).build();
    }

    fun getPureItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).build();
    }

}