package springmvc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;

import springmvc.model.Car;

public class CarValidator implements Validator {
	public boolean supports(Class<?> clazz) {
		return Car.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		Car car = (Car)target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "model", "field.required", "Required field");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "price", "field.required", "Required field");
		if (!errors.hasFieldErrors("price")) {
			if (car.getPrice().intValue() <= 0) {
				errors.rejectValue("price", "field.not_zero", "Can't be free!");
			}
		}
	}
}