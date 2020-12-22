package ua.ithlillel.dnipro.Cherednychenko;

import ua.ithlillel.dnipro.Cherednychenko.exception.ValidationException;
import ua.ithlillel.dnipro.Cherednychenko.rules.*;
import ua.ithlillel.dnipro.Cherednychenko.validator.ObjectValidator;
import ua.ithlillel.dnipro.Cherednychenko.validator.RulesBasedObjectValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {

        /*List<ValidatorRule> rules1 = new ArrayList<>();
        rules1.add(new RegExpValidatorRule(Pattern.compile("\\+\\d{12}")));
        rules1.add(new StartsWithValidatorRule("+38"));
        ObjectValidator<String> validator1 = new RulesBasedObjectValidator<>(rules1);

        String phone= "+380964448800";

        try{
            validator1.validate(phone);
            System.out.printf("%s is valid number\n", phone);
            //далее работа с номером
        }catch (ValidationException e){
            System.out.printf("%s is invalid number - %s", phone, e.getMessage());
        }*/


       /* List<ValidatorRule> rules2 = new ArrayList<>();
        rules2.add(new MaxNumberValidatorRule(10));
        rules2.add(new MinNumberValidatorRule(0));

        ObjectValidator<Number> validator2 = new RulesBasedObjectValidator<>(rules2);

        Number num = -9;

        try{
            validator2.validate(num);
            System.out.printf("%s is valid number", num);
            //далее работа с числом
        }catch (ValidationException e){
            System.out.printf("%s is invalid number - %s", num, e.getMessage());
        }*/
    }
}
