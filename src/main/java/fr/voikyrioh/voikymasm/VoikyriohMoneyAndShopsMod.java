package fr.voikyrioh.voikymasm;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VoikyriohMoneyAndShopsMod implements ModInitializer {
	public static final Block shopInABlock = new ShopInABlock(
			FabricBlockSettings
					.of(Material.WOOD)
					.sounds(BlockSoundGroup.WOOD)
					.breakByTool(FabricToolTags.AXES, 1)
					.strength(1.0f, 30.0f)
					.luminance(1)
	);

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("voikymasm", "shop_in_a_block"), shopInABlock);
		Registry.register(Registry.ITEM, new Identifier("voikymasm", "shop_in_a_block"), new BlockItem(shopInABlock, new FabricItemSettings().group(ItemGroup.MISC)));
	}
}
