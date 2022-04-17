package net.tleffer.betterminecraft.procedures;

import net.tleffer.betterminecraft.network.BetterMinecraftModVariables;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class RadiationOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(BetterMinecraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new BetterMinecraftModVariables.PlayerVariables())).radiation_timer + 1;
			entity.getCapability(BetterMinecraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.radiation_timer = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((entity.getCapability(BetterMinecraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new BetterMinecraftModVariables.PlayerVariables())).radiation_timer > 20) {
			entity.hurt(DamageSource.GENERIC, 1);
			{
				double _setval = 0;
				entity.getCapability(BetterMinecraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.radiation_timer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
