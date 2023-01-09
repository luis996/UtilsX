package utilsx.utilsx.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String [] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        if (!sender.hasPermission("utilsx.commands.heal")) {
            return true;
        }
        Player player = (Player) sender;
        player.setFoodLevel(20);
        player.setHealth(20.0d);
        player.sendMessage("You have been healed.");
        return true;
    }
}
