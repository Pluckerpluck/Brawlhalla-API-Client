package com.pluckerpluck.brawlhalla.client.REST;

import javax.swing.plaf.metal.MetalBorders.InternalFrameBorder;

/**
 * Team
 */
public class Team extends RankedPlayer {

    private int brawlhalla_id_one;
    private int brawlhalla_id_two;
    private int rating;
    private int peak_rating;
    private String tier;
    private int wins;
    private int games;
    private String teamname;
    private int region; //What?
    private int global_rank;

	public int getPlayerOne() {
		return brawlhalla_id_one;
	}

    public int getPlayerTwo() {
		return brawlhalla_id_two;
	}

}