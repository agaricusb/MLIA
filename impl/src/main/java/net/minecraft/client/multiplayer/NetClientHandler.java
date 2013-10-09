package net.minecraft.client.multiplayer;

import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet131MapData;

public class NetClientHandler extends NetHandler {

    /** send packet to client */
    public void func_72552_c(Packet packet) {

    }

    public void fmlPacket131Callback(Packet131MapData mapData) {

    }

    public static void setConnectionCompatibilityLevel(byte compatibilityLevel) {

    }

    public static byte getConnectionCompatibilityLevel() {
        return 0;
    }

    /** nuke the connection */
    public void func_72553_e() {

    }
}
