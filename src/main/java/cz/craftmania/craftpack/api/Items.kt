package cz.craftmania.craftpack.api

import cz.craftmania.craftcore.spigot.builders.items.ItemBuilder
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

enum class Items (
    private val id: Int,
    private val itemName: String,
    private val material: Material,
    private val modelData: Int,
    private val inVersion: String) {

    // Crates
    WOODEN_CRATE_V1(1, "§fWooden Crate", Material.FIREWORK_STAR, 100001, "1.0.0"),
    SILVER_CRATE_V1(2, "§fSilver Crate", Material.FIREWORK_STAR, 100002, "1.0.0"),
    GOLDEN_CRATE_V1(3, "§fGolden Crate", Material.FIREWORK_STAR, 100003, "1.0.0"),
    EMERALD_CRATE_V1(4, "§fEmerald Crate", Material.FIREWORK_STAR, 100004, "1.0.0"),
    DIAMOND_CRATE_V1(5, "§fDiamond Crate", Material.FIREWORK_STAR, 100005, "1.0.0"),
    OBSIDIAN_CRATE_V1(6, "§fObsidian Crate", Material.FIREWORK_STAR, 100006, "1.0.0"),

    // Tutorial Items
    TUTORIAL_BOOK(7, "§eTutorial Boook", Material.WHEAT, 100001, "1.0.0"),

    // Gift Boxes
    GIFT_WAKE_SPECIAL(8, "§9Gift Wake Special", Material.WHEAT, 200001, "1.0.0"),
    GIFT_BLUE(9, "§bGift Blue", Material.WHEAT, 200002, "1.0.0"),
    GIFT_RED(10, "§cGift Red", Material.WHEAT, 200003, "1.0.0"),

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