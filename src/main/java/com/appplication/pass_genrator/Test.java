package com.appplication.pass_genrator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test {


    public static final String PATTERN_COMPILER="^(?=.*[a-zA-Z])(?=.*\\d).{8,20}$";
    public static final Pattern compiler= Pattern.compile(PATTERN_COMPILER);


    public static void main(String[] args) {

        GeneratePassword generatePassword=new GeneratePassword();
        String password=generatePassword.generator();
        System.out.println(isValid(password));
        System.out.println(password);
    }


    public static boolean isValid(String pass){
        Matcher matcher=compiler.matcher(pass);
        return matcher.matches();
    }
}
