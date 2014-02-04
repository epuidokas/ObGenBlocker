package com.puidokas.epuidokas;

import org.bukkit.plugin.java.JavaPlugin;

public class ObGenBlockerPlugin extends JavaPlugin{
    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new ObGenBlockerBlockListener(), this);
    }
}
