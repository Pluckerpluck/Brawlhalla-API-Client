package com.pluckerpluck.brawlhalla.client;

/**
 * 
 */
public class Player {

    private final API service;

	private int brawlhalla_id;
	private String name;

    protected Player(API api) {
        this.service = api;
    }

	public int getID() {
		return brawlhalla_id;
	}

	public String getName() {
		return name;
	}

    /**********************
     *    Rankings Data   *
     **********************/


    protected void load() {

    }

}