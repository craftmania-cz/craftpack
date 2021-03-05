package cz.craftmania.craftpack.api

import cz.craftmania.craftcore.spigot.builders.items.ItemBuilder
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

enum class Furniture (
    private val id: Int,
    private val itemName: String,
    private val material: Material,
    private val modelData: Int,
    private val inVersion: String) {

    // Stool
    STOOL_BLACK(100, "§eBlack Stool", Material.SCUTE, 100000, "1.2.0"),
    STOOL_BLUE(101, "§eBlue Stool", Material.SCUTE, 100001, "1.2.0"),
    STOOL_LIME(102, "§eLime Stool", Material.SCUTE, 100002, "1.2.0"),
    STOOL_ORANGE(103, "§eOrange Stool", Material.SCUTE, 100003, "1.2.0"),
    STOOL_PINK(104, "§ePink Stool", Material.SCUTE, 100004, "1.2.0"),
    STOOL_PURPLE(105, "§ePurple Stool", Material.SCUTE, 100005, "1.2.0"),
    STOOL_RED(106, "§eRed Stool", Material.SCUTE, 100006, "1.2.0"),
    STOOL_WHITE(107, "§eWhite Stool", Material.SCUTE, 100007, "1.2.0"),
    STOOL_YELLOW(108, "§eYellow Stool", Material.SCUTE, 100008, "1.2.0");

    fun getItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).setLore("§7Přidáno v: §f" + this.inVersion).build();
    }

    fun getPureItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).build();
    }

}