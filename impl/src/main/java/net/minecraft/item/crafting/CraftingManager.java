package net.minecraft.item.crafting;

import net.minecraft.item.ItemStack;

import java.util.List;

public class CraftingManager {

    private static final CraftingManager instance = new CraftingManager();
    private List<Object> recipes;

    /** get shared instance */
    public static CraftingManager func_77594_a() {
        return instance;
    }

    public List<Object> func_77592_b() {
        return recipes;
    }

    /** add shaped recipe */
    public IRecipe func_92103_a(ItemStack output, Object... params) {
        return null;
    }

    /** add shapeless recipe */
    public void func_77596_b(ItemStack output, Object... params) {

    }
}
