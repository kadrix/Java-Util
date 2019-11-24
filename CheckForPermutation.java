import java.util.HashMap;
import java.util.Map;

class CheckForPermutation {
    public static boolean checkForPerms(String stringOne, String stringTwo) {
        Map<Character, Integer> map = new HashMap<>();
        
        
        for (int i = 0; i < stringOne.length(); i ++){
            map.put(stringOne.charAt(i), map.getOrDefault(stringOne.charAt(i), 0) + 1);
            System.out.println(stringOne.charAt(i));
        }

        for (int j = 0; j < stringTwo.length(); j++){
            if (map.containsKey(stringTwo.charAt(j))){
                map.put(stringTwo.charAt(j), map.get(stringTwo.charAt(j)) - 1);
                System.out.println(stringTwo.charAt(j));
            }
        }

        return false;
        
    }

    public static void main(String[] args) {
        String firstStr = "CAB";
        String secondStr = "ABC";
        checkForPerms(firstStr, secondStr);

    }
}