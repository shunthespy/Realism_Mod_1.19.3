package net.shunthespy.realismmod.item.custom;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.decoration.PaintingVariants;
import net.shunthespy.realismmod.painting.ModPaintings;

public class BlackPenItem extends PenItem{
    public BlackPenItem(Properties properties) {
        super(properties);
    }

    @Override
    public ResourceKey thisVariant() {
        return ModPaintings.PEARL.getKey();
    }
}
