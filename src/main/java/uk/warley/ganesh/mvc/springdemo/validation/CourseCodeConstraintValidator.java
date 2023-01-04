package uk.warley.ganesh.mvc.springdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	String[] coursePrefixes;

	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefixes = courseCode.values();
	}

	@Override
	public boolean isValid(String courseCodeStr, ConstraintValidatorContext constraintValidatorContext) {
		if (courseCodeStr == null)
			return false;
		for (int i = 0; i < coursePrefixes.length; i++) {
			if (courseCodeStr.startsWith(coursePrefixes[i])) {
				return true;
			}
		}
		return false;
	}

}
