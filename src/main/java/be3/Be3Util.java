package be3;

public class Be3Util {

    public static String lowerCase(final String str) {
        if (str == null) {
            return null;
        }

        return str.toLowerCase();
    }

    public static String upperCase(final String str) {
        if (str == null) {
            return null;
        }

        return str.toUpperCase();
    }

}
