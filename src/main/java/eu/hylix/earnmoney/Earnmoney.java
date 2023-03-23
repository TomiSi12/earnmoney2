package eu.hylix.earnmoney;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;

public final class Earnmoney extends JavaPlugin implements Listener {


    public static int money = 0;

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(this,this);
    }
    @EventHandler
    public void onBlock(BlockBreakEvent event){
        Player player = event.getPlayer();
        Block block = event.getBlock();
        if (block.getType() == Material.STONE){
            money += 2;
            player.sendMessage(String.format("money: %d"+block.getType(),money));
            scoreboard.scoboard(player);

        }
        else if (block.getType() == Material.DIAMOND_ORE){
            money +=20;
            player.sendMessage(String.format("money: %d"+block.getType(),money));
            scoreboard.scoboard(player);
        }
        else if (block.getType() == Material.DIRT){
            money +=1;
            player.sendMessage(String.format("+1€"+block.getType()));
            scoreboard.scoboard(player);
        }


    }

@EventHandler
public void joinevent(PlayerJoinEvent event){
        scoreboard.scoboard(event.getPlayer());
}

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
