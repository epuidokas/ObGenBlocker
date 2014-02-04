package com.puidokas.epuidokas;

import org.bukkit.block.Block;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener; 

public class ObGenBlockerBlockListener implements Listener {
    @EventHandler(priority = EventPriority.LOW)
    public void onBlockFromTo(BlockFromToEvent event) {
        if (event.isCancelled() == true)
            return;
        int source = event.getBlock().getTypeId();
        Block block = event.getToBlock();
        if ((source == 11 || source == 0 || source == 10) && block.getTypeId() == 55) {
            block.setTypeId(0);
        }
    }
}
