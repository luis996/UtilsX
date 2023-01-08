package utilsx.utilsx.handlers;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import utilsx.utilsx.UtilsX;

public class BedrockHandler implements Listener {
    public BedrockHandler(UtilsX plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onBedrockPlace(BlockPlaceEvent event) {
        Block block = event.getBlock();
        if (block.getType() != Material.BEDROCK) {
            return;
        }
        if (event.getPlayer().hasPermission("utilsx.allow.bedrock")) {
            return;
        }
        Player player = event.getPlayer();
        player.sendMessage("[!] You cannot place an internally prohibited block.");
        event.setCancelled(true);
    }
}
