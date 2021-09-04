/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proofpointvalidsentence;

/**
 *
 * @author User
 */
public class ProofpointValidSentence {

    /**
     * @param sentence
     * @return 
     */
    
    
    public String validSentence(String sentence) {
        // TODO code application logic here
        
        
        //Testing if first character is capital
        //gets the first character
        //makes the first character uppercase
        //compares it to the actual first character to see if they are the same
        //if they are then the first character is uppercase
        //trim gets rid of leading or ending spaces
//        if(Character.isLetter(sentence.trim().charAt(0))
//        && sentence.charAt(0) == sentence.toUpperCase().charAt(0)){
//        return "Valid";
//        }else{
//        return "Invalid";
//        }
        
//        if(sentence.contains("\"")){
//            return "Valid";
//        }else{
//            return "Invalid";
//        }
        
        
        //checking the amount of quotation marks in the string
//        int count = 0;
//        //getting length of the string so we know how many times the for loop needs to go to get to the end of the string
//        for(int i = 0; i < sentence.length(); i++) {
//            //checking if each charater is a quotatiom mark
//            if(sentence.charAt(i) == '\"'){
//                //if it is a count is kept
//                count++;
//            }
//        }
//        //checking if the remainder when count is divided by 2 is 0
//        //if it is then this means there is an even amount of quotation marks 
//        if(count % 2 == 0){
//            return "Valid";
//        }else{
//            return "Invalid";
//        }
        
        //checks if the sentence ends with a period
//        if(sentence.trim().endsWith(".")){
//        return "Valid";
//        }else{
//        return "Invalid";
//        }



        //Making sure there is only one period in the string 
        int count2 = 0;
        //getting length of the string so we know how many times the for loop needs to go to get to the end of the string
        for(int i = 0; i < sentence.length(); i++) {
            //checking if each charater is a period
            if(sentence.charAt(i) == '.'){
                //if it is a count is kept
                count2++;
            }
        }
        //if the count equals 1 it is valid. else if is invalid
        if(count2 == 1){
            return "Valid";
        }else{
            return "Invalid";
        }
        
        
        
        
        
        
        
        




    }
    
}
