package fun.pwsg.main;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener {
    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new PlayerArmorListener(), this);
        getLogger().info("插件已成功启动!");
    }
    @Override
    public void onDisable(){
        getLogger().info("插件已经卸载！");
    }
}
