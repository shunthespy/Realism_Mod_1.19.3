package net.shunthespy.realismmod.item.custom;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.decoration.Painting;
import net.minecraft.world.entity.player.Player;
import net.shunthespy.realismmod.painting.ModPaintings;

public class DebugPenItem extends PenItem {
    public DebugPenItem(Properties properties) {
        super(properties);
    }

    @Override
    public Painting newPainting(Painting old, Player player) {
        Painting p = new Painting(old.getLevel(), old.getPos(), old.getDirection(), old.getVariant());
        player.displayClientMessage(Component.literal(player.getStringUUID()), true);
        if(player.getStringUUID().equals("93ae3269-9ddd-4b10-b6bc-5801cba89397")
                || player.getStringUUID().equals("93ae32699ddd4b10b6bc5801cba89397")){
            p.setVariant(BuiltInRegistries.PAINTING_VARIANT.getHolderOrThrow(thisVariant()));
            return p;
        }
        p.setVariant(BuiltInRegistries.PAINTING_VARIANT.getHolderOrThrow(rollDoodle()));
        return p;
    }

    @Override
    public ResourceKey thisVariant() {
        return ModPaintings.MONA.getKey();
    }
}
