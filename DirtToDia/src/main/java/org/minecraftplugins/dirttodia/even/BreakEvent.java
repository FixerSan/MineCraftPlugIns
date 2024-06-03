package org.minecraftplugins.dirttodia.even;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.minecraftplugins.dirttodia.ItemManager;

import java.util.concurrent.RecursiveTask;

public class BreakEvent implements Listener {
    @EventHandler
    public void breakDirt(BlockBreakEvent _event){
        Material breakBlockMaterial = _event.getBlock().getBlockData().getMaterial();
        if(breakBlockMaterial == Material.DIRT || breakBlockMaterial == Material.GRASS_BLOCK ){
            if(Math.floor(Math.random() * 10) > 5){
                Player player = _event.getPlayer();

                if(Math.floor(Math.random() * 10) < 1)
                {
                    player.getInventory().addItem(ItemManager.EnchantDia);
                    player.sendMessage(ChatColor.DARK_AQUA + "인첸트 다이아몬드를 획득했습니다.");
                    return;
                }

                player.getInventory().addItem(ItemManager.dia);
                player.sendMessage(ChatColor.AQUA + "다이아몬드를 획득했습니다.");
            }

        }
    }
}
