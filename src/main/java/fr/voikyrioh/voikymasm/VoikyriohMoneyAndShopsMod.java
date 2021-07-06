package fr.voikyrioh.voikymasm;

import fr.voikyrioh.voikymasm.registry.ModRegistry;
import net.fabricmc.api.ModInitializer;
public class VoikyriohMoneyAndShopsMod implements ModInitializer {

	@Override
	public void onInitialize() {
		// Init mod Registry
		ModRegistry.addBlocksToRegistry();
		ModRegistry.addBlockItemsToRegistry();
		ModRegistry.addItemsToRegistry();
	}
}
