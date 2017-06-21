package com.pluckerpluck.brawlhalla.client.types;

/**
 * BasicPlayer 
 */
public class RankedPlayer extends BasicPlayer {

	private long rank;
	private int best_legend;
	private int best_legend_games;
	private int best_legend_wins;
	private int rating;
	private int peak_rating;
	private String tier;
	private int games;
	private int wins;
	private String region;


	public long getRank() {
		return rank;
	}

	public PlayerLegend getBestLegend(){
		return new PlayerLegend(best_legend, best_legend_games, best_legend_wins);
	}

	public int getRating(){
		return rating;
	}

	public int getPeakRating(){
		return peak_rating;
	}

	public String getTier(){
		return tier;
	}

	public int getGames(){
		return games;
	}

	public int getWins() {
		return wins;
	}

	public String getRegion() {
		return region;
	}
}