package com.PDB.Services;

import java.util.List;

import com.PDB.Entity.Player;

public interface PlayerService {
	
	public Player addPlayer(Player player);
	
	public Player updatePlayer(Player player);
	
	public List<Player> getAllPlayer();
	
	public Player getPlayerById(int pId);
	
	public void deletPlayer(int id);

}
