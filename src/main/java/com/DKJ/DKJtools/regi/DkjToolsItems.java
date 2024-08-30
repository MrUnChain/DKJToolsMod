package com.DKJ.DKJtools.regi;

import com.DKJ.DKJtools.item.Ami_Anorthite;
import com.DKJ.DKJtools.main.DkjTools;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DkjToolsItems {
    //アイテム生成する手段の準備
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DkjTools.MOD_ID);

    //灰長石を生成
    public static final RegistryObject<Item> AMI_INGOT = ITEMS.register("kaityouseki", Ami_Anorthite::new);
}
