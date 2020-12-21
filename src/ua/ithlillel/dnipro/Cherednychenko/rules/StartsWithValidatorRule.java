package ua.ithlillel.dnipro.Cherednychenko.rules;

public class StartsWithValidatorRule implements ValidatorRule <String>  {

   String start;

    public StartsWithValidatorRule(String start) {
        this.start = start;
    }

    @Override
    public boolean validate(String value) {
        if (value.startsWith(start)){
            return true;
        }
        return false;
    }

    @Override
    public String errorMessage() {
        return "does not start with required symbols/letters/digits";
    }
}
