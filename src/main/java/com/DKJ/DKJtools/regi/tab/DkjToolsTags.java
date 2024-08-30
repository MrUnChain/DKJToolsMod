package com.DKJ.DKJtools.regi.tab;

import com.DKJ.DKJtools.main.DkjTools;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class DkjToolsTags {

    // ブロックのタグ追加
    public static class Blocks{
        //タグ登録の型
        private static TagKey<Block> tag (String name){
            return BlockTags.create(new ResourceLocation(DkjTools.MOD_ID, name));
        }
    }

    // アイテムのタグ追加
    public static class Items{

        public static final TagKey<Item> DKJTOOLS_SERIES = tag("dkjtools_series");
        //タグ登録の型
        private static TagKey<Item> tag (String name){
            return ItemTags.create(new ResourceLocation(DkjTools.MOD_ID, name));
        }
    }
}
