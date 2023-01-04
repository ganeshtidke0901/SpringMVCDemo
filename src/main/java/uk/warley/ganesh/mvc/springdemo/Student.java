package uk.warley.ganesh.mvc.springdemo;

import java.util.Arrays;
import java.util.Map;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private Map<String, String> countryOptions;
	private String favouriteLanguage;
	private String[] operatingSystems;
	

	public Student() {
		//Option-1
//		countryOptions = new HashMap<String, String>();
//		countryOptions.put("IT", "Italy");
//		countryOptions.put("FR", "France");
//		countryOptions.put("NO", "Norway");
//		countryOptions.put("IN", "India");
//		countryOptions.put("GB", "United Kingdom");
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
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}


	public void setCountryOptions(Map<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] oepratingSystems) {
		this.operatingSystems = oepratingSystems;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country
				+ ", countryOptions=" + countryOptions + ", favouriteLanguage=" + favouriteLanguage
				+ ", operatingSystems=" + Arrays.toString(operatingSystems) + "]";
	}
	
	

}
