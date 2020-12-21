package ua.ithlillel.dnipro.Cherednychenko.rules;

public interface ValidatorRule<T> {

    boolean validate (T value);
    String errorMessage ();
}
