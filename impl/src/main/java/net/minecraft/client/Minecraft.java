package net.minecraft.client;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.RenderEngine;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.crash.CrashReport;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.io.InputStream;

public class Minecraft {


    public RenderEngine field_71446_o;

    /* texture packs - not implemented */
    public Minecraft field_71418_C;
    /** get current texture path */
    public Minecraft func_77292_e() { return this; }
    /** open stream for image path in current texture path */
    public InputStream func_77532_a(String path) { return null; }

    /** current world loaded, or null if none loaded */
    public WorldClient field_71441_e;

    public GuiScreen field_71462_r;

    /** game settings, including key bindings */
    public GameSettings field_71474_y;

    public EntityPlayer field_71439_g;

    public void func_71373_a(Object o) {

    }

    /** are in we in demo mode? */
    public boolean func_71355_q() {
        return false;
    }

    public void func_71377_b(CrashReport crashReport) {
        System.out.println("Crashed :(" + crashReport);
    }
}
