package com.wdcftgg.norandomfluid.mixin;


import chanceCubes.rewards.defaultRewards.BaseCustomReward;
import chanceCubes.rewards.giantRewards.FluidSphereReward;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.Map;


@Mixin(FluidSphereReward.class)
public abstract class MixinFluidSphereReward extends BaseCustomReward{


    private MixinFluidSphereReward() {
        super("chancecubes:fluid_sphere", 0);
    }

    /**
     * @author : Tang xuanyu
     * @reason : modifty
     */
    @Overwrite(remap = false)
    public void trigger(World world, BlockPos pos, EntityPlayer player, Map<String, Object> settings) {
        player.sendMessage(new TextComponentString("抱歉，我们拒绝为您提供随机液体"));
    }

}
