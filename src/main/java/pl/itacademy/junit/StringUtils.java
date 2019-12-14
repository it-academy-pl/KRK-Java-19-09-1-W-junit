package pl.itacademy.junit;

public class StringUtils {
    public static boolean isNull(String text) {
        return text == null;
    }

    public static boolean isEmpty(String text) {
        return text == null || text.isEmpty();
    }


    public static String subString(String test, int position) {
        return test.substring(position);
    }

    public static boolean contains(String textToLocate, String substring) {
        throw new IllegalArgumentException("One of parameters is null");
    }
}
