package cz.craftmania.craftpack.api

import cz.craftmania.craftcore.builders.items.ItemBuilder
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

enum class HandItems (
    private val id: Int,
    private val itemName: String,
    private val material: Material,
    private val modelData: Int,
    private val inVersion: String) {

    EASTER_STICK(1, "§ePpmlázka", Material.STICK, 100001, "1.3.0"),
    KUFR(2, "§eKufr", Material.LIME_DYE, 100001, "1.3.3"),
    BABY_YODA(3, "§eBaby Yoda", Material.LIME_DYE, 100002, "1.3.5"),
    MECHA_FIST(4, "§eMecha Fist", Material.STICK, 100002, "1.4.2"),
    BASEBALL_BAT(5, "§eBaseball Bat", Material.STICK, 100003, "1.4.3"),
    MONKEY_TAIL(6, "§eMonkey Tail", Material.STICK, 100004, "2.0.3");

    fun getItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).setLore("§7Přidáno v: §f" + this.inVersion).build();
    }

    fun getPureItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).build();
    }

}