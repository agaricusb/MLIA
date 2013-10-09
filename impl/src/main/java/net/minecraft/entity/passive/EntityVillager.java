package net.minecraft.entity.passive;

import net.minecraft.entity.Entity;
import net.minecraft.util.Tuple;
import net.minecraft.village.MerchantRecipeList;

import java.util.HashMap;
import java.util.Random;

public class EntityVillager extends Entity {

    /** emerald buy recipes */
    public static HashMap<Integer, Tuple> field_70958_bB = new HashMap<Integer, Tuple>();

    /** emerald sell recipes */
    public static HashMap<Integer, Tuple> field_70960_bC = new HashMap<Integer, Tuple>();

    /** add emerald buy recipe */
    public void func_70948_a(MerchantRecipeList merchantRecipeList, int x, Random random, float chance) {

    }

    /** add emerald sell recipe */
    public void func_70949_b(MerchantRecipeList merchantRecipeList, int x, Random random, float chance) {

    }

    /** apply random trade */
    public void func_70938_b(int n) {

    }
}
