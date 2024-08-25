package fr.bflorestal.homeManager

import org.bukkit.plugin.java.JavaPlugin

class HomeManager : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        logger.info("Hello world!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
