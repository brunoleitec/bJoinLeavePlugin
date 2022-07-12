package com.github.brunoleitec.bjoinleaveplugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import javax.print.DocFlavor;

public class JoinLeaveListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        if (player.hasPlayedBefore()) {
            e.setJoinMessage(ChatColor.GREEN + " Bem vindo de volta ao servidor." + ChatColor.YELLOW + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.GREEN + "Nós sentimos saudades de você.");
            }else{
            e.setJoinMessage(ChatColor.BLUE + "" + ChatColor.BOLD + player.getDisplayName() + ", " + ChatColor.BLUE + " Bem vindo ao melhor servidor do mundo.");
        }
    }


    @EventHandler
    public void onLeave(PlayerQuitEvent event){

        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.YELLOW +  "" + player.getDisplayName() + ChatColor.RED + "" + " Saiu, espero que volte algum dia.");

    }

}
