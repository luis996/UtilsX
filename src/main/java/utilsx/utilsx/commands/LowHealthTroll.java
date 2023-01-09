package utilsx.utilsx.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LowHealthTroll implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String [] args) {
        if (!sender.hasPermission("utilsx.commands.lowhealthtroll")) {
            return true;
        }
        if (args.length == 1) {
            Player target = Bukkit.getPlayerExact(args[0]);
            if (target == null) {
                sender.sendMessage("Invalid username provided.");
                return true;
            }
            target.setHealth(1.0d);
            sender.sendMessage("Set the player health to middle heart!");
        } else {
            sender.sendMessage("Invalid number of arguments.");
        }
        return true;
    }
}
