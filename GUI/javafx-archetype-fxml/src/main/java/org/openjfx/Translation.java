package org.openjfx;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.List;

public class Translation {

    private Dictionaries loadedDictionaries = new Dictionaries();

    private List<String> dividedText = new ArrayList<>();
    private List<String> translatedText = new ArrayList<>();
    private String translatedString = "";
    private boolean bokmålStatus;
    private String text;
    
    Translation(String text, boolean bokmålStatus) {
        if (text == null) {
            throw new IllegalArgumentException();
        }
        this.text = text.toLowerCase();

        this.bokmålStatus = bokmålStatus;
        text.toLowerCase();

        String[] splitText = this.text.split(" ");  //"jeg går til skolen!" ----> ["jeg", "går", "til", "skolen!"]
        for (String word : splitText) {
            this.dividedText.add(word);
        }


        if (bokmålStatus) { //fra bokmål til nynorsk.
            for (int i = 0; i < dividedText.size(); i++) {
                //har et bokmål ord her og leter etter det samme ordet i bokmål ordboken;
                boolean foundWord = false; //hvis ordet ikke blir funnet i ordboken skal det orginale ordet brukes
                for (int j = 0; j < loadedDictionaries.getDictionaryBokmål().size(); j++) {

                    if (dividedText.get(i).matches(loadedDictionaries.getDictionaryBokmål().get(j)+ "([!?,;'.\\-]*)")) {         
                        //siden ordbøkene har 1:1 forhold tar man indexen til det matchende bokmål ordet og bruker den med nynorsk ordboken.
                        String theWord = dividedText.get(i);
                        int lastLetter = theWord.length() - 1; char specialChar = theWord.charAt(lastLetter);
                        String specialString = String.valueOf(specialChar); //henter ut siste tegn fra matchende ord som streng

                        if (specialString.matches("([!?,;'\\.]*)")) { 
                            this.translatedText.add(loadedDictionaries.getDictionaryNynorsk().get(j) + specialString);

                        } 
                        else { 
                            this.translatedText.add(loadedDictionaries.getDictionaryNynorsk().get(j));

                        }
                        foundWord = true;
                    }
                } 
                if (!foundWord) { //orginalt ord brukes isteden
                    this.translatedText.add(dividedText.get(i));
                }
            }
        }
        if (!bokmålStatus) { //fra nynorsk til bokmål
            for (int i = 0; i < dividedText.size(); i++) {
                //har et nynorsk ord her og leter etter det samme ordet i nynorsk ordboken;
                boolean foundWord = false; //hvis ordet ikke blir funnet i ordboken skal det orginale ordet brukes
                for (int j = 0; j < loadedDictionaries.getDictionaryNynorsk().size(); j++) {

                    if (dividedText.get(i).matches(loadedDictionaries.getDictionaryNynorsk().get(j) + "([!?,;'\\.]*)")) {
                        //siden ordbøkene har 1:1 forhold tar man indexen til det matchende bokmål ordet og bruker den med nynorsk ordboken.
                        String theWord = dividedText.get(i);
                        int lastLetter = theWord.length() - 1; char specialChar = theWord.charAt(lastLetter); 
                        String specialString = String.valueOf(specialChar);

                        if (specialString.matches("([!?,;'\\.]*)")) {
                            this.translatedText.add(loadedDictionaries.getDictionaryBokmål().get(j) + specialString);

                        } 
                        else { 
                            this.translatedText.add(loadedDictionaries.getDictionaryBokmål().get(j));

                        }
                        foundWord = true;

                    }
                }
                if (!foundWord) { //orginalt ord brukes isteden
                    this.translatedText.add(dividedText.get(i));
                }
            }
        }
        if (translatedText.size() > 0) {
            for (String word : translatedText) {
                this.translatedString += " " + word;

            }
        }
    }
    public String getTranslation() {
        System.out.println(this.translatedString);
        return this.translatedString;
    }
    public boolean getBokmålStatus() {
        return this.bokmålStatus;
    }

    public void writeToFile(String content) throws IOException {

        //String translation = getTranslation();

        final String DOCUMENTS_PATH = Paths.get(System.getProperty("user.home"), "Documents").toString();
        String filePath = Paths.get(DOCUMENTS_PATH, "maksumoutput.txt").toString();

         try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,false))) {
            writer.write(content);
            writer.write("\n");
            writer.close();
        }
    }

    public static void main(String[] args) throws IOException { //test kode

        Translation demo = new Translation("ADGANG", true);
        String translation = demo.getTranslation();
        demo.writeToFile(translation);

    }
    
    
}
