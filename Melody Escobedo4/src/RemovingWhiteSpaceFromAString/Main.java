package RemovingWhiteSpaceFromAString;

public class Main {

    public static void main(String[] args) {

        String str="Fighting Melody for your grades";

        char[] chars = str.toCharArray();
        String str1 = "";
        for (int i = 0; i<chars.length;i++)
        {
            if(chars[i]!=' ')
            {
                str1=str1 + chars[i];
            }

        }
        System.out.println(str1);
    }
}
