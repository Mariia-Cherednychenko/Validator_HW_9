package ua.ithlillel.dnipro.Cherednychenko.rules;

import java.util.Comparator;

public class MinNumberValidatorRule implements ValidatorRule <Number> {

    Number minValue;

    public MinNumberValidatorRule(Number minValue) {
        this.minValue = minValue;
    }

    @Override
    public boolean validate(Number value) {
        if (value.doubleValue()>= minValue.doubleValue()) {
            return true;
        }
        return false;
    }

    @Override
    public String errorMessage() {
        return "does not meet minimal value";
    }

}
