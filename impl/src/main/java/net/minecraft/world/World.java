package net.minecraft.world;

import net.minecraft.entity.Entity;

public class World {

    /** get world seed */
    public long func_72905_C() {
        return 0;
    }

    public Entity func_73045_a(int throwerId) {
        return null;
    }

    /** spawn entity into client world */
    public void func_73027_a(int entityId, Entity entity) {
        System.out.println("spawned "+entity+" with "+entityId);
    }
}
