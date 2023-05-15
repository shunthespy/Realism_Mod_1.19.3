package net.shunthespy.realismmod.item.custom;

import net.minecraft.resources.ResourceKey;
import net.shunthespy.realismmod.painting.ModPaintings;

public class RedPenItem extends PenItem{
    public RedPenItem(Properties properties) {
        super(properties);
    }

    @Override
    public ResourceKey thisVariant() {
        return ModPaintings.SCREAM.getKey();
    }
}
