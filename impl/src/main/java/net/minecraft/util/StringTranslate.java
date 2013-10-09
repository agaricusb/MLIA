package net.minecraft.util;

public class StringTranslate {
    private final static StringTranslate instance = new StringTranslate();

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
}
