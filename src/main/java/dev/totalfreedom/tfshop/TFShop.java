package dev.totalfreedom.tfshop;

import org.bukkit.plugin.java.JavaPlugin;

public final class TFShop extends JavaPlugin {

    private GUIHandler handler;

    @Override
    public void onEnable() {
        this.handler = new GUIHandler(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public GUIHandler getGUIHandler() {
        return handler;
    }
}
