package org.dusttodia.dusttodia;

import org.bukkit.plugin.java.JavaPlugin;
import org.dusttodia.dusttodia.Event.BreakEvent;

public final class DustToDia extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
    getServer().getPluginManager().registerEvents(new BreakEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
