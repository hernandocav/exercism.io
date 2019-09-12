import java.util.regex.Pattern;

public class PigLatinTranslator {
    
    String consonants = "[bcdfghjklmnpqrstvwxz]";
    String ptConsonants = "^" + consonants + ".*";
    String ptDoubleConsonants = "^" + consonants + consonants + ".*";
    String ptTripleConsonants = "^" + consonants + consonants + consonants + ".*";
    String ptConsonantsQU = "^" + consonants + "qu.*";
    
    String translate(String phrase){
        String[] word = phrase.split(" ");
        String output = "";
        for (String var : word) {
            if (output.length()>1) { output = output + " "; }
            output = output +convertWord(var);            
        }
        return output;
    }

    String convertWord(String word){
        String aux = word;
        if (Pattern.matches("^(xr|yt).*", word)) { aux = word; }
        else if (Pattern.matches("^y.*", word)) { aux = word.substring(1) + word.substring(0, 1); }
        else if (Pattern.matches("^qu.*", word)) { aux = word.substring(2) + word.substring(0, 2); }
        else if (Pattern.matches(ptConsonantsQU, word)) { aux = word.substring(3) + word.substring(0, 3); }        
        else if (Pattern.matches(ptConsonants, word)) {
            if (Pattern.matches(ptTripleConsonants, word)) { aux = word.substring(3) + word.substring(0, 3);} 
            else if (Pattern.matches(ptDoubleConsonants, word)) { aux = word.substring(2) + word.substring(0, 2); }
            else { aux = word.substring(1) + word.substring(0, 1); }
        }
        return aux + "ay";
    }
}
