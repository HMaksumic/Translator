package org.openjfx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Translation {
    private static List<String> bokmålOrdbok = Arrays.asList("adgang","advarsel","være", "kommer", "man", "ble", "bare", "noe", "de", "si", "en", "et", "tro", "bo", "mye",
                                                            "disse", "gjør", "fikk", "vei", "sted", "fortsatt", "finnes", "sier", "jeg", "ikke", "hun", "fra", "da", "ham", "nå", "noen",
                                                            "dem", "henne", "selv", "vært", "gikk", "mer", "hva", "hvor", "siden", "hele", "gang", "sammen", "skolen", "skal", "synes",
                                                            "elsker", "norge", "gutt", "glemme", "glemmer", "glemt", "skriver", "skrevet", "skrev", "hatet", "hvorfor", "uke", "nærheten", "verken", "høre",
                                                            "melk", "biler", "kaster", "kastet", "kaste", "nylig", "ærlig", "ovlig", "bolig", "mulig", "rolig", "hvordan", "fryktlig", "høylig", "lovlig", "synlig", "kunstlig", 
                                                            "penger","grønn","rød","svart","hvit","trøtt","sulten","trist","dårlig","kjedelig","lavt","treg","fremdeles","øynene","hver","vanlig","gammel","sjelden","vanskelig","høy","lav",
                                                            "engang", "ubruklig", "beboer", "kjærlighet", "bekreftelse", "sannhet", "drøm", "spise", "underlig", "syk", "hvis", "hode" ,"morgen", "følelse", "følelser", "følelsene",
                                                            "hjem", "leke", "anderledes", "fornøyd", "velge", "hensyn", "kjedelig", "tenke", "nyhet", "hemmelighet", "hemmeligheter", "hemmelighetene", "selge", "tregere", "tregest", "øyne", "flere",
                                                            "rettferdighet", "lærer", "lærere", "lærerene", "valg", "valget", "valgene","boligen","boliger","boligene",
                                                            "venner", "vennene"

                                                            
                                                            
                                                            
                                                            );

    private static List<String> nynorskOrdbok = Arrays.asList("tilgang", "åtvaring", "vere", "kjem", "ein", "vart", "berre", "nokon", "dei", "seie", "ein", "eit","tru","bu","mykje",
                                                            "desse", "gjer", "fekk", "veg", "stad", "framleis", "finst", "seier", "eg", "ikkje", "ho", "frå",   "då", "honom", "no", "noko",
                                                            "dykk", "ho", "skjølv", "vore", "gjekk", "meir", "kva", "kor", "sidan", "heile", "gong", "saman", "skulen", "ska", "synast",
                                                            "elskar", "noreg", "gut", "gløyme", "gløymer", "gløymt", "skriv", "skrive", "skreiv", "hata", "kvifor", "veke", "nærleiken", "korkje", "høyre",
                                                            "mjølk", "bilar", "kastar", "kasta", "kasta", "nyleg", "ærleg", "ovleg", "bustad", "mogleg", "roleg", "korleis", "frykteleg", "høgleg", "lovleg", "synleg", "kunstleg",
                                                            "pengar","grøn","raud","svart","kvit","trøytt","svolten","trist","dårleg","kjedeleg","lågt","treig","framleis","augo","kvar","vanleg","gamal","sjeldan","vanskeleg","høg","låg",
                                                            "eingong", "ubrukeleg", "bebuar", "kjærleik", "stadfesting", "sanning", "draum","ete", "underleg", "sjuk", "viss", "hovud", "morgon", "kjensla", "kjensler", "kjenslene",
                                                            "heim", "leike", "annleis", "nøgd", "velje", "omsyn", "keisam", "tenkje", "nyheit", "løyndom", "løyndommar", "løyndommane", "selje", "treigare", "treigast", "augo", "fleire",
                                                            "rettferd", "lærar", "lærarar", "lærarane", "val", "valet", "vala", "bustaden","bustader", "bustadene",
                                                            "vennar", "vennane"
                



                                                            
                                                            );

    
    private List<String> dividedText = new ArrayList<>();

    private List<String> translatedText = new ArrayList<>();
    private String translatedString = "";
    
    private boolean bokmålStatus;
    
    Translation(String text, boolean bokmålStatus) {
        this.bokmålStatus = bokmålStatus;
        text.toLowerCase();

        String[] splitText = text.split(" ");  //"jeg går til skolen!" ----> ["jeg", "går", "til", "skolen!"]
        for (String word : splitText) {
            this.dividedText.add(word);
        }


        if (bokmålStatus) { //fra bokmål til nynorsk.
            for (int i = 0; i < dividedText.size(); i++) {
                //har et bokmål ord her og leter etter det samme ordet i bokmål ordboken;
                boolean foundWord = false; //hvis ordet ikke blir funnet i ordboken skal det orginale ordet brukes
                for (int j = 0; j < bokmålOrdbok.size(); j++) {

                    if (dividedText.get(i).matches(bokmålOrdbok.get(j) + "([!?,;'\\.]*)")) {         
                        //siden ordbøkene har 1:1 forhold tar man indexen til det matchende bokmål ordet og bruker den med nynorsk ordboken.
                        String theWord = dividedText.get(i);
                        int lastLetter = theWord.length() - 1; char specialChar = theWord.charAt(lastLetter);
                        String specialString = String.valueOf(specialChar); //henter ut siste tegn fra matchende ord som streng

                        if (specialString.matches("([!?,;'\\.]*)")) { 
                            this.translatedText.add(nynorskOrdbok.get(j) + specialString);

                        } 
                        else { 
                            this.translatedText.add(nynorskOrdbok.get(j));

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
                for (int j = 0; j < nynorskOrdbok.size(); j++) {

                    if (dividedText.get(i).matches(nynorskOrdbok.get(j) + "([!?,;'\\.]*)")) {
                        //siden ordbøkene har 1:1 forhold tar man indexen til det matchende bokmål ordet og bruker den med nynorsk ordboken.
                        String theWord = dividedText.get(i);
                        int lastLetter = theWord.length() - 1; char specialChar = theWord.charAt(lastLetter); 
                        String specialString = String.valueOf(specialChar);

                        if (specialString.matches("([!?,;'\\.]*)")) {
                            this.translatedText.add(bokmålOrdbok.get(j) + specialString);

                        } 
                        else { 
                            this.translatedText.add(bokmålOrdbok.get(j));

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

    public static void main(String[] args) { //test kode

        Translation demo = new Translation("eg!", false);
        demo.getTranslation();

    }
    
    
}
