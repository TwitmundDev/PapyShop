package fr.twitmund;

import fr.twitmund.cmds.cmds;
import fr.twitmund.ui.MenuP;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class main extends JavaPlugin {
    private static final Logger log = Logger.getLogger("Minecraft");



    @Override
    public void onEnable() {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new MenuP(), this);

        getCommand("shop").setExecutor(new cmds());
        System.out.println("plugin on ");
        log.info(String.format("[%s] Disabled Version %s", getDescription().getName(), getDescription().getVersion()));


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
