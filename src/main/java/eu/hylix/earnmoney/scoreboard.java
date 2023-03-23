package eu.hylix.earnmoney;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

public class scoreboard {
    public static void scoboard(Player player){
        Scoreboard sb = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective ob = sb.registerNewObjective("123", "abc");
        ob.getScore(Earnmoney.money+"€").setScore(0);
        ob.setDisplaySlot(DisplaySlot.SIDEBAR);
        ob.setDisplayName("Fortnite");
        ob.getScore("Konto:").setScore(1);
        ob.getScore("§0").setScore(2);
        ob.getScore(player.getName()).setScore(3);
        ob.getScore("Spieler:").setScore(4);
        ob.getScore("§1").setScore(5);

        player.setScoreboard(sb);
    }

}