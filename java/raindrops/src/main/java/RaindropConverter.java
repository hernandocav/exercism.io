class RaindropConverter {

    /**
     * Returns a raindrop-speak about numbers.
     * @param number
     * @return raindrop-speak
     */
    String convert(int number) {
        String out = "";
        if (number % 3 == 0) {out = out + "Pling";}
        if (number % 5 == 0) {out = out + "Plang";}
        if (number % 7 == 0) {out = out + "Plong";}
        if (out == "") {out = String.valueOf(number);}
        return out;        
    }
}
