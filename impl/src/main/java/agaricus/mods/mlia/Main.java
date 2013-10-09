package agaricus.mods.mlia;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.Minecraft;

public class Main {

    public static void main(String[] args) {

        Minecraft client = new Minecraft();

        System.out.println("MLIA loading...");
        FMLClientHandler.instance().beginMinecraftLoading(client);
        System.out.println("Finishing loading");
        FMLClientHandler.instance().finishMinecraftLoading();
        System.out.println("Initialization completing");
        FMLClientHandler.instance().onInitializationComplete();
        System.out.println("Done");
    }
}
