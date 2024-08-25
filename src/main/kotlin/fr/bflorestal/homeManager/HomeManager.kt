package fr.bflorestal.homeManager

import fr.bflorestal.homeManager.commands.HomeCommand
import org.bukkit.plugin.java.JavaPlugin

class HomeManager : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        logger.info("Plugin initialisé !")

        // Register commands
        registerCommands()
    }

    private fun registerCommands() {
        getCommand("home")?.setExecutor(HomeCommand())
        logger.info("Commande /home initialisée !")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("Plugin désactivé !")
    }
}
