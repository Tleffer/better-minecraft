package net.tleffer.betterminecraft.procedures;

import net.tleffer.betterminecraft.network.BetterMinecraftModVariables;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class TrueAlunitMasterEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BetterMinecraftModVariables.MapVariables.get(world).is_fighting_true_alunit_master = false;
		BetterMinecraftModVariables.MapVariables.get(world).syncData(world);
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
					new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "gamemode survival @a");
	}
}
