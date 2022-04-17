package net.tleffer.betterminecraft.procedures;

import net.tleffer.betterminecraft.network.BetterMinecraftModVariables;
import net.tleffer.betterminecraft.init.BetterMinecraftModBlocks;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PostenderdragonProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
				? _plr.getAdvancements()
						.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:end/kill_dragon"))).isDone()
				: false) {
			BetterMinecraftModVariables.MapVariables.get(world).is_ed_defeat = 1;
			BetterMinecraftModVariables.MapVariables.get(world).syncData(world);
		}
		if (BetterMinecraftModVariables.MapVariables.get(world).is_ed_defeat != 1) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"fill ~10 ~10 ~10 ~-10 ~-10 ~-10 better_minecraft:mysterious_nether_block replace ancient_debris");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"fill ~10 ~10 ~10 ~-10 ~-5 ~-10 better_minecraft:mysterious_nether_block replace ancient_debris");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"fill ~10 ~10 ~10 ~-10 ~-2 ~-10 better_minecraft:mysterious_nether_block replace ancient_debris");
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.ANCIENT_DEBRIS)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Blocks.ANCIENT_DEBRIS);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(BetterMinecraftModBlocks.MYSTERIOUS_NETHER_BLOCK);
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.NETHERITE_INGOT)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Items.NETHERITE_INGOT);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(BetterMinecraftModBlocks.MYSTERIOUS_NETHER_BLOCK);
					_setstack.setCount(4);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.NETHERITE_SCRAP)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Items.NETHERITE_SCRAP);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(BetterMinecraftModBlocks.MYSTERIOUS_NETHER_BLOCK);
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.NETHERITE_BLOCK)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Blocks.NETHERITE_BLOCK);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 36,
							_player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(BetterMinecraftModBlocks.MYSTERIOUS_NETHER_BLOCK);
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		} else {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"fill ~10 ~10 ~10 ~-10 ~-10 ~-10 minecraft:ancient_debris replace better_minecraft:mysterious_nether_block");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"fill ~10 ~10 ~10 ~-10 ~-5 ~-10 minecraft:ancient_debris replace better_minecraft:mysterious_nether_block");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"fill ~10 ~10 ~10 ~-10 ~-2 ~-10 minecraft:ancient_debris replace better_minecraft:mysterious_nether_block");
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(BetterMinecraftModBlocks.MYSTERIOUS_NETHER_BLOCK))
					: false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(BetterMinecraftModBlocks.MYSTERIOUS_NETHER_BLOCK);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Blocks.ANCIENT_DEBRIS);
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
	}
}
