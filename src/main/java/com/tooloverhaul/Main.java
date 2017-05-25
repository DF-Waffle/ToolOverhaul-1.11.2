package com.tooloverhaul;


import com.tooloverhaul.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = TOGlobal.MOD_ID, name = TOGlobal.MOD_NAME, version = TOGlobal.VERSION)
public class Main {

    @Mod.Instance(TOGlobal.MOD_ID)
    public static Main instance;
    @SidedProxy(clientSide = TOGlobal.TO_CLIENT_PROXY, serverSide = TOGlobal.TO_COMMON_PROXY)
    public static CommonProxy proxy;


}
