package org.dusttodia.dusttodia.Event;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.net.http.WebSocket;

public class BreakEvent implements Listener {

    private ItemStack dia = new ItemStack(Material.DIAMOND, 1);

    @EventHandler
    public void breakDirt(BlockBreakEvent _event) {
        Material brBlock = _event.getBlock().getBlockData().getMaterial();
        if (brBlock == Material.DIRT || brBlock == Material.GRASS_BLOCK) {
            if(Math.floor((Math.random() * 10)) > 5){
                Player player = _event.getPlayer();
                player.getInventory().addItem(dia);
                player.sendMessage("다이아몬드를 발견하셨습니다.");
            }
        }
    }
}
