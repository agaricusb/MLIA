package net.minecraft.client.gui;

public class FontRenderer {

    /** draw line */
    public int func_78276_b(String line, int offset, int shifty, int color) {
        return 0;
    }

    /** truncate text to width */
    public String func_78269_a(String text, int width) {
        return text;
    }

    /** get width of text */
    public int func_78256_a(String text) {
        return 0;
    }

    /** render text */
    public void func_78261_a(String text, int offset, int shifty, int color) {
        System.out.println("FontRenderer: " + text);
    }

    public void func_78279_b(String text, int offset, int shifty, int rightSide, int color) {
        this.func_78261_a(text, offset, shifty, color);
    }
}
