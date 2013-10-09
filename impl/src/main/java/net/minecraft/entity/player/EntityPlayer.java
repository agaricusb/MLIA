package net.minecraft.entity.player;

import cpw.mods.fml.common.modloader.ModLoaderGuiHelper;
import net.minecraft.client.multiplayer.NetClientHandler;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.Container;

public class EntityPlayer extends Entity {

    /** something with GUIs TODO: type */
    public int field_70170_p;

    /** open container */
    public Container field_71070_bA;

    public NetClientHandler field_71174_a;

    /** get username */
    public String func_70005_c_() {
        return null;
    }


    public void openGui(Object mod, int id, int n, int x, int y, int z) {

    }


}
