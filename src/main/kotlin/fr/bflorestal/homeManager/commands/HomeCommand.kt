package fr.bflorestal.homeManager.commands

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class HomeCommand : CommandExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        if (sender !is Player) return false

        sender.sendMessage(Component.text("Téléportation en cours...")
            .color(TextColor.fromHexString("#00FF00")))

        sender.teleport(sender.world.spawnLocation)

        return true
    }
}