import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
        int topChar = getTopChar(a);
        return buildDiamond(topChar);
    }

    int getTopChar(char a) {
        a = Character.toUpperCase(a);
        char[] ca = {a};
        return Character.codePointAt(ca, 0);
    }

    List<String> buildDiamond(int topChar) {
        List<String> list = new ArrayList<String>();
        int chars = topChar - 64;
        int totalLines = chars + (chars - 1);
        int pad = ((totalLines - 1) / 2);
        String stringPad = "";
        String stringDifference = " ";
        for (int i = 1; i < pad+1; i++) { stringPad = stringPad + " "; }
        list.add(stringPad + Character.toString((char)65) + stringPad);
        if (topChar > 65) {
            for (int i = 66; i <= topChar; i++) {
                stringPad = stringPad.substring(0, stringPad.length() - 1);                
                list.add(stringPad + Character.toString((char)i) + stringDifference + Character.toString((char)i) + stringPad);
                stringDifference = stringDifference + "  ";
            }
        }
        for (int k = (list.size() - 2); k >= 0; k--) {
            list.add(list.get(k));
        }
        return list;
    }
}
