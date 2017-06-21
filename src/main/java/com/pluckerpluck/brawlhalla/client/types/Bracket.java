package com.pluckerpluck.brawlhalla.client.types;

public enum Bracket {
	ONE_VS_ONE("1v1"),
	TWO_VS_TWO("2v2");

	private String value;

    Bracket(String value) {
        this.value = value;
    }

	@Override
    public String toString() {
        return value;
    }
}