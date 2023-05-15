package net.shunthespy.realismmod.item.custom;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.decoration.Painting;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

import java.util.List;

public class BlackPenItem extends Item {
    public BlackPenItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        BlockHitResult temp = getPlayerRayResult(level, player);
        BlockPos pos = temp.getBlockPos();
        Direction dir = temp.getDirection();
        //AABB boundingBox = context.getPlayer().getBoundingBox().inflate(30.0D);
        AABB boundingBox = pushBox(dir, new AABB(pos));

        List<Painting> paintings = level.getEntitiesOfClass(Painting.class, boundingBox);
        for (int i = 0; i < paintings.size(); i++){
            paintings.get(i).discard();
        }
        return super.use(level, player, hand);
    }

    //public Painting

    private AABB pushBox(Direction direction, AABB box){
        switch (direction) {
            case NORTH:
                return box.move(0, 0, -1);
            case SOUTH:
                return box.move(0, 0, 1);
            case WEST:
                return box.move(-1, 0, 0);
            case EAST:
                return box.move(1, 0, 0);
            default:
                return box;
        }
    }
    private static BlockHitResult getPlayerRayResult(Level pLevel, Player pPlayer) { //grabbed from getPlayerPOVHitResult
        float f = pPlayer.getXRot();
        float f1 = pPlayer.getYRot();
        Vec3 vec3 = pPlayer.getEyePosition();
        float f2 = Mth.cos(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
        float f3 = Mth.sin(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
        float f4 = -Mth.cos(-f * ((float)Math.PI / 180F));
        float f5 = Mth.sin(-f * ((float)Math.PI / 180F));
        float f6 = f3 * f4;
        float f7 = f2 * f4;
        double d0 = 5.0;
        Vec3 vec31 = vec3.add((double)f6 * d0, (double)f5 * d0, (double)f7 * d0);
        return pLevel.clip(new ClipContext(vec3, vec31, ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, pPlayer));
    }

}
