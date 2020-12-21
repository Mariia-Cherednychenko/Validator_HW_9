package ua.ithlillel.dnipro.Cherednychenko;

import ua.ithlillel.dnipro.Cherednychenko.rules.*;
import ua.ithlillel.dnipro.Cherednychenko.validator.ObjectValidator;
import ua.ithlillel.dnipro.Cherednychenko.validator.RulesBasedObjectValidator;

import javax.xml.bind.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {

        /*List<ValidatorRule> rules = new ArrayList<>();
        rules.add(new RegExpValidatorRule(Pattern.compile("\\+\\d{12}")));
        rules.add(new StartsWithValidatorRule("+38"));
        ObjectValidator<String> validator = new RulesBasedObjectValidator<>(rules);

        String phone= "+380964448800";

        try{
            validator.validate(phone);
            System.out.printf("%s is valid number", phone);
            //далее работа с номером
        }catch (ValidationException e){
            System.out.printf("%s is invalid number - %s", phone, e.getMessage());
        }*/


        List<ValidatorRule> rules = new ArrayList<>();
        rules.add(new MaxNumberValidatorRule(10));
        rules.add(new MinNumberValidatorRule(0));

        ObjectValidator<Number> validator = new RulesBasedObjectValidator<>(rules);

        Number num = -9;

        try{
            validator.validate(num);
            System.out.printf("%s is valid number", num);
            //далее работа с числом
        }catch (ValidationException e){
            System.out.printf("%s is invalid number - %s", num, e.getMessage());
        }
    }
}
