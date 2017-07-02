package anajavatica.spring.validation;

import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@SuppressWarnings("javadoc")
public class ValidatorMain {

	public static void main(String[] args) {

		Validator employeeValidator = new EmployeeValidator();
		Employee validEmployee = new Employee("1", 0);
		Errors errors = new BeanPropertyBindingResult(validEmployee, "wage");
		employeeValidator.validate(validEmployee, errors);
		System.out.println(errors.toString());

	}

}
