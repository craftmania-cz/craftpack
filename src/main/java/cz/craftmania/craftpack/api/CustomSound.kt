package cz.craftmania.craftpack.api

enum class CustomSound (
    private val id: Int,
    private val itemName: String,
    private val resourcePackId: String,
    private val inVersion: String) {

    SPAWN_AMBIENT(1, "Spawn Ambient Sound (Birds)", "custom.ambient.outdoors", "1.3.7"),
    REGION_ENTER(2, "Region Enter Sound", "custom.soundeffect.chatroom.enter", "1.3.7"),
    REGION_LEAVE(3, "Region Leave Sound", "custom.soundeffect.chatroom.exit", "1.3.7"),

    DBD_LAMPKIN_THEME(10, "DBD: Lampking Theme", "custom.soundeffect.dbd.lampking_theme", "1.4.1"),
    DBD_MATCH_BEGINS(11, "DBD: Match Begins", "custom.soundeffect.dbd.match_begins", "1.4.1"),
    DBD_SMALL_GAME(12, "DBD: Small Game", "custom.soundeffect.dbd.small_game", "1.4.1"),
    DBD_HEARTHBEAT(13, "DBD: Heathbeat", "custom.soundeffect.dbd.heartbeat", "1.4.1"),

    ERROR(4, "Error Sound", "custom.soundeffect.error", "1.3.7");

    fun get(): String {
        return this.resourcePackId
    }
}