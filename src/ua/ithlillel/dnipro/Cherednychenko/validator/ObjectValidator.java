package ua.ithlillel.dnipro.Cherednychenko.validator;

import javax.xml.bind.ValidationException;

public interface ObjectValidator <T> {

void validate (T value) throws ValidationException;
}
