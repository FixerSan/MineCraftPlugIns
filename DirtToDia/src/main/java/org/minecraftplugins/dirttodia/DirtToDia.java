package org.minecraftplugins.dirttodia;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.minecraftplugins.dirttodia.even.BreakEvent;

public final class DirtToDia extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        // 플러그인이 시작되면 정장석으로 작동 된다고 로그
        getServer().getPluginManager().registerEvents(new BreakEvent(), this);
        getLogger().info("[FIXER_SAN]DirtToDia Loading Succeed");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
