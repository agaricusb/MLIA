package net.minecraft.network.packet;

import cpw.mods.fml.common.network.FMLPacket;

public class Packet250CustomPayload extends Packet {

    public Packet250CustomPayload(String type, byte[] data) {

    }

    /** target */
    public String field_73630_a;

    /** data */
    public byte[] field_73629_c;
}
