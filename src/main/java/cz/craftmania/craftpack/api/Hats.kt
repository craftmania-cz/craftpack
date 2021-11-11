package cz.craftmania.craftpack.api

import cz.craftmania.craftcore.builders.items.ItemBuilder
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

enum class Hats (
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
    DIAMOND_PRUT(12, "§eDiamond Prut", Material.PAPER, 100014, "1.2.2"),
    NARUTO(13, "§dNaruto", Material.PAPER, 100015, "1.2.2"),
    SHREK(13, "§aShrek", Material.PAPER, 100016, "1.3.0"),
    COWBOY(14, "§dCowboy", Material.PAPER, 100017, "1.3.0"),
    NERD_GLASSES(15, "§aNerd Glasses", Material.PAPER, 100018, "1.3.0"),
    DEER(16, "§eDeer", Material.PAPER, 100019, "1.3.0"),
    LION(17, "§6Lion", Material.PAPER, 100020, "1.3.0"),
    EGG_HEAD(18, "§6Egg Head", Material.PAPER, 100021, "1.3.0"),
    CAT_EARS(19, "§fCat Ears", Material.PAPER, 100022, "1.3.3"),
    PIRATE_HAT(20, "§9Pirate Hat", Material.PAPER, 100023, "1.3.3"),
    FLOWERS(21, "§aFlowers Hat", Material.PAPER, 100024, "1.3.3"),
    MANDALORIAN(22, "§cMandalorian", Material.PAPER, 100025, "1.3.5"),
    YODA(23, "§cOld Yoda", Material.PAPER, 100026, "1.3.5"),
    RADIOVKA(24, "§eRadiovka", Material.PAPER, 100027, "1.3.6"),
    HALO(25, "§eHalo", Material.PAPER, 100028, "1.3.7"),
    GOLEM_HEAD(26, "§eGolem Head", Material.PAPER, 100029, "1.3.7"),
    PENGUIN(27, "§ePenguin", Material.PAPER, 100030, "1.3.7"),
    CANDY_HAT(28, "§bCandy Hat", Material.PAPER, 100031, "1.3.7"),
    IRON_MAN(29, "§cIron Man", Material.PAPER, 100032, "1.3.7"),
    TIGER_HEAD(30, "§eTiger Head", Material.PAPER, 100033, "1.3.7"),
    FISH_BOWL(31, "§eFish Bowl", Material.PAPER, 100034, "1.3.8"),
    ASTRONAUT(32, "§bAstronaut", Material.PAPER, 100035, "1.3.8"),
    DEVIL(33, "§cDevil", Material.PAPER, 100036, "1.3.8"),
    TIKI_MASK(34, "§eTiki Mask", Material.PAPER, 100037, "1.3.8"),
    DARTH_VADER(35, "§eDarth Vader", Material.PAPER, 100038, "1.4.0"),
    IMPOSTOR(36, "§eImpostor", Material.PAPER, 100039, "1.4.1"),
    WITCH(37, "§eWitch Hat", Material.PAPER, 100040, "1.4.1"),
    SHARK(38, "§eShark Hat", Material.PAPER, 100041, "1.4.1"),
    REAPER_HOODIE(39, "§eReaper Hoodie", Material.PAPER, 100042, "1.4.1"),
    PUMPKIN_KING(40, "§ePumpkin King", Material.PAPER, 100043, "1.4.1"),
    TETRIS(41, "§eTetris Hat", Material.PAPER, 100044, "1.4.2"),

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
    AT_MODERATOR(109, "§eModerator Crown", Material.PAPER, 200010, "1.4.0"),
    AT_TESTER(110, "§eTester Crown", Material.PAPER, 200011, "1.4.0"),

    // Special Hats
    WUMPUS(501, "§eWumpus", Material.PAPER, 100012, "1.2.0"),
    WUMPUS_LEAF(502, "§eWumpus Leaf", Material.PAPER, 100013, "1.2.0"),
    ICE_ROSE_CROWN(503, "§dIce Rose Crown", Material.SUGAR, 100001, "1.3.0"),

    // Events
    BRONZE_TROPHY(600, "§6Bronze Trophy", Material.PAPER, 200010, "1.3.3"),
    SILVER_TROPHY(601, "§7Silver Trophy", Material.PAPER, 200011, "1.3.3"),
    GOLD_TROPHY(602, "§eGold Trophy", Material.PAPER, 200012, "1.3.3"),

    // Promotion Hats
    LAST_BREATH(1000, "§bLast Breath", Material.PAPER, 500000, "1.0.2");

    fun getItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).setLore("§7Přidáno v: §f" + this.inVersion).build();
    }

    fun getPureItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).build();
    }
}