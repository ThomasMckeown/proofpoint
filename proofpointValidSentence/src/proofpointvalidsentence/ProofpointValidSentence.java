/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proofpointvalidsentence;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class ProofpointValidSentence {

    /**
     * @param sentence
     * @return 
     */
    
    
    public String characterUpperCase(String sentence) {
        
        //Testing if first character is capital
        //gets the character at position 0 in the string - trims the sentence to account for any spaces at the start
        //checks if this character is uppercase - if so returns valid
        if(Character.isUpperCase(sentence.trim().charAt(0))){
        return "Valid";
        }else{
        return "Invalid";
        }
        
    }
    
    public String amountOfQutationsAndPeriods(String sentence) {
        
        //checking the amount of quotation marks in the string
        int count = 0;
        int count2 = 0;
        
        //first checks if the sentence ends with a period. if it doesnt then immediately returns invalid so time isnt wasted going through the sentence looking for
        //quotation marks and periods
        if(sentence.trim().endsWith(".")){
            //getting length of the string so we know how many times the for loop needs to go to get to the end of the string
            for(int i = 0; i < sentence.length(); i++) {
                //checking if each charater is a quotatiom mark
                if(sentence.charAt(i) == '\"'){
                    //if it is a count is kept
                    count++;
                //checking if each character is a period
                }if(sentence.charAt(i) == '.'){
                    //if it is a count is kept
                    count2++;
                }
            }

        //checking if the remainder when count is divided by 2 is 0
        //if it is then this means there is an even amount of quotation marks 
        //also checking if there is only one period. if there is more then one then sentence is invalid so Invalid is returned even if there
        //is and even amount of quotation marks
        if(count % 2 == 0 && count2 == 1){
            return "Valid";
        }else{
            return "Invalid";
        }
        
        //if sentence doesn't end with a period invalid is immediately returned 
        }else{
            return "Invalid";
        }

    }

     public String numbersBelow13AreText(String sentence){
       //empty sting to concat text to  
        String result = "";
        //using regex pattern to look for numbers in the sentence
        Pattern pattern = Pattern.compile("-?[0-9]+");
        //using the matcher to match the number found by pattern to an int
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {

            //parseing the int found from text to an int so it can be checked
            int x = Integer.parseInt(matcher.group());
            //checking if that parsed int is less than 13
            if(x < 13){
                result = "Invalid";
            }else{
                result = "Valid";
            }
            
        //check in case there is no numbers in the sentence so no match would be found
        //resulting in the while loop being skipped and result returning an empty string responce
        }if(result.equals("")){
            result = result.concat("Valid");
        }
            return result;

    
    }
    
}
