package utilsx.utilsx;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import utilsx.utilsx.handlers.BedrockHandler;
import utilsx.utilsx.handlers.CommandBlockHandler;

public final class UtilsX extends JavaPlugin {

    @Override
    public void onEnable() {
        new BedrockHandler(this);
        new CommandBlockHandler(this);
        Bukkit.getLogger().info("[UtilsX] Event handlers enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("[UtilsX] Plugin disabled");
    }
}