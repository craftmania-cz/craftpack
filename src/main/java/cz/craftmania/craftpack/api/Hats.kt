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

    // CoinShop Hats
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
    KACHNICKA(11, "§eKachnicka", Material.PAPER, 100011, "1.2.0"),

    // Admin Team Hats
    AT_HELPER(100, "§eHelper Crown", Material.PAPER, 200001, "1.2.0"),
    AT_ADMIN(101, "§cAdmin Crown", Material.PAPER, 200002, "1.2.0"),
    AT_ARTIST(102, "§eArtist Crown", Material.PAPER, 200003, "1.2.0"),
    AT_BUILDER(103, "§eBuilder Crown", Material.PAPER, 200004, "1.2.0"),
    AT_DEVELOPER(104, "§eDeveloper Crown", Material.PAPER, 200005, "1.2.0"),
    AT_EVENTER(105, "§eEventer Crown", Material.PAPER, 200006, "1.2.0"),
    AT_OWNER(106, "§eOwner Crown", Material.PAPER, 200007, "1.2.0"),
    AT_STAFF(107, "§eStaff Crown", Material.PAPER, 200008, "1.2.0"),
    AT_BANHAMMER(108, "§eBan Hammer", Material.PAPER, 200009, "1.2.0"),

    // Special Hats
    EVENT_CROWN(500, "§eEvent Crown", Material.PAPER, 200010, "1.2.0"),
    WUMPUS(501, "§eWumpus", Material.PAPER, 100012, "1.2.0"),
    WUMPUS_LEAF(502, "§eWumpus Leaf", Material.PAPER, 100013, "1.2.0"),

    // Promotion Hats
    LAST_BREATH(1000, "§bLast Breath", Material.PAPER, 500000, "1.0.2");

    fun getItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).setLore("§7Přidáno v: §f" + this.inVersion).build();
    }

    fun getPureItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).build();
    }
}