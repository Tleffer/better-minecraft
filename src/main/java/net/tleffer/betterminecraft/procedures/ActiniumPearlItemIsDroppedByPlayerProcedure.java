package net.tleffer.betterminecraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class ActiniumPearlItemIsDroppedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (new ResourceLocation("end_barrens").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())
				|| new ResourceLocation("end_highlands").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())
				|| new ResourceLocation("end_midlands").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())
				|| new ResourceLocation("small_end_islands").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())
				|| new ResourceLocation("the_end").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())
				|| new ResourceLocation("the_void").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"kill @e[type=item,nbt={Item:{id:\"better_minecraft:actinium_pearl\"}}]");
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"summon better_minecraft:actinium_boss ~ ~10 ~");
			}
		}
	}
}
