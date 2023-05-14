package net.shunthespy.realismmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shunthespy.realismmod.RealismMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RealismMod.MOD_ID);

    public static final RegistryObject<Item> BLACK_PEN = ITEMS.register("black_pen",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_PEN = ITEMS.register("red_pen",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEARTFELT_NOTE = ITEMS.register("heartfelt_note",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
