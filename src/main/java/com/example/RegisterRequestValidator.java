package com.example;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.internal.constraintvalidators.hv.EmailValidator;
import org.springframework.validation.Errors;

import javax.validation.Validator;

/**
 * Created by Elimas on 2016-10-11.
 */
public class RegisterRequestValidator implements org.springframework.validation.Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return RegisterRequest.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        RegisterRequest registerRequest = (RegisterRequest) o;

        if (StringUtils.isBlank(registerRequest.getName()))
            errors.rejectValue("name", "blank", "Pole musi być wypełnione");

        if (StringUtils.isBlank(registerRequest.getEmail()))
            errors.rejectValue("email", "blank", "Pole musi być wypełnione");

        if (StringUtils.isBlank(registerRequest.getPassword()))
            errors.rejectValue("password", "blank", "Pole musi być wypełnione");

        if (StringUtils.isBlank(registerRequest.getConfirmPassword()))
            errors.rejectValue("confirmPassword", "blank", "Pole musi być wypełnione");

        if (!new EmailValidator().isValid(registerRequest.getEmail(), null))
            errors.rejectValue("email", "email.invalid", "Niepoprawny email");

        if (!StringUtils.equals(registerRequest.getPassword(), registerRequest.getConfirmPassword())) {
            errors.rejectValue("password", "blank", "Hasło musi być takie samo");
            errors.rejectValue("confirmPassword", "blank", "Hasło musi być takie samo");
        }
    }
}
