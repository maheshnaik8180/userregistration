package com.user.registration;
import java.util.regex.Pattern;



public class User {

// Pattern Same for First & Last Name
    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^([a-zA-Z0-9_.$*&!+-]+)@([a-z0-9]+).([a-z.]{2,7})$";
    private static final String PHONE_PATTERN = "^[0-9]{2}+[ ]+[0-9]{10}$";

    /**
     * Password Requirements:
     * The password must be minimum 8 characters long
     * At least one upper case character.
     * At least one lower case character.
     * At least one number.
     * At least one special character
     */
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@$%^&(){}:;<>,.?/~_+=|-]).{8,}$";

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }

    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        return pattern.matcher(phoneNumber).matches();
    }

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
}
