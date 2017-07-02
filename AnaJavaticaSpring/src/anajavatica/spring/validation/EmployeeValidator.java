package anajavatica.spring.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@SuppressWarnings("javadoc")
public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return Employee.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		ValidationUtils.rejectIfEmpty(arg1, "id", "id.empty");
		Employee p = (Employee) arg0;
		if (p.getWage() <= 0) {
			arg1.rejectValue("wage", "Employee must have wage!");
		}
	}
}
