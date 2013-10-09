package net.minecraft.entity;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

public class Entity {

    /** entity id */
    public int field_70157_k;

    /** entity position x,y,z */
    public double field_70165_t;
    public double field_70163_u;
    public double field_70161_v;

    /** entity raw x,y,z */
    public int field_70118_ct;
    public int field_70117_cu;
    public int field_70116_cv;

    /** entity yaw */
    public float field_70177_z;

    /** entity pitch */
    public float field_70125_A;

    /** head yaw */
    public float field_70759_as;

    /** velocity mX, mY, mZ */
    public double field_70159_w;
    public double field_70181_x;
    public double field_70179_y;

    public Entity func_70096_w() { /** TODO return type */
        return null;
    }

    /** TODO: unknown class */
    public void func_75689_a(DataOutputStream dataOutputStream) throws IOException {
        throw new IOException();
    }

    public void func_70012_b(double scaledX, double scaledY, double scaledZ, double scaledYaw, double scaledPitch) {

    }

    /** get parts for multi-part entities */
    public Entity[] func_70021_al() {
        return null;
    }

    public void func_75687_a(List metadata) {

    }

    public void func_70016_h(double scaledSpeedX, double scaledSpeedY, double scaledSpeedZ) {

    }
}
