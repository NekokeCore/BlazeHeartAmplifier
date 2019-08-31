package fun.pwsg.main;

import com.codingforcookies.armorequip.ArmorEquipEvent;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PlayerArmorListener implements Listener {
    @EventHandler
    private void Armor(ArmorEquipEvent e){
        Player p = e.getPlayer();
        //皮革帽子
        if(e.getNewArmorPiece() != null && e.getNewArmorPiece().getType() ==  Material.LEATHER_HELMET){
            p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 999999999, 0));
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph+2);
            p.sendMessage("DEBUG > 您穿上了:皮革帽子，给予您:急迫I 2生命值");
        }
        //金帽子
        if(e.getNewArmorPiece() != null && e.getNewArmorPiece().getType() == Material.GOLD_HELMET){
            p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 999999999, 1));
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph+2.5);
            p.sendMessage("DEBUG > 您穿上了:金帽子，给予您:急迫II 2.5生命值");
        }
        //锁链帽子
        if(e.getNewArmorPiece() != null && e.getNewArmorPiece().getType() == Material.CHAINMAIL_HELMET){
            p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 999999999, 0));
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph+3);
            p.sendMessage("DEBUG > 您穿上了:锁链帽子，给予您:急迫I 3生命值");
        }
        //铁帽子
        if(e.getNewArmorPiece() != null && e.getNewArmorPiece().getType() == Material.IRON_HELMET){
            p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 999999999, 0));
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph+3.5);
            p.sendMessage("DEBUG > 您穿上了:铁帽子，给予您:急迫I 3.5生命值");
        }
        //钻石帽子
        if(e.getNewArmorPiece() != null && e.getNewArmorPiece().getType() == Material.DIAMOND_HELMET){
            p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 999999999, 0));
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph+4);
            p.sendMessage("DEBUG > 您穿上了:钻石帽子，给予您:急迫I 4生命值");
        }

        //摘帽子
        //皮革帽子
        if(e.getOldArmorPiece() != null && e.getOldArmorPiece().getType() ==  Material.LEATHER_HELMET){
            p.removePotionEffect(PotionEffectType.FAST_DIGGING);
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph-2);
            p.sendMessage("DEBUG > 您脱下了:皮革帽子");
        }
        //金帽子
        if(e.getOldArmorPiece() != null && e.getOldArmorPiece().getType() == Material.GOLD_HELMET){
            p.removePotionEffect(PotionEffectType.FAST_DIGGING);
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph-2.5);
            p.sendMessage("DEBUG > 您脱下了:金帽子");
        }
        //锁链帽子
        if(e.getOldArmorPiece() != null && e.getOldArmorPiece().getType() == Material.CHAINMAIL_HELMET){
            p.removePotionEffect(PotionEffectType.FAST_DIGGING);
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph-3);
            p.sendMessage("DEBUG > 您脱下了:锁链帽子");
        }
        //铁帽子
        if(e.getOldArmorPiece() != null && e.getOldArmorPiece().getType() == Material.IRON_HELMET){
            p.removePotionEffect(PotionEffectType.FAST_DIGGING);
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph-3.5);;
            p.sendMessage("DEBUG > 您脱下了:铁帽子");
        }
        //钻石帽子
        if(e.getOldArmorPiece() != null && e.getOldArmorPiece().getType() == Material.DIAMOND_HELMET){
            p.removePotionEffect(PotionEffectType.FAST_DIGGING);
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph-4);
            p.sendMessage("DEBUG > 您脱下了:钻石帽子");
        }

        //皮革胸甲
        if(e.getNewArmorPiece() != null && e.getNewArmorPiece().getType() ==  Material.LEATHER_CHESTPLATE){
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph+3);
            p.sendMessage("DEBUG > 您穿上了:皮革胸甲，给予您: 3生命值");
        }
        //金胸甲
        if(e.getNewArmorPiece() != null && e.getNewArmorPiece().getType() ==  Material.GOLD_CHESTPLATE){
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph+3.5);
            p.sendMessage("DEBUG > 您穿上了:金胸甲，给予您: 3.5生命值");
        }
        //锁链胸甲
        if(e.getNewArmorPiece() != null && e.getNewArmorPiece().getType() ==  Material.CHAINMAIL_CHESTPLATE){
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph+4);
            p.sendMessage("DEBUG > 您穿上了:锁链胸甲，给予您: 4生命值");
        }
        //铁胸甲
        if(e.getNewArmorPiece() != null && e.getNewArmorPiece().getType() ==  Material.IRON_CHESTPLATE){
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph+5);
            p.sendMessage("DEBUG > 您穿上了:铁胸甲，给予您: 5生命值");
        }
        //钻石胸甲
        if(e.getNewArmorPiece() != null && e.getNewArmorPiece().getType() ==  Material.DIAMOND_CHESTPLATE){
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph+6);
            p.sendMessage("DEBUG > 您穿上了:钻石胸甲，给予您: 6生命值");
        }

        //脱下胸甲
        //皮革胸甲
        if(e.getOldArmorPiece() != null && e.getOldArmorPiece().getType() ==  Material.LEATHER_CHESTPLATE){
            p.resetMaxHealth();
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph-3);
            p.sendMessage("DEBUG > 您脱下了:皮革胸甲");
        }
        //金胸甲
        if(e.getOldArmorPiece() != null && e.getOldArmorPiece().getType() ==  Material.GOLD_CHESTPLATE){
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph-3.5);
            p.sendMessage("DEBUG > 您脱下了:金胸甲");
        }
        //锁链胸甲
        if(e.getOldArmorPiece() != null && e.getOldArmorPiece().getType() ==  Material.CHAINMAIL_CHESTPLATE){
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph-4);
            p.sendMessage("DEBUG > 您脱下了:锁链胸甲");
        }
        //铁胸甲
        if(e.getOldArmorPiece() != null && e.getOldArmorPiece().getType() ==  Material.IRON_CHESTPLATE){
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph-5);
            p.sendMessage("DEBUG > 您脱下了:铁胸甲");
        }
        //钻石胸甲
        if(e.getOldArmorPiece() != null && e.getOldArmorPiece().getType() ==  Material.DIAMOND_CHESTPLATE){
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph-6);
            p.sendMessage("DEBUG > 您脱下了:钻石胸甲");
        }

        //皮革裤子
        if(e.getNewArmorPiece() != null && e.getNewArmorPiece().getType() == Material.LEATHER_LEGGINGS){
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 999999999, 0));
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph+2);
            p.sendMessage("DEBUG > 您穿上了:皮革裤子，给予您:跳跃提升I 2生命值");
        }
        //金裤子
        if(e.getNewArmorPiece() != null && e.getNewArmorPiece().getType() == Material.GOLD_LEGGINGS){
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 999999999, 0));
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph+2.5);
            p.sendMessage("DEBUG > 您穿上了:金裤子，给予您:跳跃提升I 2.5生命值");
        }
        //锁链裤子
        if(e.getNewArmorPiece() != null && e.getNewArmorPiece().getType() == Material.CHAINMAIL_LEGGINGS){
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 999999999, 1));
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph+3);
            p.sendMessage("DEBUG > 您穿上了:锁链裤子，给予您:跳跃提升II 3生命值");
        }
        //铁裤子
        if(e.getNewArmorPiece() != null && e.getNewArmorPiece().getType() == Material.IRON_LEGGINGS){
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 999999999, 0));
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph+3.5);
            p.sendMessage("DEBUG > 您穿上了:铁裤子，给予您:跳跃提升I 3.5生命值");
        }
        //钻石裤子
        if(e.getNewArmorPiece() != null && e.getNewArmorPiece().getType() == Material.DIAMOND_LEGGINGS){
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 999999999, 0));
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph+4);
            p.sendMessage("DEBUG > 您穿上了:钻石裤子，给予您:跳跃提升I 4生命值");
        }

        //脱下裤子
        //皮革裤子
        if(e.getOldArmorPiece() != null && e.getOldArmorPiece().getType() == Material.LEATHER_LEGGINGS){
            p.removePotionEffect(PotionEffectType.JUMP);
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph-2);
            p.sendMessage("DEBUG > 您脱下了:皮革裤子");
        }
        //金裤子
        if(e.getOldArmorPiece() != null && e.getOldArmorPiece().getType() == Material.GOLD_LEGGINGS){
            p.removePotionEffect(PotionEffectType.JUMP);
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph-2.5);
            p.sendMessage("DEBUG > 您脱下了:金裤子");
        }
        //锁链裤子
        if(e.getOldArmorPiece() != null && e.getOldArmorPiece().getType() == Material.CHAINMAIL_LEGGINGS){
            p.removePotionEffect(PotionEffectType.JUMP);
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph-3);
            p.sendMessage("DEBUG > 您脱下了:锁链裤子");
        }
        //铁裤子
        if(e.getOldArmorPiece() != null && e.getOldArmorPiece().getType() == Material.IRON_LEGGINGS){
            p.removePotionEffect(PotionEffectType.JUMP);
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph-3.5);
            p.sendMessage("DEBUG > 您脱下了:铁裤子");
        }
        //钻石裤子
        if(e.getOldArmorPiece() != null && e.getOldArmorPiece().getType() == Material.DIAMOND_LEGGINGS){
            p.removePotionEffect(PotionEffectType.JUMP);
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph-4);
            p.sendMessage("DEBUG > 您脱下了:钻石裤子");
        }

        //皮革靴子
        if(e.getNewArmorPiece() != null && e.getNewArmorPiece().getType() == Material.LEATHER_BOOTS){
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999999, 0));
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph+2);
            p.sendMessage("DEBUG > 您穿上了:皮革靴子，给予您:速度I 2生命值");
        }
        //金靴子
        if(e.getNewArmorPiece() != null && e.getNewArmorPiece().getType() == Material.GOLD_BOOTS){
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999999, 0));
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph+2.5);
            p.sendMessage("DEBUG > 您穿上了:金靴子，给予您:速度I 2.5生命值");
        }
        //锁链靴子
        if(e.getNewArmorPiece() != null && e.getNewArmorPiece().getType() == Material.CHAINMAIL_BOOTS){
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999999, 0));
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph+3);
            p.sendMessage("DEBUG > 您穿上了:锁链靴子，给予您:速度I 3生命值");
        }
        //铁靴子
        if(e.getNewArmorPiece() != null && e.getNewArmorPiece().getType() == Material.IRON_BOOTS){
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999999, 0));
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph+3.5);
            p.sendMessage("DEBUG > 您穿上了:铁靴子，给予您:速度I 3.5生命值");
        }
        //钻石靴子
        if(e.getNewArmorPiece() != null && e.getNewArmorPiece().getType() == Material.DIAMOND_BOOTS){
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999999, 1));
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph+3.5);
            p.sendMessage("DEBUG > 您穿上了:钻石靴子，给予您:速度II 3.5生命值");
        }

        //脱下靴子
        //皮革靴子
        if(e.getOldArmorPiece() != null && e.getOldArmorPiece().getType() == Material.LEATHER_BOOTS){
            p.removePotionEffect(PotionEffectType.SPEED);
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph-2);
            p.sendMessage("DEBUG > 您脱下了:皮革靴子");
        }
        //金靴子
        if(e.getOldArmorPiece() != null && e.getOldArmorPiece().getType() == Material.GOLD_BOOTS){
            p.removePotionEffect(PotionEffectType.SPEED);
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph-2.5);
            p.sendMessage("DEBUG > 您脱下了:金靴子");
        }
        //锁链靴子
        if(e.getOldArmorPiece() != null && e.getOldArmorPiece().getType() == Material.CHAINMAIL_BOOTS){
            p.removePotionEffect(PotionEffectType.SPEED);
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph-3);
            p.sendMessage("DEBUG > 您脱下了:锁链靴子");
        }
        //铁靴子
        if(e.getOldArmorPiece() != null && e.getOldArmorPiece().getType() == Material.IRON_BOOTS){
            p.removePotionEffect(PotionEffectType.SPEED);
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph-3.5);
            p.sendMessage("DEBUG > 您脱下了:铁靴子");
        }
        //钻石靴子
        if(e.getOldArmorPiece() != null && e.getOldArmorPiece().getType() == Material.DIAMOND_BOOTS){
            p.removePotionEffect(PotionEffectType.SPEED);
            double ph = p.getMaxHealth();
            p.setMaxHealth(ph-3.5);
            p.sendMessage("DEBUG > 您脱下了:钻石靴子");
        }
    }
}
