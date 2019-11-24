import java.util.HashMap;
import java.util.Map;

class CheckForPermutation {
    public static boolean checkForPerms(String stringOne, String stringTwo) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < stringOne.length(); i ++){
            map.put(stringOne.charAt(i), map.getOrDefault(stringOne.charAt(i), 0) + 1);
        }

        for (int j = 0; j < stringTwo.length(); j++){
            if (map.containsKey(stringTwo.charAt(j))){
                map.put(stringTwo.charAt(j), map.get(stringTwo.charAt(j)) - 1);
            }
        }

        for (char key : map.keySet()){
            if (map.get(key) != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String firstStr = "CABa";
        String secondStr = "ABC";
        Boolean result = checkForPerms(firstStr, secondStr);
        System.out.println(result.toString());
    }
}