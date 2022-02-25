package CheckingWhetherTwoStringsAreAnanagram;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String s1 = "battle";
        String s2 = "tablet";

        boolean checkAnagram = isAnagrams(s1, s2);
        if (checkAnagram)
            System.out.println("Both Strings are Anagrams.");
        else
            System.out.println("Both Strings are not Anagrams.");
    }

    private static boolean isAnagrams(String s1, String s2) {
    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();

    Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.toString(c1).equals(Arrays.toString(c2)))
            return true;
        return false;
    }
}
