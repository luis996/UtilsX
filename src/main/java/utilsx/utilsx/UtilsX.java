package utilsx.utilsx;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import utilsx.utilsx.handlers.BedrockHandler;

public final class UtilsX extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Hi! :O this plugin does work");
        new BedrockHandler(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("It does work!");
    }
}