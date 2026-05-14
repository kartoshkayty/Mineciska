package meteordevelopment.meteorclient.mixin;

import net.minecraft.client.gui.screen.SplashOverlay;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import java.util.function.IntSupplier;

@Mixin(SplashOverlay.class)
public class SplashOverlayMixin {
    @Mutable
    @Shadow @Final
    private static IntSupplier BRAND_ARGB;

    static {
        BRAND_ARGB = () -> 0xff209920;
    }
}
