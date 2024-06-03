package org.minecraftplugins.dirttodia.even;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BreakEvent implements Listener {

    private ItemStack itemStack = new ItemStack(Material.DIAMOND, 1);

    @EventHandler
    public void breakDirt(BlockBreakEvent _event){
        Material breakBlockMaterial = _event.getBlock().getBlockData().getMaterial();
        if(breakBlockMaterial == Material.DIRT || breakBlockMaterial == Material.GRASS_BLOCK ){
            if(Math.floor(Math.random() * 10) > 5){
                Player player = _event.getPlayer();
                player.getInventory().addItem(itemStack);
                player.sendMessage("다이아몬드를 획득했습니다.");
            }
        }
    }
}
