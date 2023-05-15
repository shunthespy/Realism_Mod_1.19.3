package net.shunthespy.realismmod.item.custom;

import net.minecraft.resources.ResourceKey;
import net.shunthespy.realismmod.painting.ModPaintings;

public class GreenPenItem extends PenItem{
    public GreenPenItem(Properties properties) {
        super(properties);
    }

    @Override
    public ResourceKey thisVariant() {
        return ModPaintings.MONA.getKey();
    }
}
