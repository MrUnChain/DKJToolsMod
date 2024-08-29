package com.DKJ.DKJtools.regi.tab;

import com.DKJ.DKJtools.main.DkjTools;
import com.DKJ.DKJtools.regi.DkjToolsItems;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class DkjToolsTabs {
    public static final DeferredRegister<CreativeModeTab> MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DkjTools.MOD_ID);

    //modのメインのタブ
    public static final RegistryObject<CreativeModeTab> DKJTOOLS_MAIN = MOD_TABS.register("dkjtools_main", 
        ()-> {return CreativeModeTab.builder()
            .icon(()->new ItemStack(DkjToolsItems.AMI_INGOT.get()))
            .title(Component.translatable("itemGroup.dkjtools_main"))
            .displayItems((param,output)->{
                for(Item item:DkjMain.items){
                    output.accept(item);
                }
            })
            .build();
        });
    
    //modのサブのタブ
    public static final RegistryObject<CreativeModeTab> DKJTOOLS_SUB = MOD_TABS.register("dkjtools_sub", 
    ()-> {return CreativeModeTab.builder()
        .icon(()->new ItemStack(Blocks.CHERRY_PLANKS))
        .title(Component.translatable("itemGroup.dkjtools_sub"))
        .withTabsBefore(DkjToolsTabs.DKJTOOLS_MAIN.getId())
        .displayItems((param,output)->{
            for(Item item:DkjMain.items){
                output.accept(item);
            }
        })
        .build();
    });

}
