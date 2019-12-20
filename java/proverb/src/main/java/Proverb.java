import java.util.ArrayList;
import java.util.Arrays;

class Proverb {

    ArrayList<String> wds;
    Proverb(String[] words) {
        wds = new ArrayList<String>(Arrays.asList(words));
    }

    String recite() {
        String out = "";
        if ((wds.size() > 0)) {
            for (int i = 0; i < wds.size() - 1 ; i++) {
                out = out + "For want of a " + wds.get(i) + " the " + wds.get(i+1) + " was lost.\n";
            }
            out = out + "And all for the want of a " + wds.get(0) + ".";  
        }         
        return out;
    }
}