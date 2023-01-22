package com.integral.proximitychat;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ProximityChat.MODID, version = ProximityChat.VERSION, name = ProximityChat.NAME)
public class ProximityChat {
    public static final String MODID = "proximitychat";
    public static final String NAME = "Proximity Chat";
    public static final String VERSION = "@VERSION@";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    };
}
