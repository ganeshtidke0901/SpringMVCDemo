package uk.warley.ganesh.mvc.springdemo.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
public @interface CourseCode {

	public String[] values() default "GAN";

	public String message() default "Must start with GAN";

	public Class<?>[] groups() default {};

	public Class<? extends Payload>[] payload() default {};

}
