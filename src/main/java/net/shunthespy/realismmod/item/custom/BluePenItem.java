package net.shunthespy.realismmod.item.custom;

import net.minecraft.resources.ResourceKey;
import net.shunthespy.realismmod.painting.ModPaintings;

public class BluePenItem extends PenItem{
    public BluePenItem(Properties properties) {
        super(properties);
    }

    @Override
    public ResourceKey thisVariant() {
        return ModPaintings.STARRY.getKey();
    }
}
