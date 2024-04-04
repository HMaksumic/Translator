package org.openjfx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Dictionaries {

    private List<String> bokmålDictionary;
    private List<String> nynorskDictionary;

    public Dictionaries() {
        this.bokmålDictionary = readFileToList("/Dictionaries/Bokmål Dictionary.txt");
        this.nynorskDictionary = readFileToList("/Dictionaries/Nynorsk Dictionary.txt");
    }

    private List<String> readFileToList(String resourcePath) {
        List<String> list = new ArrayList<>();
        
        try (InputStream is = getClass().getResourceAsStream(resourcePath);
             BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
            
            //tar hver linje fra filen i listen 
            list = reader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            //hvis resourcePath er feil feks.
            e.printStackTrace();
        }
        return list;
    }
                                                            
    public List<String> getDictionaryBokmål() {
        return this.bokmålDictionary;
    }

    public List<String> getDictionaryNynorsk() {
        return this.nynorskDictionary;
    }

    
}
