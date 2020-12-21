package ua.ithlillel.dnipro.Cherednychenko.rules;

public class MaxNumberValidatorRule implements ValidatorRule <Number>  {

   Number maxValue;

    public MaxNumberValidatorRule(Number maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public boolean validate(Number value) {
        if(value.doubleValue()<=maxValue.doubleValue()){
            return true;
        }
        return false;
    }

    @Override
    public String errorMessage() {
        return "does not meet maximal value";
    }
}
