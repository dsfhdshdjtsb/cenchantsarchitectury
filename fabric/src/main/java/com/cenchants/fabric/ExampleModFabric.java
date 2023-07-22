package com.cenchants.fabric;

import com.cenchants.fabriclike.ExampleModFabricLike;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ExampleModFabricLike.init();
    }
}
