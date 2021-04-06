package fr.twitmund.cmds;

import fr.twitmund.ui.MenuP;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class cmds implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String arg, String[] args) {
        Player player = (Player)sender;

        while (!(sender instanceof Player)) System.out.println("Tu n'est pas un joueur");

        if (cmd.getName().equalsIgnoreCase("shop")) {
                player.sendMessage("Yes");

                new MenuP().open(player);

                return false;
        }


        return false;

    }
}
