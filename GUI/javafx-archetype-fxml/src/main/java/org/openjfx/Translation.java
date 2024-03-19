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
                                                            "venner", "vennene", "hater", "hate", "bilene", "adkomstdokument", "aktelse", "aktpågivenhet", "aktsom", "aktsomhet", "alkoholholdig", "allmennheten", "alminnelig", "alminnelighet", "anbefale", "anbefaling", "anbud", "andel", "anerkjent",
                                                            "anerkjenne", "anerkjennelse", "anførselstegn", "angi", "angivelse", "angå", "anklage", "anklagede", "ankomst", "anledning", "anmelde", "anmeldelse","politianmeldelse","bokanmeldelse", "anmeldelsen","anmeldelser","anmeldelsene", "anmerkning", "anmode",
                                                            "politianmeldelsen","politianmeldelser","politianmeldelsene","bokanmeldelsen","bokanmeldelser","bokanmeldelsene",
                                                            "anmodning", "anmodningsvedtak", "annerledes", "ansatt", "anselig", "ansette", "ansettelse", "anskaffe", "anskaffelse", "anslag", "anslagsvis", "anslå", "ansvarlig", "ansvarlighet", "ansvarlighetslov", "anta",
                                                            "antakelig", "antakelse", "antall", "antatt", "antyde", "antydning", "anvende", "anvendelig", "anvendelighet", "anvendelse", "arbeidsledig",
                                                            "nevne", "nevnte", "nevnes", "nevner", "nevnt", "nevn", "farlig", "farligere", "farligst", "farligste",
                                                            "arbeidsledighet", "arbeidsmarked", "arbeidssøker", "arbeidstillatelse", "aferd", "avbrudd", "avgjørelse", "avhengighet", "avhold", "avlegge", "avsatt", "avsetning", "avsette", "avsindig", "avskrivning", "avskygning", "avspeile", "avstedkomme", "avstemning", "avstå","avstår", "avståelse", "avta", "avveie", "avveiing", "avverge",
                                                            "barmhjertig", "bearbeide", "beboer", "bebreide", "bebygge", "bebyggelse", 
                                                            "bedervet", "bedrøvelig", "bedømme", "bedømmelse", "befaling", "befaring", 
                                                            "befolkning", "beføyelse", "begavet", "begeistret", "begivenhet", "begjær", 
                                                            "begravelse","begravelsen", "begrep","begreper", "begrense", "begrune", "begrunnelse", "begynnelse","begynnelsen", 
                                                            "begå", "behag", "beherkse", "beholde", "beholdning", 
                                                            "bekjempe", "bekjempelse", "bekostning", "bekrefte", "belaste", "belastning",
                                                            "beliggenhet", "belyse","belyser", "belønne", "belønning", "belønningsordning", "beløp",
                                                            "beløpe seg til", "bemanning", "beregne","beregningen","beregning", "beregnigene", "berettiget",
                                                            "besette", "besitte", "besittelse", "beskatte", "beskatning", "arbeidsledig", "arbeidsledige", "løs", "løse", "løst",
                                                            "beskrive", "beskrivelse", "beskytte","beskytter","beskyttet",  
                                                            "beskyttelse", "beslutte", "beslutning", "besparelse", "bestand", "bestemmelse", 
                                                            "bestilling", "bestillingsfullmakt", "bestå av", "betegnelse", "betinge", "betingelse",
                                                            "betinget", "betjene", "betrakte", "betraktning", "betryggende",
                                                            "bety","betyr", "betydelig", "betydning", "bevege", "bevegelse", "beveggrunn", "bevilge",
                                                            "bevilgning", "bevilling", "bevisst", "bevissthet", "bidra", "bifalle","bidrar","tegn"

                                                        






                                                            
                                                            
                                                            
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
                                                            "vennar", "vennane", "hatar", "hata", "bilane", "heimelsdokument", "vørnåd", "aktsamd", "aktsam", "aktsam", "alkoholhaldig", "folk", "almenn", "alminnelighet", "rå til", "tilråding", "anbod", "del", "akta",
                                                            "godkjenne", "godkjenning", "hermeteikn", "angi", "avmerking", "gjelda", "klaga", "den skulda", "framkomst", "høve", "melda","melding","politimelding","bokmelding","meldinga","meldingar","meldigane", "merknad", "be",
                                                            "politimeldinga","politimeldingar","politimeldingane","bokmeldinga","bokmeldingar","bokmeldingane",
                                                            "oppmoding", "oppmodingsvedtak", "annleis", "tilsett", "monaleg", "tilsetja", "tilsetjing", "skaffa", "anskaffing", "overslag", "rundt rekna", "rekna til", "ansvarleg", "ansvarlegheit", "ansvarlegheitslov", "gå ut frå",
                                                            "truleg", "godtaking", "tal", "pårekna", "nemna", "snev", "bruka", "brukande", "bruksverdi", "bruk", "arbeidslaus",
                                                            "nemne", "nemnde", "nemnast", "nemner", "nemnt", "nemn", "farleg", "farlegare", "farlegast", "farlegaste",
                                                            "arbeidsløyse", "arbeidsmarknad", "arbeidssøkjar", "arbeidsløyve", "åtferd", "avbrot", "avgjerd", "avhengigheit", "fråhald", "besøkja", "avsett", "avsetjing", "setja av", "vitlaus", "avskriving", "nyanse", "spegl", "gjera", "røysting", "avhenda","avhendar", "avkall", "falla", "vega", "avveging", "hindra",
                                                            "miskunnsam", "arbeida", "bebuar", "lasta", "byggja", "busetnad", "skjemd", "bedrøveleg",
                                                            "vurdera", "omdomming", "påbod", "synfaring", "folksetnad", "fullmakt", "gåverik", "oppglødd",
                                                            "hending", "begjær", "gravferd","gravferda", "omgrep","omgrep", "avgrensa", "grunnje", "grunnjeving", "byrjing","byrjinga",
                                                            "gjera", "hugnad", "meistre", "behalda", "behaldning", 
                                                            "motarbeide", "strid", "kostnad", "stadfeste", "belasta", "belastning",
                                                            "plassering", "klårgjera","klårgjerar", "løna", "løn", "påskjøningsording", "sum",
                                                            "kosta", "bemmaning", "rekna", "utrekning","utrekninga","utrekningane", "velgrunna",
                                                            "tilsetja", "eiga", "eigedom", "skattleggja", "skattlegging", "arbeidslaus", "arbeidslause","laus", "lause", "laust",
                                                            "forklara", "forteljing", "verna","vernar","verna", 
                                                            "vern", "avgjera", "avgjerd", "innsparing", "populasjon", "føresegn",
                                                            "bestilling", "bestillingsfullmakt", "bestå av", "nemning", "føresetja", "vilkår",
                                                            "betinget", "betala", "vurdera", "syn", "forsvarleg",
                                                            "innebera","inneberar", "monaleg", "følgje", "flytta", "rørsle", "grunn", "løyva", 
                                                            "løyving","løyve", "medviten", "medvit", "yta", "godkjenna","ytar","teikn"
                                                    
                                                            
                                                            

                                                            



                                                        



                                                            
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

        Translation demo = new Translation("medvit", false);
        demo.getTranslation();

    }
    
    
}
