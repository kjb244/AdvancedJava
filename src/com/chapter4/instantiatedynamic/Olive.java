package com.chapter4.instantiatedynamic;

public class Olive {

	public OliveName oliveName;
	public OliveColor color;
	
	public Olive(OliveName oliveName, OliveColor color) {
		this.oliveName = oliveName;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "oliveName: " + this.oliveName.toString() +
			", color: " + this.color.toString();
	}

}
