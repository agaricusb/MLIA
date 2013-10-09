package net.minecraft.client.renderer.tileentity;

import net.minecraft.tileentity.TileEntity;

import java.util.HashMap;
import java.util.Map;

public class TileEntityRenderer {

    /** shared instance */
    public static TileEntityRenderer field_76963_a = new TileEntityRenderer();

    public HashMap<Class<? extends TileEntity>, TileEntitySpecialRenderer> field_76966_m;
}
