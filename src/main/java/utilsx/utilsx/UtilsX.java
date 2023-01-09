package utilsx.utilsx;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import utilsx.utilsx.commands.Fly;
import utilsx.utilsx.commands.Heal;
import utilsx.utilsx.commands.LowHealthTroll;
import utilsx.utilsx.handlers.BedrockHandler;
import utilsx.utilsx.handlers.CommandBlockHandler;

public final class UtilsX extends JavaPlugin {

    @Override
    public void onEnable() {
        new BedrockHandler(this);
        new CommandBlockHandler(this);
        Bukkit.getLogger().info("[UtilsX] Event handlers enabled");
        getCommand("fly").setExecutor(new Fly());
        getCommand("heal").setExecutor(new Heal());
        getCommand("lowhealthtroll").setExecutor(new LowHealthTroll());
        Bukkit.getLogger().info("[UtilsX] Commands enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("[UtilsX] Plugin disabled");
    }
}