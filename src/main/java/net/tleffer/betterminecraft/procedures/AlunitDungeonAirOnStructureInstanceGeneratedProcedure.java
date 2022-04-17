package net.tleffer.betterminecraft.procedures;

import net.tleffer.betterminecraft.init.BetterMinecraftModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class AlunitDungeonAirOnStructureInstanceGeneratedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos((int) x, (int) y, (int) z), BetterMinecraftModBlocks.ALUNIT_DUNGEON_BLOCK.defaultBlockState(), 3);
		world.getBlockTicks().scheduleTick(new BlockPos((int) x, (int) y, (int) z),
				world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock(), 20);
	}
}
