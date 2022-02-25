package FindingTheFirstNonRepeatedCharacter;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	String str = "calculator";
        HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();

        int lengthofstring = str.length();

        for(int i=0;i<lengthofstring;i++) {
            Character currentCharacter = str.charAt(i);
            if(hmap.containsKey(currentCharacter)==false) {
                hmap.put(currentCharacter, 1);
            }else {
                int currentFreq = hmap.get(currentCharacter);
                currentFreq++;
                hmap.put(currentCharacter, currentFreq);
            }
        }

        boolean noReapetingFound = false;
        for(int i=0;i<lengthofstring;i++) {

            Character currentCharacter = str.charAt(i);
            int currentFreq = hmap.get(currentCharacter);
            if(currentFreq == 1) {
                System.out.println(currentCharacter);
                noReapetingFound = true;
                break;
            }
        }

        if(noReapetingFound == false) {

            System.out.println(-1);
        }
    }
}
