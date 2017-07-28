package com.kwu.designpattern.factory;

public class American implements Currency {

	@Override
	public String getCurrency() {
		return "USA";
	}

	@Override
	public String getSymbol() {
		return"US";
	}

}
