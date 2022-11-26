package com.example.note;

public class country_data {

private String country_name;
private String country_population;
private String country_land;
private String country_flag;

public country_data(String country_name, String country_population, String country_land, String country_flag) {
	this.country_name = country_name;
	this.country_population = country_population;
	this.country_land = country_land;
	this.country_flag = country_flag;
}

public String getCountry_name() {
	return country_name;
}

public String getCountry_population() {
	return country_population;
}


public String getCountry_land() {
	return country_land;
}

public String getCountry_flag() {
	return country_flag;
}



}
