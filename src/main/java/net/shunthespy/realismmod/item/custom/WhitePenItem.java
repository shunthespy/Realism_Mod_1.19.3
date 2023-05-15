package net.shunthespy.realismmod.item.custom;

import net.minecraft.resources.ResourceKey;
import net.shunthespy.realismmod.painting.ModPaintings;

public class WhitePenItem extends PenItem{
    public WhitePenItem(Properties properties) {
        super(properties);
    }

    @Override
    public ResourceKey thisVariant() {
        return ModPaintings.ADAM.getKey();
    }
}
