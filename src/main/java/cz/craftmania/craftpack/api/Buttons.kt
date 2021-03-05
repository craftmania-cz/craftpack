package cz.craftmania.craftpack.api

import cz.craftmania.craftcore.spigot.builders.items.ItemBuilder
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

enum class Buttons (
    private val id: Int,
    private val itemName: String,
    private val material: Material,
    private val modelData: Int,
    private val inVersion: String) {

    ACCEPT_BUTTON(1, "§eAccept Button", Material.IRON_NUGGET, 100001, "1.2.2"),
    BACK_BUTTON_OFF(2, "§eBack Button (Off)", Material.IRON_NUGGET, 100002, "1.2.2"),
    BACK_BUTTON(3, "§eBack Button", Material.IRON_NUGGET, 100003, "1.2.2"),
    STAR(4, "§eStar", Material.IRON_NUGGET, 100004, "1.2.2"),
    DISABLED(5, "§eDisabled", Material.IRON_NUGGET, 100005, "1.2.2"),
    DISABLED_OFF(6, "§eDisabled (Off)", Material.IRON_NUGGET, 100006, "1.2.2"),
    EARTH(7, "§eEarth", Material.IRON_NUGGET, 100007, "1.2.2"),
    LOCKED(8, "§eLocked", Material.IRON_NUGGET, 100008, "1.2.2"),
    NEXT_BUTTON_OFF(9, "§eNext Button (Off)", Material.IRON_NUGGET, 100009, "1.2.2"),
    NEXT_BUTTON(10, "§eNext Button", Material.IRON_NUGGET, 100010, "1.2.2"),
    UNLOCKED(11, "§eUnlocked", Material.IRON_NUGGET, 100011, "1.2.2"),
    CANCEL_BUTTON(12, "§eCancel Button", Material.IRON_NUGGET, 100012, "1.2.2"),
    KNOWLEDGE_BOOK(13, "§eKnowledge Book", Material.IRON_NUGGET, 100013, "1.2.2");

    fun getItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).setLore("§7Přidáno v: §f" + this.inVersion).build();
    }

    fun getPureItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).build();
    }
}