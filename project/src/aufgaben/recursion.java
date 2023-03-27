package aufgaben;

public class recursion {


    public static int recursiveComma(String str, int count) {

        if (str.equals("")) {
            return count;
        }

        if (str.charAt(0) == ',') {
            return recursiveComma(str.substring(1), count + 1);
        } else {
            return recursiveComma(str.substring(1), count);
        }

    }

    public static int countCommasRecStrBldr(StringBuilder str, int count) {

        if (str.isEmpty()) {
            return count;
        }

        if (str.charAt(0) == ',') {
            return countCommasRecStrBldr(str.deleteCharAt(0), count + 1);
        } else {
            return countCommasRecStrBldr(str.deleteCharAt(0), count);
        }

    }

    public static int commaCount(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ',') {
                count++;
            }

        }

        return count;
    }

}
