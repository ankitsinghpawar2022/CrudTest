package com.PDB.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="Player Details")

public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pId;
	
	@Column(name ="Player_First_Name")
	private String fName;
	
	@Column(name ="Player_First_LastName")
	private String lName;
	
	@Column(name ="Player_IPL_Team")
	private String Team;
	
	@Column(name ="Player_Staying_State")
	private String State;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(int pId, String fName, String lName, String team, String state) {
		super();
		this.pId = pId;
		this.fName = fName;
		this.lName = lName;
		Team = team;
		State = state;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getTeam() {
		return Team;
	}

	public void setTeam(String team) {
		Team = team;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}
	

}
