package net.shunthespy.realismmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BURGER = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.4F)
            .effect(new MobEffectInstance(MobEffects.POISON, 200, 3), 1.0F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 200, 0), 1.0F).meat().build();
    public static final FoodProperties COOKED_BURGER = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.4F)
            .effect(new MobEffectInstance(MobEffects.WITHER, 200, 2), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HARM, 1, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.BLINDNESS, 200, 3), 1.0F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 200, 3), 1.0F).meat().build();
}
