package svenhjol.charm.decoration.feature;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;
import svenhjol.charm.decoration.block.CustomBarrelBlock;
import svenhjol.charm.decoration.tileentity.CustomBarrelTileEntity;
import svenhjol.meson.Feature;
import svenhjol.meson.enums.WoodType;
import svenhjol.meson.handler.RegistryHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllTheBarrels extends Feature
{
    public static List<CustomBarrelBlock> barrels = new ArrayList<>();

    @ObjectHolder("charm:barrel")
    public static TileEntityType<CustomBarrelTileEntity> tile;

    @Override
    public void init()
    {
        super.init();

        Arrays.stream(WoodType.values())
            .filter(type -> !type.equals(WoodType.OAK)) // don't include the vanilla barrel
            .forEach(type -> barrels.add(new CustomBarrelBlock(type)));

        tile = TileEntityType.Builder.create(CustomBarrelTileEntity::new).build(null);

        RegistryHandler.registerTile(tile);
    }
}
