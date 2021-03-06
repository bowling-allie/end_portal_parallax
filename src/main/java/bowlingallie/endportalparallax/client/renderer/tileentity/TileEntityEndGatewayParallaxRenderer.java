package bowlingallie.endportalparallax.client.renderer.tileentity;

import net.minecraft.tileentity.TileEntityEndPortal;

public class TileEntityEndGatewayParallaxRenderer extends TileEntityEndPortalParallaxRenderer {

    @Override
    public void render(TileEntityEndPortal endPortal, double x, double y, double z, float partialTicks, int breakProgress, float alpha) {
        super.render(endPortal, x, y, z, partialTicks, breakProgress, alpha);
    }

    @Override
    public float getOffsetTop() {
        return 1.0F;
    }

    @Override
    public float getOffsetBottom() {
        return 0.0F;
    }
}