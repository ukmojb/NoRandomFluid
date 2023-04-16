package com.wdcftgg.norandomfluid.core;

import java.util.Map;
import javax.annotation.Nullable;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Mixins;

@IFMLLoadingPlugin.MCVersion(value="1.12.2")
@IFMLLoadingPlugin.Name(value="norandomfluid")
public class CoreMod
        implements IFMLLoadingPlugin {
    public String[] getASMTransformerClass() {
        return new String[0];
    }

    public String getModContainerClass() {
        return null;
    }

    @Nullable
    public String getSetupClass() {
        return null;
    }

    public void injectData(Map<String, Object> data) {
        MixinBootstrap.init();
        Mixins.addConfiguration((String)"mixins.norandomfluid.json");
        MixinEnvironment.getDefaultEnvironment().setSide(MixinEnvironment.Side.CLIENT);
    }

    public String getAccessTransformerClass() {
        return null;
    }
}
