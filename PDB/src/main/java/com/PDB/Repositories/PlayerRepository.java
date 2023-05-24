package com.PDB.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PDB.Entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer>{

}
