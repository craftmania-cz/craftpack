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

    KOALA(1, "§7Coala", Material.PAPER, 100001, "1.0.0"),
    PANDA(2, "§fPanda", Material.PAPER, 100002, "1.0.0"),
    HORSE(3, "§6Horse", Material.PAPER, 100003, "1.0.0"),
    CLOWN(4, "§dClown", Material.PAPER, 100004, "1.0.2"),
    UNICORN(5, "§fUnicorn", Material.PAPER, 100005, "1.1.0"),
    BEER_HAT(6, "§6BeerHat", Material.PAPER, 100006, "1.1.0"),
    TREX(7, "§6Trex", Material.PAPER, 100007, "1.1.0"),
    XXXTENCATION(8, "§bXXXTENCATION", Material.PAPER, 100008, "1.1.0"),
    BUNNY_EARS(9, "§dBunnyEars", Material.PAPER, 100009, "1.1.0"),
    ZABICKA(10, "§aZabicka", Material.PAPER, 100010, "1.1.0"),
    LAST_BREATH(50, "§bLast Breath", Material.PAPER, 500000, "1.0.2");

    fun getItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).setLore("§7Přidáno v: §f" + this.inVersion).build();
    }

    fun getPureItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).build();
    }
}