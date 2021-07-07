package fr.voikyrioh.voikymasm.registry;

import fr.voikyrioh.voikymasm.blocks.ShopInABlock;
import fr.voikyrioh.voikymasm.blocks.VoltiumCoin;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRegistry {

    //#region SOUNDS INIT
    public static final SoundEvent COIN_POSE = new SoundEvent(new Identifier("voikymasm", "block.coin_pose"));
    public static final SoundEvent COIN_WALK = new SoundEvent(new Identifier("voikymasm", "block.coin_walk"));
    public static final SoundEvent COIN_USE = new SoundEvent(new Identifier("voikymasm", "block.coin_use"));
    public static final SoundEvent COIN_DESTROY = new SoundEvent(new Identifier("voikymasm", "block.coin_destroy"));
    //#endregion

    //#region BLOCKS INIT
    public static final Block SHOP_IN_A_BLOCK = new ShopInABlock(
            FabricBlockSettings
                    .of(Material.WOOD)
                    .sounds(BlockSoundGroup.WOOD)
                    .breakByTool(FabricToolTags.AXES, 1)
                    .strength(1.0f, 30.0f)
                    .luminance(5)
    );
    public static final Block VOLTIUM_COIN = new VoltiumCoin(
            FabricBlockSettings
                    .of(Material.METAL)
                    .sounds(new BlockSoundGroup(1.0f, 1.0f, COIN_DESTROY, COIN_WALK, COIN_USE, COIN_POSE, COIN_DESTROY))
                    .breakInstantly()
                    .luminance(1)
    );
    //#endregion

    //#region BLOCK ITEMS INIT
    public static final BlockItem SHOP_IN_A_BLOCK_ITEM = new BlockItem(SHOP_IN_A_BLOCK, new FabricItemSettings().group(ItemGroup.MISC));
    public static final BlockItem VOLTIUM_COIN_ITEM = new BlockItem(VOLTIUM_COIN, new FabricItemSettings().group(ItemGroup.MISC));
    //#endregion

    //#region ITEMS INIT

    //#endregion

    // Register all MASM Items
    public static void addSoundsToRegistry() {
        Registry.register(Registry.SOUND_EVENT, new Identifier("voikymasm", "block.coin_pose"), COIN_POSE);
        Registry.register(Registry.SOUND_EVENT, new Identifier("voikymasm", "block.coin_walk"), COIN_WALK);
        Registry.register(Registry.SOUND_EVENT, new Identifier("voikymasm", "block.coin_use"), COIN_USE);
        Registry.register(Registry.SOUND_EVENT, new Identifier("voikymasm", "block.coin_destroy"), COIN_DESTROY);
    }

    // Register all MASM Blocks
    public static void addBlocksToRegistry() {
        Registry.register(Registry.BLOCK, new Identifier("voikymasm", "shop_in_a_block"), SHOP_IN_A_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("voikymasm", "voltium_coin"), VOLTIUM_COIN);
    }

    // Register all MASM Block's item version
    public static void addBlockItemsToRegistry() {
        Registry.register(Registry.ITEM, new Identifier("voikymasm", "shop_in_a_block"), SHOP_IN_A_BLOCK_ITEM);
        Registry.register(Registry.ITEM, new Identifier("voikymasm", "voltium_coin"), VOLTIUM_COIN_ITEM);
    }

    // Register all MASM Items
    public static void addItemsToRegistry() {

    }
}
