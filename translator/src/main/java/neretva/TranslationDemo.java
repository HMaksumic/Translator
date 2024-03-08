package neretva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TranslationDemo {
    private static List<String> bokmålOrdbok = Arrays.asList("adgang","advarsel","være", "kommer", "man", "ble", "bare", "noe", "de", "si", "en", "et", "tro", "bo", "mye",
                                                            "disse", "gjør", "fikk", "vei", "sted", "fortsatt", "finnes", "sier", "jeg", "ikke", "hun", "fra", "da", "ham", "nå", "noen",
                                                            "dem", "henne", "selv", "vært", "gikk", "meir", "hva", "hvor", "siden", "hele", "gang", "sammen", "skolen", "skal", "synes");

    private static List<String> nynorskOrdbok = Arrays.asList("tilgang", "åtvaring", "vere", "kjem", "ein", "vart", "berre", "nokon", "dei", "seie", "ein", "eit","tru","bu","mykje",
                                                            "desse", "gjer", "fekk", "veg", "stad", "framleis", "finst", "seier", "eg", "ikkje", "ho", "frå",   "då", "honom", "no", "noko",
                                                            "dei", "ho", "skjølv", "vore", "gjekk", "mer", "kva", "kor", "sidan", "heile", "gong", "saman", "skulen", "ska", "synast");

    
    private List<String> dividedText = new ArrayList<>();

    private List<String> translatedText = new ArrayList<>();
    private String translatedString = "";
    
    boolean bokmålStatus;

    
    TranslationDemo(String text, boolean bokmålStatus) {
        this.bokmålStatus = bokmålStatus;
        text.toLowerCase();

        String[] splitText = text.split(" ");
        for (String word : splitText) {
            this.dividedText.add(word);
        }


        if (bokmålStatus) { //fra bokmål til nynorsk.
            for (int i = 0; i < dividedText.size(); i++) {
                //har et bokmål ord her og leter etter det samme ordet i bokmål ordboken;
                boolean foundWord = false; //hvis ordet ikke blir funnet i ordboken skal det orginale ordet brukes
                for (int j = 0; j < bokmålOrdbok.size(); j++) {
                    if (bokmålOrdbok.get(j).matches(dividedText.get(i))) {
                        //siden ordbøkene har 1:1 forhold tar man indexen til det matchende bokmål ordet og bruker den med nynorsk ordboken.
                        this.translatedText.add(nynorskOrdbok.get(j));
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
                for (int j = 0; j < nynorskOrdbok.size(); j++) {
                    if (nynorskOrdbok.get(j).matches(dividedText.get(i))) {
                        //siden ordbøkene har 1:1 forhold tar man indexen til det matchende bokmål ordet og bruker den med nynorsk ordboken.
                        this.translatedText.add(bokmålOrdbok.get(j));
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

    public static void main(String[] args) {


        
        TranslationDemo demo = new TranslationDemo("jeg vil gå sammen til skolen med deg. Det hadde vært fint, fordi jeg synes du er en kul kar", true);
        demo.getTranslation();

    }
    
    
}
