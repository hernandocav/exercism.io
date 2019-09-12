import java.util.ArrayList;
import java.util.List;

public class Anagram {

    private String base;

    Anagram(String base){
        this.base = base;
    }
	public List<String> match(List<String> asList) {
        List<String> output = new ArrayList<String>();
        for (String wordList : asList) {
            if (!wordList.toLowerCase().equals(base.toLowerCase())
            && (wordList.length() == base.length())) {
                boolean control = true;
                String aux = base;
                char[] item = wordList.toLowerCase().toCharArray();
                for (char var : item) {
                    if (aux.toLowerCase().contains(String.valueOf(var))) {
                        aux = aux.replaceFirst(String.valueOf(var), "");
                    } else { 
                        control = false; break; 
                    }
                }
                if (control) { output.add(wordList); }
            }
        }
		return output;
    }
}
