package string.utils;

import java.util.Arrays;
import java.util.List;

public class StringUtils {
    public static List<String> toList(String stringifiedList) {
        List<String> newList;
        newList = Arrays.asList(stringifiedList.split(","));

        return newList;
    }
}
