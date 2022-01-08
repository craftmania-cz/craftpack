package cz.craftmania.craftpack.api

import cz.craftmania.craftcore.builders.items.ItemBuilder
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

enum class GUI (
    private val id: Int,
    private val itemName: String,
    private val material: Material,
    private val modelData: Int,
    private val inVersion: String) {

    VOTEPASS(1, "VotePass", Material.LIGHT_GRAY_STAINED_GLASS_PANE, 100001, "1.2.1"),
    SERVER_SELECTOR(2, "Server Selector (lobby)", Material.LIGHT_GRAY_STAINED_GLASS_PANE, 100002, "1.4.0"),
    GOLDEN_PIG(3, "Golden Pig (Lobby)", Material.LIGHT_GRAY_STAINED_GLASS_PANE, 100003, "1.4.4");

    fun getPureItemStack(): ItemStack {
        return ItemBuilder(this.material).setName(this.itemName).setCustomModelData(this.modelData).build();
    }
}