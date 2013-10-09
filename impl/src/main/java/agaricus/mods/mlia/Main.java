package agaricus.mods.mlia;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.ArgsWrapper;
import cpw.mods.fml.relauncher.FMLRelauncher;
import net.minecraft.client.Minecraft;

public class Main {

    public static void main(String[] args) {

        System.setProperty("fml.core.libraries.mirror", "https://dl.dropboxusercontent.com/u/126404991/fmllibs/%s");

        FMLRelauncher.handleClientRelaunch(new ArgsWrapper(args));
    }
}
