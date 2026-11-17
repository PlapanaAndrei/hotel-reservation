package org.example.hotelreservation.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.Annotation;


public class DateRangeValidator implements ConstraintValidator<ValidDateRange, DateRange> {


    @Override
    public boolean isValid(DateRange range, ConstraintValidatorContext context) {
        if (range == null || range.getCheckIn() == null || range.getCheckout() == null){
            return true;
        }
        if (range.getCheckout().isAfter(range.getCheckIn())){
            return true;
        }
        context.disableDefaultConstraintViolation();
        context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate())
                .addPropertyNode("checkOut")
                .addConstraintViolation();
        return false;
    }
}
