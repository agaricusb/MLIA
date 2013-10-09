package net.minecraft.network.packet;

import net.minecraft.world.EnumGameType;
import net.minecraft.world.WorldType;

public class Packet1Login extends Packet {

    /** FML_HASH */
    public int field_73561_a;

    /** PROTOCOL_VERSION */
    public int field_73558_e;

    /** game type */
    public EnumGameType field_73557_d;

    /** world type */
    public WorldType field_73559_b;
}
