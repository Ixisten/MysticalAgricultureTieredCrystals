package com.electrolyte.matc;

import com.electrolyte.matc.config.MATCModConfig;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MATC.MOD_ID)
public class MATC {

    public static final String MOD_ID = "matc";
    public static final Logger logger = LogManager.getFormatterLogger(MATC.MOD_ID);

    public MATC() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, MATCModConfig.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MATCModConfig.COMMON_CONFIG);

        ModRegistry.init();

    }

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab("matc") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModRegistry.SUPREMIUMCRYSTAL.get());
        }
    };
}
