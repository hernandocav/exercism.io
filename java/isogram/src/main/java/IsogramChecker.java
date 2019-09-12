class IsogramChecker {

    /**
     * Determine if a word or phrase is an isogram.
     * @param phrase
     * @return True or False
     */
    boolean isIsogram(String phrase) {
        boolean isIsogram = true;        

        if (phrase != "" || phrase == null) {
            phrase = phrase.toUpperCase().replaceAll(" ", "").replaceAll("-", "");
            if (phrase.length() != phrase.chars().distinct().count()) {
                isIsogram = false;
            }       
        }        
        return isIsogram;   
    }
}