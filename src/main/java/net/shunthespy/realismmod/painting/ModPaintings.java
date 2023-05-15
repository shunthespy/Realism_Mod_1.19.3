package net.shunthespy.realismmod.painting;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shunthespy.realismmod.RealismMod;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, RealismMod.MOD_ID);

    public static final RegistryObject<PaintingVariant> PEARL = PAINTING_VARIANTS.register("pearl",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> SCREAM = PAINTING_VARIANTS.register("scream",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> MONA = PAINTING_VARIANTS.register("mona",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> STARRY = PAINTING_VARIANTS.register("starry",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> ADAM = PAINTING_VARIANTS.register("adam",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> DOODLE_1 = PAINTING_VARIANTS.register("doodle1",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> DOODLE_2 = PAINTING_VARIANTS.register("doodle2",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> DOODLE_3 = PAINTING_VARIANTS.register("doodle3",
            () -> new PaintingVariant(16, 16));

    public static void register(IEventBus eventBus){
        PAINTING_VARIANTS.register(eventBus);
    }
}
