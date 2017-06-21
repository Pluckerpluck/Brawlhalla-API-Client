package com.pluckerpluck.brawlhalla.client.types;

public enum Region {
	EU("eu"),
	US_E("us-e"),
	US_W("us-w"),
	SEA("sea"),
	BRZ("brz"),
	AUS("aus"),
	ALL("all");

	private String value;

    Region(String value) {
        this.value = value;
    }

	@Override
    public String toString() {
        return value;
    }
}