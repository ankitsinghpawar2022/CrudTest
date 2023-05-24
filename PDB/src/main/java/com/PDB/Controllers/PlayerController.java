package com.PDB.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.PDB.Entity.Player;
import com.PDB.Services.PlayerService;

import jakarta.websocket.server.PathParam;

@RestController
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	@RequestMapping(value = "/getAllPlayers", method = RequestMethod.GET)
	public ResponseEntity<List<Player>> getAllPlayers() {
		return ResponseEntity.ok().body(playerService.getAllPlayer());
	}

@GetMapping("/addplayer")

public ResponseEntity <Player>addPlayer(@RequestBody Player player) {
return ResponseEntity.ok().body(this.playerService.addPlayer(player));
}  
    
	
	@GetMapping("/GetPlayerByID/{id}")
	public ResponseEntity<Player> GetPlayerByID(@PathVariable int id) {
		return ResponseEntity.ok().body(this.playerService.getPlayerById(id));
	}

	@GetMapping("/updatePlayer/{id}")
	public ResponseEntity<Player> updatePlayer(@PathVariable int id, @RequestBody Player player) {
		return ResponseEntity.ok().body(this.playerService.updatePlayer(player));
	}

	@RequestMapping(value ="/deleteplayer/{id}", method = RequestMethod.DELETE)
	public HttpStatus deleteplayer(@PathVariable int id) {
		this.playerService.deletPlayer(id);
		return HttpStatus.OK;
	}
}
