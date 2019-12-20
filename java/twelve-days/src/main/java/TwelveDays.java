class TwelveDays {
    String verse(int verseNumber) {
        String out = "";
        for (NumberTranslate e: NumberTranslate.values()) {
            if (e.name().equals("A" + verseNumber)) {
                out = "On the " + e.translate + " day of Christmas my true love gave to me: " + e.phrase;
            }
        }
        return out + "a Partridge in a Pear Tree.\n";
    }

    String verses(int startVerse, int endVerse) {
        String out = "";
        for (int i = startVerse; i < endVerse + 1; i++) {
            out = out + verse(i);
            if (i != endVerse) { out = out + "\n"; }
        }        
        return out;
    }
    
    String sing() {
        return this.verses(1, 12);
    }

    enum NumberTranslate {
        A1("first", ""),
        A2("second", "two Turtle Doves, and " + A1.phrase),
        A3("third", "three French Hens, " + A2.phrase),
        A4("fourth", "four Calling Birds, " + A3.phrase),
        A5("fifth", "five Gold Rings, " + A4.phrase),
        A6("sixth", "six Geese-a-Laying, " + A5.phrase),
        A7("seventh", "seven Swans-a-Swimming, " + A6.phrase),
        A8("eighth", "eight Maids-a-Milking, " + A7.phrase),
        A9("ninth", "nine Ladies Dancing, " + A8.phrase),
        A10("tenth", "ten Lords-a-Leaping, " + A9.phrase),
        A11("eleventh", "eleven Pipers Piping, " + A10.phrase),
        A12("twelfth", "twelve Drummers Drumming, " + A11.phrase);

        NumberTranslate(String tra, String phr) { translate = tra; phrase = phr; }
        public final String translate;
        public final String phrase;
    }
}