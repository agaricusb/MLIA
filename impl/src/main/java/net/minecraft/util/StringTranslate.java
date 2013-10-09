package net.minecraft.util;

import net.minecraft.client.gui.GuiSmallButton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StringTranslate {
    private final static StringTranslate instance = new StringTranslate();

    public HashMap<GuiSmallButton, String> field_73887_h = new HashMap<GuiSmallButton, String>(); // TODO: collection type. add()

    /** get shared instance */
    public static StringTranslate func_74808_a() {
        return instance;
    }

    /** get current language */
    public String func_74811_c() {
        return "en_US";
    }

    /** reload language table */
    public void func_74810_a(String language, boolean flag) {

    }

    /** return localized string */
    public String func_74805_b(String key) {
        return null;
    }
}
