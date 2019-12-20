class Hamming {

    String message = "";
    int distance = 0;

    Hamming(String leftStrand, String rightStrand) {
        validate(leftStrand, rightStrand);        
        for (int i = 0; i < rightStrand.length(); i++) {
            if (!(leftStrand.charAt(i) == rightStrand.charAt(i))) {
                distance = distance + 1;
            }
        }
    }

    int getHammingDistance() {
        return distance;
    }

    void validate(String leftStrand, String rightStrand) {
        if (!leftStrand.equals(rightStrand)) {
            if (leftStrand.isEmpty())  { message = "left strand must not be empty."; }
            if (rightStrand.isEmpty()) { message = "right strand must not be empty."; }
            if (!message.isEmpty()) { throw new IllegalArgumentException(message); }
        }
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }        
    }
}