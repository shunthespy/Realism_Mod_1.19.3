package net.shunthespy.realismmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shunthespy.realismmod.RealismMod;
import net.shunthespy.realismmod.item.custom.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RealismMod.MOD_ID);

    public static final RegistryObject<Item> BLACK_PEN = ITEMS.register("black_pen",
            () -> new BlackPenItem(new Item.Properties()));//thinking there was probably a better way to do this but idc
    public static final RegistryObject<Item> RED_PEN = ITEMS.register("red_pen",
            () -> new RedPenItem(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_PEN = ITEMS.register("blue_pen",
            () -> new BluePenItem(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_PEN = ITEMS.register("green_pen",
            () -> new GreenPenItem(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_PEN = ITEMS.register("white_pen",
            () -> new WhitePenItem(new Item.Properties()));
    public static final RegistryObject<Item> DEBUG_PEN = ITEMS.register("debug_pen",
            () -> new DebugPenItem(new Item.Properties()));
    public static final RegistryObject<Item> HEARTFELT_NOTE = ITEMS.register("heartfelt_note",
            () -> new HeartfeltNoteItem(new Item.Properties()));
    public static final RegistryObject<Item> CLAY_LAYER = ITEMS.register("clay_layer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUN_HALF = ITEMS.register("bun_half",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUN = ITEMS.register("bun",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PATTY = ITEMS.register("patty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ONION = ITEMS.register("onion",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BURGER = ITEMS.register("burger",
            () -> new Item(new Item.Properties().food(ModFoods.BURGER)));
    public static final RegistryObject<Item> COOKED_BURGER = ITEMS.register("cooked_burger",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_BURGER)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
