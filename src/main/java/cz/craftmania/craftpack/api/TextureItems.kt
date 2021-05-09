package cz.craftmania.craftpack.api

import org.bukkit.Material

enum class TextureItems (
    private val id: Int,
    private val textName: String,
    private val keyText: String) {

    PREFIX_OWNER(1, "Owner Prefix", "⻒"),
    PREFIX_MANAGER(2, "Manager Prefix", "⻓"),
    PREFIX_DEVELOPER(3, "Developer Prefix", "⻔"),
    PREFIX_EVENTER(4, "Eventer Prefix", "⻕"),
    PREFIX_BUILDER(5, "Builder Prefix", "⻖"),
    PREFIX_ADMIN(6, "Admin Prefix", "⻗"),
    PREFIX_ADMINKA(7, "Adminka Prefix", "⻘"),
    PREFIX_ARTIST(8, "Artist Prefix", "夒"),
    PREFIX_HELPER(9, "Helper Prefix", "⻙"),
    PREFIX_HELPERKA(10, "Helperka Prefix", "夓"),
    PREFIX_TESTER(11, "Tester Prefix", "⻚"),
    PREFIX_OBSIDIAN(12, "Obsidian Prefix", "⻛"),
    PREFIX_EMERALD(13, "Emerald Prefix", "⻜"),
    PREFIX_DIAMOND(14, "Diamond Prefix", "⻝"),
    PREFIX_GOLD(15, "Gold Prefix", "⻞"),
    PREFIX_HRAC(16, "Hrac prefix", "⻯"),

    CM_LOGO_BIG(25, "CM LOGO", "⻟"),
    CM_LOGO_ROUNDED(26, "CM LOGO (ROUND)", "⻎"),
    CM_LOGO_ROUND_BIG(27, "CM LOGO (ROUND) 2", "⻨"),

    EMOTE_HEROLD(30, "Emote: Herold", "⻠"),
    EMOTE_DOGGO(31, "Emote: Doggo", "⻡"),
    EMOTE_SMILE(32, "Emote: Smile", "⻢"),
    EMOTE_AAAA(33, "Emote: Aaaa", "⻣"),
    EMOTE_POG(34, "Emote: Pog", "⻤"),
    EMOTE_KEK(35, "Emote: Kek", "⻥"),
    EMOTE_5HEAD(36, "Emote: 5Head", "⻦"),
    EMOTE_SHIBA(37, "Emote: Shiba", "⻧"),
    EMOTE_JOB(38, "Emote: Job", "⻑"),
    EMOTE_PAG(39, "Emote: Pagman", "⻐"),
    EMOTE_POGO(40, "Emote: Pogo", "⻏"),
    EMOTE_FACEPALM(41, "Emote: Facepalm", "⻩"),

    ERROR_GREEN(70, "Error: Green", "⻪"),
    ERROR_YELLOW(71, "Error: Yellow", "⻫"),
    ERROR_RED(72, "Error: Red", "⻬"),

    GREEN_DOLAR(80, "Green Dollar", "⻮"),

    COMPASS(100, "Compass", "⻭"),

    RARITY_UNCOMMON(150, "Rarity: Uncommon", "⻰"),
    RARITY_COMMON(151, "Rarity: Common", "⻱"),
    RARITY_RARE(152, "Rarity: Rare", "⻲"),
    RARITY_EPIC(153, "Rarity: Epic", "⻳"),
    RARITY_LEGENDARY(154, "Rarity: Legendary", "⼀"),
    RARITY_MYTHIC(155, "Rarity: Mythic", "⼢"),
    RARITY_LIMITED(156, "Rarity: Limited", "⼣"),

    AFK_TAG(200, "AFK Tag", "夑"),
    CHAT_ROOM(201, "Chat Room", "夐");


    /**
     * Vrací pouze znak, pro použití v menu nebo jako čistý text na vložení.
     */
    fun getRender(): String {
        return this.keyText;
    }
}