package com.example.noahsealy.assignment2;

public class Validator {
    //this method will go through a number of test conditions for a password, it will return 1 if every test passes, returns 0 if anything fails
    public static int check(String s) {
        int size = s.length();
        String badPass = "password";
        //makes sure pass word is at least 8 characters
        if (size < 8) {
            return 0;
            //makes sure password is not "password" (case insensitive)
        } else if (s.equalsIgnoreCase(badPass)) {
            return 0;
            //makes sure the password is at most 20 characters (custom test 1)
        } else if (size > 30) {
            return 0;
            //checks if the password is NOT exactly 15 characters (custom test 2)
        } else if (size == 15) {
            return 0;
            //checks if there exists an uppercase letter within the password (custom test 3)
        } else if (1 == 1) {
            int x = 0;
            while (x < size) {
                if (Character.isLowerCase(s.charAt(x))) {
                    x++;
                } else {
                    break;
                }
                x++;
                if (x >= size) {
                    return 0;
                }
            }
        }
        //this will occur if every test passes
        return 1;
    }
}
