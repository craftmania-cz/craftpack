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
    PREFIX_MODERATOR(17, "Moderator prefix", "쇃"),

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
    EMOTE_BLUSH(42, "Emote: Blush", "⼭"),
    EMOTE_RAGE(43, "Emote: Rage", "⼮"),
    EMOTE_BSMART(44, "Emote: Bsmart", "⼯"),
    EMOTE_CRY(45, "Emote: Cry", "⼰"),
    EMOTE_LOL(46, "Emote: LOL", "⼱"),
    EMOTE_LOVE(47, "Emote: Love", "⼲"),
    EMOTE_HUG(48, "Emote: Hug", "⼳"),
    EMOTE_JAM(49, "Emote: Jam", "⼴"),
    EMOTE_PARTY(50, "Emote: Party", "⼵"),

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
    CHAT_ROOM(201, "Chat Room", "夐"),
    SERVER_TAG(202, "Server Tag", "⼧"),

    SERVER_SURVIVAL(250, "Survival Tag", "⼥"),
    SERVER_SKYBLOCK(251, "Skyblock Tag", "⼦"),
    SERVER_CREATIVE(252, "Creative Tag", "⼫"),
    SERVER_VANILLA(253, "Vanilla Tag", "⼤"),
    SERVER_ANARCHY(254, "Anarchy Tag", "⼬"),
    SERVER_PRISON(255, "Prison Tag", "⼨"),
    SERVER_ONEBLOCK(256, "Server OneBlock", "[x]"),
    SERVER_EVENT(257, "Event Server", "⼪"),
    SERVER_LOBBY(258, "Lobby server", "⼩"),
    SERVER_PARKOUR(259, "Parkour sserver", "솸"),

    PARKOUR_RANK_NOOB(300, "Parkour Rank Noob", "솹"),
    PARKOUR_RANK_ROOKIE(301, "Parkour Rank Rookie", "솺"),
    PARKOUR_RANK_ADEPT(302, "Parkour Rank Adept", "솻"),
    PARKOUR_RANK_SKILLED(303, "Parkour Rank Skilled", "솼"),
    PARKOUR_RANK_EXPERT(304, "Parkour Rank Expert", "솽"),
    PARKOUR_RANK_BEAST(305, "Parkour Rank Beast", "솾"),
    PARKOUR_RANK_MASTER(306, "Parkour Rank Master", "솿"),
    PARKOUR_RANK_GOD(307, "Parkour Rank God", "쇀"),
    PARKOUR_RANK_LEGEND(308, "Parkour Rank Legend", "쇁"),
    PARKOUR_RANK_ZABICKA(309, "Parkour Rank Zabicka", "쇂");

    /**
     * Vrací pouze znak, pro použití v menu nebo jako čistý text na vložení.
     */
    fun getRender(): String {
        return this.keyText;
    }
}