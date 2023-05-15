package net.shunthespy.realismmod.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class HeartfeltNoteItem extends Item {
    public HeartfeltNoteItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack itemStack, Player player, LivingEntity entity, InteractionHand hand) {
        itemStack.setCount(itemStack.getCount() - 1);
        ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 5));
        return super.interactLivingEntity(itemStack, player, entity, hand);
    }
}
