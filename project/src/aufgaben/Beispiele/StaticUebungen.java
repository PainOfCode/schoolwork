package aufgaben.Beispiele;

public class StaticUebungen {

    public static double max3(double d1, double d2, double d3) {

        if (d1 > d2) {

            if (d1 > d3) {
                return d1;
            }

            return d3;
        } else if (d2 > d3) {
            return d2;
        } else {
            return d3;
        }

    }

    public static boolean majority(boolean b1, boolean b2, boolean b3) {
        return b1 && b2 || b2 && b3 || b1 && b3;
    }

    public static String[] textFilter(String[] arr1, String[] arr2) {

        String[] res;

        if (arr1.length > arr2.length) {
            res = new String[arr1.length];
        } else {
            res = new String[arr2.length];
        }

        int i = 0;
        boolean skip;
        for (String str : arr1) {

            skip = false;

            for (String compare : arr2) {

                if (str.equals(compare)) {
                    skip = true;
                }

            }

            if (skip) {
                continue;
            }

            res[i] = str;
            i++;

        }

        return res;
    }

}
