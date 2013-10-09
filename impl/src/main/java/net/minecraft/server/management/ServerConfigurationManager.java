package net.minecraft.server.management;

import net.minecraft.network.packet.Packet;

import java.net.SocketAddress;

public class ServerConfigurationManager {

    /** get kick reason, or null if player should not be kicked */
    public String func_72399_a(SocketAddress address, String username) {
        return null;
    }

    /** send packet to all nearby players */
    public void func_72393_a(double X, double Y, double Z, double range, int dimensionId, Packet packet) {

    }

    /** send packet to all players in dimension */
    public void func_72396_a(Packet packet, int dimId) {

    }

    /** send packet to all players */
    public void func_72384_a(Packet packet) {

    }
}
