package utilsx.utilsx.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String [] args) {
        if (!sender.hasPermission("utilsx.commands.heal")) {
            sender.sendMessage("[!] You don't have permissions to use this command.");
            return true;
        }
        if (args.length == 0) {
            if (!(sender instanceof Player)) {
                return true;
            }
            Player player = (Player) sender;
            player.setHealth(20.0d);
            player.setFoodLevel(20);
            player.sendMessage("You have been healed!");
            return true;
        }
        if (args.length == 1) {
            Player target = Bukkit.getPlayerExact(args[0]);
            if (target != null) {
                target.setHealth(20.0d);
                target.setFoodLevel(20);
                sender.sendMessage("User " + target.getName() + " has been healed.");
                return true;
            }
            sender.sendMessage("Invalid username provided");
            return true;
        }
        sender.sendMessage("Invalid number of arguments / Unexpected error.");
        return false;
    }
}
