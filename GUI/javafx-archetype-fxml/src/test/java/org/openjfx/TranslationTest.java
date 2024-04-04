package org.openjfx;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class TranslationTest {

    @Test
    public void testTranslationWithoutPunctuation() {
        String sourceSentence = "jeg heter jens og jeg går på den beste skolen i verden";
        String expectedTranslation = "eg heter jens og eg går på den beste skulen i verda";
        
        Translation translation = new Translation(sourceSentence, true); 
        String result = translation.getTranslation().trim(); 
        assertEquals(expectedTranslation, result);
    }

    @Test
    public void testTranslationWithPunctuation() {
        String sourceSentence = "jeg heter jens, jeg går på den beste skolen i verden!";
        String expectedTranslation = "eg heter jens, eg går på den beste skulen i verda!";
        
        Translation translation = new Translation(sourceSentence, true); 
        String result = translation.getTranslation().trim(); 
        assertEquals(expectedTranslation, result);
    }

    @Test
    public void testTranslationOtherWay() {
        String sourceSentence = "eg heter jens, eg går på den beste skulen i verda!";
        String expectedTranslation = "jeg heter jens, jeg går på den beste skolen i verden!";
        
        Translation translation = new Translation(sourceSentence, false); 
        String result = translation.getTranslation().trim(); 
        assertEquals(expectedTranslation, result);
    }


    //sjekker om oversettelse blir skrevet til fil.
    private final static String TEST_CONTENT = "jeg kommer!";
    private final static String EXPECTED_CONTENT = " eg kjem!\n";
    private final static Path filePath = Paths.get(System.getProperty("user.home"), "Documents", "maksumoutput.txt");

    @BeforeEach
    @AfterEach
    void cleanup() throws IOException {
        //passer på at fil er sletta før/etter testen.
        Files.deleteIfExists(filePath);
    }

    @Test
    void testWriteToFile() throws IOException {
        Translation translation = new Translation(TEST_CONTENT, true); 
    
        //skriver til fil
        translation.writeToFile(translation.getTranslation());
        //leser av fil
        String fileContent = Files.readString(filePath);
        assertEquals(EXPECTED_CONTENT, fileContent);
    }

    @Test
    void testNullInput() {
        try {
            new Translation(null, true);
            //hvis ingen feilmelding:
            assertTrue(false, "Expected IllegalArgumentException to be thrown.");
        } catch (IllegalArgumentException e) {
            //hvis det kommer feilmelding:
            assertTrue(true);
        }
    }
}