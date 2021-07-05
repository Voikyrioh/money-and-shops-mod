package fr.voikyrioh.voikymasm;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VoikyriohMoneyAndShopsMod implements ModInitializer {
	public static final Block shopInABlock = new ShopInABlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Registry.register(Registry.BLOCK, new Identifier("voikymasm", "shop_in_a_block"), shopInABlock);
		Registry.register(Registry.ITEM, new Identifier("voikymasm", "shop_in_a_block"), new BlockItem(shopInABlock, new FabricItemSettings().group(ItemGroup.MISC)));
	}
}
