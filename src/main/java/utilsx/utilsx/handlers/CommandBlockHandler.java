package utilsx.utilsx.handlers;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import utilsx.utilsx.UtilsX;

public class CommandBlockHandler implements Listener {
    public CommandBlockHandler(UtilsX plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void onCommandBlockPlace(BlockPlaceEvent event) {
        Block block = event.getBlock();
        if (block.getType() != Material.COMMAND_BLOCK) {
            return;
        }
        if (block.getType() != Material.REPEATING_COMMAND_BLOCK) {
            return;
        }
        if (block.getType() != Material.CHAIN_COMMAND_BLOCK) {
            return;
        }
        if (event.getPlayer().hasPermission("utilsx.allow.commandblock")) {
            return;
        }
        Player player = event.getPlayer();
        Bukkit.getLogger().info(player.getName() + " Tried to place a command block");
        player.sendMessage("[!] You cannot place an internally prohibited block.");
        event.setCancelled(true);
    }
}
