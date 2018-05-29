package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student{
	private String firstName;
	private String lastName;
	private String Country;
	private String favoriteLanguage;
	private LinkedHashMap<String,String> countryOptions;
	private LinkedHashMap<String,String> favoriteLanguageOptions;
	private String[] operatingSystems;
	
	public Student() {
		countryOptions=new LinkedHashMap();
		countryOptions.put("AR", "Argentina");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("EG", "Egypt");
		countryOptions.put("FR", "France");
		countryOptions.put("GE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "UnitedStates");
		favoriteLanguageOptions=new LinkedHashMap();
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("Scala", "Scala");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("Ruby", "Ruby");
		favoriteLanguageOptions.put("Python", "Python");
		
		
		
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	public String[] getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
	
}