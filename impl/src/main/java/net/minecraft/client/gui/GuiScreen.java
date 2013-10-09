package net.minecraft.client.gui;

import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.List;

public class GuiScreen {

    public int field_73880_f;
    public int field_73881_g;
    protected FontRenderer field_73886_k;
    protected Minecraft field_73882_e;
    public List<Object> field_73887_h = new ArrayList<Object>();
    public double field_73735_i;

    public GuiScreen() {

    }


    public void func_73866_w_() {

    }

    public void func_73873_v_() {

    }

    /** draw text */
    protected void func_73732_a(FontRenderer fontRenderer, String text, int x, int offset, int color) {
        System.out.println("GuiScreen: " + text);
    }

    /** draw the whole screen */
    public void func_73863_a(int a, int b, float c) {

    }

    protected void func_73875_a(GuiButton button) {

    }
}
