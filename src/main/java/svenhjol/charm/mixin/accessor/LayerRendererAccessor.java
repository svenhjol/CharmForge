package svenhjol.charm.mixin.accessor;

import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(LayerRenderer.class)
public interface LayerRendererAccessor<T extends Entity, M extends EntityModel<T>> {
    @Accessor
    void setEntityRenderer(IEntityRenderer<T, M> renderer);
}
