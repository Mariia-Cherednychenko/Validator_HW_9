package ua.ithlillel.dnipro.Cherednychenko.validator;


import ua.ithlillel.dnipro.Cherednychenko.exception.ValidationException;

public interface ObjectValidator <T> {

void validate (T value) throws ValidationException;
}
