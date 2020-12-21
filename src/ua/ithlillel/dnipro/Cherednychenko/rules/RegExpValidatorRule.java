package ua.ithlillel.dnipro.Cherednychenko.rules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpValidatorRule implements ValidatorRule <String>  {

   Pattern pattern;

    public RegExpValidatorRule(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean validate(String value) {
        Matcher matcher = pattern.matcher(value);
        if (matcher.matches()){
            return true;
        }
        return false;
    }

    @Override
    public String errorMessage() {
        return "does not meet RegExp rule";
    }
}
