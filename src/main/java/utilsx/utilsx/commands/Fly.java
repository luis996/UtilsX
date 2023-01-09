package utilsx.utilsx.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String [] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        if (!sender.hasPermission("utilsx.commands.fly")) {
            sender.sendMessage("[!] You don't have permissions to use this command.");
            return true;
        }
        Player player = (Player) sender;

        if (player.getAllowFlight()) {
            player.setAllowFlight(false);
            player.sendMessage("Flying has been disabled.");
        } else {
            player.setAllowFlight(true);
            player.sendMessage("Flying has been enabled.");
        }


        return true;
    }
}
