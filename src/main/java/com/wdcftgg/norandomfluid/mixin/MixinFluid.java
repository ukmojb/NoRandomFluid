package com.wdcftgg.norandomfluid.mixin;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

import java.util.Map;

@Mixin(ItemStack.class)
public abstract class MixinFluid {
    @Inject(method = "trigger", at = @At("HEAD"), cancellable = true)
    private void trigger(World world, BlockPos pos, EntityPlayer player, Map<String, Object> settings) {
    }
}
