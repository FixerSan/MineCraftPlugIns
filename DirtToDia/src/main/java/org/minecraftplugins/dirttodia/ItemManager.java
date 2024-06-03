package org.minecraftplugins.dirttodia;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ItemManager {
    public static final ItemStack dia = BuildItem(Material.DIAMOND, 1, ChatColor.AQUA +"다이아","흙을 캐서 얻은 다이아다",
            ChatColor.LIGHT_PURPLE + "영웅");

    public static final ItemStack EnchantDia = EnchantItem(ChangeItemInfo(dia, ChatColor.DARK_AQUA + "인첸트 된 다이아", ChatColor.DARK_PURPLE +"흙을 캐서 얻은 다이아지만 다른 다이아보다 강한 것 같다."), Enchantment.ARROW_DAMAGE, 100, false);

    private static ItemStack BuildItem(Material _material, int _amount, String _displayName, String... _lore){
        ItemStack stack = new ItemStack(_material, _amount);
        ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName(_displayName);
        meta.setLore(Arrays.asList(_lore));
        stack.setItemMeta(meta);
        return stack;
    }

    private static ItemStack EnchantItem(ItemStack _item, Enchantment _enchant, int _enchantLevel, boolean _enchantRestrict) {
        ItemMeta meta = _item.getItemMeta();
        meta.addEnchant(_enchant, _enchantLevel, _enchantRestrict);
        _item.setItemMeta(meta);
        return _item;
    }

    private static ItemStack ChangeItemInfo(ItemStack _item, String _displayName, String... _lore){
        ItemStack itemStack = _item.clone();
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(_displayName);
        meta.setLore(Arrays.asList(_lore));
        itemStack.setItemMeta(meta);
        return  itemStack;
    }
}
