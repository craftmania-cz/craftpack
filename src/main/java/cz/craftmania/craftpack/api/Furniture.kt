package cz.craftmania.craftpack.api

import cz.craftmania.craftcore.builders.items.ItemBuilder
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
    STOOL_YELLOW(108, "§eYellow Stool", Material.SCUTE, 100008, "1.2.0"),

    // Couch
    COUCH_BLACK(110, "§eBlack Couch", Material.SCUTE, 100010, "1.4.0"),
    COUCH_BLUE(111, "§eBlue Couch", Material.SCUTE, 100011, "1.4.0"),
    COUCH_LIME(112, "§eLime Couch", Material.SCUTE, 100012, "1.4.0"),
    COUCH_ORANGE(113, "§eOrange Couch", Material.SCUTE, 100013, "1.4.0"),
    COUCH_PINK(114, "§ePink Couch", Material.SCUTE, 100014, "1.4.0"),
    COUCH_PURPLE(115, "§ePurple Couch", Material.SCUTE, 100015, "1.4.0"),
    COUCH_RED(116, "§eRed Couch", Material.SCUTE, 100016, "1.4.0"),
    COUCH_WHITE(117, "§eWhite Couch", Material.SCUTE, 100017, "1.4.0"),
    COUCH_YELLOW(118, "§eYellow Couch", Material.SCUTE, 100018, "1.4.0"),

    // Iron Bench
    IRON_BENCH(120, "§eIron Bench", Material.SCUTE, 100100, "1.4.0"),

    // Lamps
    LAMP_BLACK(130, "§eBlack Lamp", Material.SCUTE, 100150, "1.4.0"),
    LAMP_BLUE(131, "§eBlue Lamp", Material.SCUTE, 100151, "1.4.0"),
    LAMP_LIME(132, "§eLime Lamp", Material.SCUTE, 100152, "1.4.0"),
    LAMP_ORANGE(133, "§eOrange Lamp", Material.SCUTE, 100153, "1.4.0"),
    LAMP_PINK(134, "§ePink Lamp", Material.SCUTE, 100154, "1.4.0"),
    LAMP_PURPLE(135, "§ePurple Lamp", Material.SCUTE, 100155, "1.4.0"),
    LAMP_RED(136, "§eRed Lamp", Material.SCUTE, 100156, "1.4.0"),
    LAMP_WHITE(137, "§eWhite Lamp", Material.SCUTE, 100157, "1.4.0"),
    LAMP_YELLOW(138, "§eYellow Lamp", Material.SCUTE, 100158, "1.4.0"),

    // Table
    COFFEE_TABLE(140, "§eCoffee Table", Material.SCUTE, 100180, "1.4.0"),
    COFFEE_TABLE_EMPTY(141, "§eCoffee Table (Empty)", Material.SCUTE, 100181, "1.4.0");

    fun getItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).setLore("§7Přidáno v: §f" + this.inVersion).build();
    }

    fun getPureItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).build();
    }

}