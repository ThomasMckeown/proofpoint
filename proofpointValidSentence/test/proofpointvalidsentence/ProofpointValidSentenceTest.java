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
    String sentence = " The quick brown. fox said \"hello Mr lazy dog\". ";
    
    //Invalid
//    String sentence2 = "the quick brown fox said \"hello Mr lazy dog\".";
    
    @Test
    public void testValidSentence1() {
        System.out.println("Test 1: Valid Sentence");
        
        String expResult = "Valid";
        String result = instance.validSentence(sentence);
        assertEquals(expResult, result);
    }
//    
//    @Test
//    public void testValidSentence2() {
//        System.out.println("Test 2: Starting without a capital letter");
//        
//        String expResult = "Invalid";
//        String result = instance.validSentence(sentence2);
//        assertEquals(expResult, result);
//    }
    
    
}
