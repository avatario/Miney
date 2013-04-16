    package {$TopLevelDomain}.{$Domain}.{$PluginName};
     
    import org.bukkit.plugin.java.JavaPlugin;
     
    public final class {$PluginName} extends JavaPlugin {
     
    	public void onEnable(){
    		getLogger().info("onEnable has been invoked!");
    	}
     
    	public void onDisable(){
    		getLogger().info("onDisable has been invoked!");
    	}
    }