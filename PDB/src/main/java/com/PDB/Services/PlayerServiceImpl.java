package com.PDB.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PDB.Entity.Player;
import com.PDB.Exception.ResourceNotFoundException;
import com.PDB.Repositories.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	@Override
	public Player addPlayer(Player player) {
		// TODO To add a new Player in database

		return playerRepository.save(player);
	}

	@Override
	public Player updatePlayer(Player player) {
		// TODO To update the product
		Optional<Player> PlayerDB = this.playerRepository.findById(player.getpId());

		// check if given id is present or not

		if (PlayerDB.isPresent()) {
			System.out.println("Starting updating the player");

			Player playerUpdate = PlayerDB.get();
			playerUpdate.setpId(player.getpId());
			playerUpdate.setfName(player.getfName());
			playerUpdate.setlName(player.getlName());
			playerUpdate.setState(player.getState());
			playerUpdate.setTeam(player.getTeam());
			return playerUpdate;
		} else {
			throw new ResourceNotFoundException("Record not found " + player.getpId());
		}

	}

	@Override
	public List<Player> getAllPlayer() {
		// TODO Auto-generated method stub
		return this.playerRepository.findAll();
	}

	@Override
	public Player getPlayerById(int pId) {
		// TODO Auto-generated method stub
		Optional<Player> PlayerDB = this.playerRepository.findById(pId);

		// check if given id is present or not

		if (PlayerDB.isPresent()) {
			System.out.println("Player is present");

			return PlayerDB.get();
		} else {
			throw new ResourceNotFoundException("Record not found ");
		}

	}

	@Override
	public void deletPlayer(int id) {
		// TODO Auto-generated method stub

		Optional<Player> PlayerDB = this.playerRepository.findById(id);

		// check if given id is present or not

		if (PlayerDB.isPresent()) {

			this.playerRepository.delete(PlayerDB.get());

		} else {
			throw new ResourceNotFoundException("Record not found ");
		}

	}

}
