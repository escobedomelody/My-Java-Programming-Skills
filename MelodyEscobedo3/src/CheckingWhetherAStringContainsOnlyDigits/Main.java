package CheckingWhetherAStringContainsOnlyDigits;

public class Main {
    public static boolean checkforDigits(String s) {
        if (s == null || s.isEmpty())
        {
            return false;
        }
        for (int x = 0; x < s.length(); x++) {
            if (!Character.isDigit(s.charAt(x))) {
                return false;
            }
        }

return true;
    }
    public static void main(String[] args) {
        String digitString = "4567";
        String textString = "wxyz";
boolean result = checkforDigits(digitString);
System.out.println(result);

result = checkforDigits(textString);
System.out.println(result);

    }
}
