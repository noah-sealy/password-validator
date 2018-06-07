package com.example.noahsealy.assignment2;

public class Validator {
    public int check (String s) {
        int size = s.length();
        String badPass = "password";
        if (size < 8) {
            return 0;
        } else {
            if (!s.equalsIgnoreCase(badPass))
                return 1;
        }
        return 0;
    }
}
