package com.appplication.pass_genrator;


import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

public class GeneratePassword {

    public String generator(){


        //create lowercase character
        CharacterRule lowerCase=new CharacterRule(EnglishCharacterData.LowerCase);
        lowerCase.setNumberOfCharacters(2);

        //create uppercase character
        CharacterRule upperCase=new CharacterRule(EnglishCharacterData.UpperCase);
        upperCase.setNumberOfCharacters(2);


        //create digit
        CharacterRule digit=new CharacterRule(EnglishCharacterData.Digit);
        digit.setNumberOfCharacters(2);


        //create  special character
        CharacterRule lCr=new CharacterRule(EnglishCharacterData.Special);
        lCr.setNumberOfCharacters(2);

        PasswordGenerator passwordGenerator=new PasswordGenerator();
        String password = passwordGenerator.generatePassword(8, lowerCase, upperCase, digit);
        return password;


    }


}
