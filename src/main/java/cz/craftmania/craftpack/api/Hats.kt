package cz.craftmania.craftpack.api

import cz.craftmania.craftcore.spigot.builders.items.ItemBuilder
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

enum class Hats(
     private val id: Int,
     private val itemName: String,
     private val material: Material,
     private val modelData: Int,
     private val inVersion: String) {

    KOALA(1, "§7Coala", Material.CARVED_PUMPKIN, 100001, "1.0.0"),
    PANDA(2, "§fPanda", Material.CARVED_PUMPKIN, 100002, "1.0.0"),
    HORSE(3, "§6Horse", Material.CARVED_PUMPKIN, 100003, "1.0.0"),
    CLOWN(4, "§dClow", Material.CARVED_PUMPKIN, 100004, "1.0.2"),
    LAST_BREATH(5, "§bLast Breath", Material.CARVED_PUMPKIN, 500000, "1.0.2");

    fun getItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).setLore("§7Přidáno v: §f" + this.inVersion).build();
    }

    fun getPureItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).build();
    }
}