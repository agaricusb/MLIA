package net.minecraft.network.packet;

import cpw.mods.fml.common.network.FMLPacket;

public class Packet250CustomPayload extends Packet {


    /** target */
    public String field_73630_a;

    /** data */
    public byte[] field_73629_c;

    /** length */
    public int field_73628_b;

    public Packet250CustomPayload() {

    }

    public Packet250CustomPayload(String type, byte[] data) {

    }


}
