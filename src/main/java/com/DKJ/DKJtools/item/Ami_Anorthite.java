package com.DKJ.DKJtools.item;

//以下タグ確認時の使用
/*
import com.DKJ.DKJtools.regi.tab.DkjToolsTags;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
*/


import net.minecraft.world.item.Item;

public class Ami_Anorthite extends Item {

    public Ami_Anorthite() {
        super(new Properties()
            .fireResistant() //火で消えないよ
            .stacksTo(75)); //スタックするぞ
    }

    //タグ追加できてるか確認
    /*@Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand){
        ItemStack stack = player.getItemInHand(hand);
        if (stack.is(DkjToolsTags.Items.DKJTOOLS_SERIES)) {
            player.addEffect(new MobEffectInstance(MobEffects.GLOWING, 20*60*3, 0));
        }else{
            player.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 20*60*3, 0));
        }
        return InteractionResultHolder.consume(stack);
    } */


}
