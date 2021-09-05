/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proofpointvalidsentence;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class ProofpointValidSentenceTest {
    
    public ProofpointValidSentenceTest() {
    }

    /**
     * Test of validSentence method, of class ProofpointValidSentence.
     */
    
    //made this a global variable so it isn't repeated in every test. Same for sentence
    ProofpointValidSentence instance = new ProofpointValidSentence();
    
    //Valid
    //String sentence = "ÁÚÍ quick brown fox said \"hello Mr lazy dog\". ";
    
    //Invalid
    //String sentence = "77 The quick brown fox said \"hello Mr lazy dog\". ";
    
    //Valid
//    String sentence = " The quick brown fox said \"hello Mr lazy dog\". ";
    
    //Invalid
//    String sentence2 = "the quick brown fox said \"hello Mr lazy dog\".";
    
    @Test
    public void testCharacterUpperCase1() {
        System.out.println("Test 1: Sentence starts with an uppercase letter");
        String sentence = " The quick brown fox said \"hello Mr lazy dog\". ";
        String expResult = "Valid";
        String result = instance.characterUpperCase(sentence);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCharacterUpperCase2() {
        System.out.println("Test 2: Sentence doesn't start with an uppercase letter");
        String sentence = " the quick brown fox said \"hello Mr lazy dog\". ";
        String expResult = "Invalid";
        String result = instance.characterUpperCase(sentence);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAmountOfQutationsAndPeriods1() {
        System.out.println("Test 3: Sentence has an even amount of quotations, only has one period and ends with a period");
        String sentence = " The quick brown fox said \"hello Mr lazy dog\". ";
        String expResult = "Valid";
        String result = instance.amountOfQutationsAndPeriods(sentence);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAmountOfQutationsAndPeriods2() {
        System.out.println("Test 4: Sentence has an odd amount of quotations, only has one period and ends with a period");
        String sentence = " The quick brown fox said hello Mr lazy dog\". ";
        String expResult = "Invalid";
        String result = instance.amountOfQutationsAndPeriods(sentence);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAmountOfQutationsAndPeriods3() {
        System.out.println("Test 5: Sentence has an even amount of quotations, multiple periods and ends with a period");
        String sentence = " The quick. brown fox. said \"hello Mr lazy dog\". ";
        String expResult = "Invalid";
        String result = instance.amountOfQutationsAndPeriods(sentence);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAmountOfQutationsAndPeriods4() {
        System.out.println("Test 6: Sentence has an even amount of quotations, only has one period and doesn't end with a period");
        String sentence = " The quick brown fox said. \"hello Mr lazy dog\" ";
        String expResult = "Invalid";
        String result = instance.amountOfQutationsAndPeriods(sentence);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testNumbersBelow13AreText1() {
        System.out.println("Test 7: One number is in the sentence, 13 or above");
        String sentence = " The 13 quick brown foxs said \"hello Mr lazy dog\". ";
        String expResult = "Valid";
        String result = instance.numbersBelow13AreText(sentence);
        assertEquals(expResult, result);
    }
        
    @Test
    public void testNumbersBelow13AreText2() {
        System.out.println("Test 8: Two numbers are in the sentence, both 13 or above");
        String sentence = " The 13 quick brown foxes said \"hello Mr lazy dog\", 18 times. ";
        String expResult = "Valid";
        String result = instance.numbersBelow13AreText(sentence);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNumbersBelow13AreText3() {
        System.out.println("Test 8: Two numbers are in the sentence, one is 13 or above, second is less than 13");
        String sentence = " The 16 quick brown foxes said \"hello Mr lazy dog\", 11 times. ";
        String expResult = "Invalid";
        String result = instance.numbersBelow13AreText(sentence);
        assertEquals(expResult, result);
    }

    @Test
    public void testNumbersBelow13AreText4() {
        System.out.println("Test 8: Two numbers are in the sentence, both are less than 13");
        String sentence = " The 6 quick brown foxes said \"hello Mr lazy dog\", 11 times. ";
        String expResult = "Invalid";
        String result = instance.numbersBelow13AreText(sentence);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNumbersBelow13AreText5() {
        System.out.println("Test 8: One number is in the sentence, less than 13");
        String sentence = " The 6 quick brown foxes said \"hello Mr lazy dog\". ";
        String expResult = "Invalid";
        String result = instance.numbersBelow13AreText(sentence);
        assertEquals(expResult, result);
    }
    
    
    
}
