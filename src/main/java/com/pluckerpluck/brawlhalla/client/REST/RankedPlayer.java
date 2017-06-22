package com.pluckerpluck.brawlhalla.client.REST;

/**
 * BasicPlayer
 */
public class RankedPlayer extends BasicPlayer {

	private int best_legend;
	private int best_legend_games;
	private int best_legend_wins;
	private int rating;
	private int peak_rating;
	private String tier;
	private int games;
	private int wins;
	private String region;

	public int getBestLegend() {
		return best_legend;
	}

	public int getBestLegendGames() {
		return best_legend_games;
	}

	public int getBestLegendWins() {
		return best_legend_wins;
	}

	public int getRating() {
		return rating;
	}

	public int getPeakRating() {
		return peak_rating;
	}

	public String getTier() {
		return tier;
	}

	public int getGames() {
		return games;
	}

	public int getWins() {
		return wins;
	}

	public String getRegion() {
		return region;
	}
}