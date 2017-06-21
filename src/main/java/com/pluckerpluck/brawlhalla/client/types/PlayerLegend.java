package com.pluckerpluck.brawlhalla.client.types;

/**
 * Legend
 */
public class PlayerLegend {

	private final int id;
	private final int games;
	private final int wins;

	public PlayerLegend (int id, int games, int wins) {
		this.id = id;
		this.games = games;
		this.wins = wins;
	}

	public int getLegend(){
		return id;
	}

	public int getGames(){
		return games;
	}

	public int getWins(){
		return wins;
	}
}