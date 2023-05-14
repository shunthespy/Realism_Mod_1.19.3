package net.shunthespy.realismmod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.shunthespy.realismmod.RealismMod;

@Mod.EventBusSubscriber(modid = RealismMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab REALISM_TAB;

    @SubscribeEvent
    public static void registerCreativeModTabs(CreativeModeTabEvent.Register event){
        REALISM_TAB = event.registerCreativeModeTab(new ResourceLocation(RealismMod.MOD_ID, "realism_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.BLACK_PEN.get()))
                        .title(Component.translatable("creativemodetab.realism_tab")));
    }
}
