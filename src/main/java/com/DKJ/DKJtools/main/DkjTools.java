package com.DKJ.DKJtools.main;

import com.DKJ.DKJtools.regi.DkjToolsItems;
import com.DKJ.DKJtools.regi.tab.DkjToolsTabs;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("dkjtools")

public class DkjTools {

    //IDを初期化するぞ
    public static final String MOD_ID = "dkjtools";

    //
    public DkjTools(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        DkjToolsItems.ITEMS.register(bus);
        DkjToolsTabs.MOD_TABS.register(bus);
    }

}
