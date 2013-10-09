package agaricus.mods.mlia;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.ArgsWrapper;
import cpw.mods.fml.relauncher.FMLRelauncher;
import net.minecraft.client.Minecraft;

public class Main {

    public static void main(String[] args) {

        Minecraft client = new Minecraft();

        FMLRelauncher.handleClientRelaunch(new ArgsWrapper(args));
    }
}
