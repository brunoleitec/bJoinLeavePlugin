package com.github.brunoleitec.bjoinleaveplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class BJoinLeavePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
    }

}
