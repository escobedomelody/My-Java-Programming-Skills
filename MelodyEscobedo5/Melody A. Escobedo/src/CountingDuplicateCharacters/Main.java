package CountingDuplicateCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        String str = " dictionary indicatory ";

        char[] chars = str.toCharArray(); // d i c t i o n a r y i n d i c a t o r y

        Map<Character, Integer> charMap = new HashMap<>();

        // logic --> Characters are inserted as Keys and respective count inserted as Values.
        // If map already contains then increase the value by 1.


        for (Character ch : chars) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        // loop through only Keys

        Set<Character> keys = charMap.keySet();

        for (Character ch : keys)
        {
            if (charMap.get(ch) > 1)
            {
                System.out.println("Character" + ch + " repeating " + charMap.get(ch) + " times. ");
            }

        }

        }

    }
