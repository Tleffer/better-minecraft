package net.tleffer.betterminecraft.procedures;

import net.tleffer.betterminecraft.network.BetterMinecraftModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class TrueAlunitMasterThisEntityKillsAnotherOneProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof Player) {
			{
				Entity _ent = sourceentity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"kill @e[type=better_minecraft:true_alunit_master]");
			}
			{
				Entity _ent = sourceentity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"kill @e[type=minecraft:experience_orb]");
			}
			{
				Entity _ent = sourceentity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"kill @e[type=item,nbt={Item:{id:\"better_minecraft:reinforced_alunit_pickaxe\"}}]");
			}
			BetterMinecraftModVariables.MapVariables.get(world).is_fighting_true_alunit_master = false;
			BetterMinecraftModVariables.MapVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"gamemode survival @a");
			}
		}
	}
}
