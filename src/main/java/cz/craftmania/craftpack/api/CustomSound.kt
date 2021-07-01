package cz.craftmania.craftpack.api

enum class CustomSound (
    private val id: Int,
    private val itemName: String,
    private val resourcePackId: String,
    private val inVersion: String) {

    SPAWN_AMBIENT(1, "Spawn Ambient Sound (Birds)", "custom.ambient.outdoors", "1.3.7"),
    REGION_ENTER(2, "Region Enter Sound", "custom.soundeffect.chatroom.enter", "1.3.7"),
    REGION_LEAVE(3, "Region Leave Sound", "custom.soundeffect.chatroom.exit", "1.3.7"),

    ERROR(4, "Error Sound", "custom.soundeffect.error", "1.3.7");

    fun get(): String {
        return this.resourcePackId
    }
}