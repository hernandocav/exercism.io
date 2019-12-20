public class Bob {
    private static final String MSG_EMPTY          = "Fine. Be that way!";
    private static final String MSG_UPPER          = "Whoa, chill out!";
    private static final String MSG_QUESTION_UPPER = "Calm down, I know what I'm doing!";
    private static final String MSG_QUESTION       = "Sure.";
    private static final String MSG_WHATEVER       = "Whatever.";    

    public String hey(String param) {
        param = param.replaceAll("[-'()+.^:,!%*@#$ ]", "").trim();
        String answer = "";
        if (param.equals("") && param.length() == 0) {
            answer = MSG_EMPTY;
        } else if (isStringUpperCase(param)) {
            answer = MSG_UPPER;
            if (isQuestion(param)) { answer = MSG_QUESTION_UPPER; }
        } else if (isQuestion(param)) {
            answer = MSG_QUESTION;
            if (isStringUpperCase(param)) { answer = MSG_QUESTION_UPPER; }
        } else {
            answer = MSG_WHATEVER;
        }        
        return answer;
    }

    private static boolean isQuestion(String str) {
        return str.substring(str.length() - 1).equals("?");
    }

    private static boolean isStringUpperCase(String str) {
        str = str.replaceAll("[?1234567890]", "");
        char[] charArray = str.toCharArray();
        if (str.length() > 0) {
            for (int i = 0; i < charArray.length; i++) {
                if (!Character.isUpperCase(charArray[i])) {
                    return false;
                }                    
            }
            return true;
        } else {
            return false;
        }
    }
}