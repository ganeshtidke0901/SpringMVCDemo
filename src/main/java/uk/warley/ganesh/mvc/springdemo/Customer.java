package uk.warley.ganesh.mvc.springdemo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import uk.warley.ganesh.mvc.springdemo.validation.CourseCode;

public class Customer {
	private String firstName;
	
	@NotNull(message="is required - should not have white spaces")
	@Size(min=1,message="is required")
	private String lastName;

	
	@Min(value=0,message="should be >=0")
	@Max(value=10,message="shoud be <=10")
	@NotNull(message="is required")
	private Integer freePasses;
	
	
	@NotNull(message="is required1")// we can make this postal code optional by removing @NotNull
	@Pattern(regexp = "^[a-zA-Z0-9]{5}$",message = "only 5 chars or digits")
	private String postalCode;
	
	@CourseCode(values = {"GVT","GAN"},message = "Must start with GVT or GAN")
	private String courseCode;
	
	
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

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

}
