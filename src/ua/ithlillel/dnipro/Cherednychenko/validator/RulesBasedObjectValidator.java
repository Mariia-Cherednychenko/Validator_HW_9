package ua.ithlillel.dnipro.Cherednychenko.validator;

import ua.ithlillel.dnipro.Cherednychenko.rules.ValidatorRule;


import javax.xml.bind.ValidationException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RulesBasedObjectValidator <T> implements ObjectValidator<T> {

    List<ValidatorRule<T>>rules = new ArrayList<>();


    public RulesBasedObjectValidator(List rules) {
        this.rules.addAll((Collection<? extends ValidatorRule<T>>) rules);
    }

    @Override
    public void validate(T value)throws ValidationException {
        for (ValidatorRule<T> rule: rules) {
            if (!rule.validate(value)) {
                throw new ValidationException(rule.errorMessage());
            }
        }



        /*List <Boolean> validationResult= new ArrayList<>();
     int i=0;
        for (ValidatorRule<T> rule: rules) {
            validationResult.set(i, rule.validate(value));
            ++i;
        }
        for (int j=0; i<validationResult.size(); j++){
            if(!validationResult.get(j)){
                throw new ValidationException(rules.get(j).errorMessage());
            }
        }*/
    }
}