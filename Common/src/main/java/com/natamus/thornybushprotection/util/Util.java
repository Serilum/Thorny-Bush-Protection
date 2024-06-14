package com.natamus.thornybushprotection.util;

import com.natamus.thornybushprotection.config.ConfigHandler;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;

public class Util {
	public static boolean shouldCancelBushDamage(Entity entity) {
		if (ConfigHandler.negateBushDamageForPlayers) {
			if (entity instanceof Player) {
				Player player = (Player) entity;
				if (ConfigHandler.mustWearLeggingsToDisableDamage && player.getItemBySlot(EquipmentSlot.LEGS).isEmpty()) {
					return false;
				}

				return true;
			}
		}
		return false;
	}
}
