package net.minecraft.item;

import net.minecraft.block.Block;

public class ItemStack {

    /** stack size */
    public int field_77994_a;

    /** item id */
    public int field_77993_c;

    public ItemStack(Item item, int damage, int count) {

    }

    public ItemStack(Block block, int damage, int count) {

    }

    /** get Item corresponding to this ItemStack */
    public Item func_77973_b() {
        return null;
    }

    /** normalize item stack */
    public ItemStack func_77946_l() {
        return null;
    }

    /** get stack size */
    public int func_77976_d() {
        return field_77994_a;
    }
}
