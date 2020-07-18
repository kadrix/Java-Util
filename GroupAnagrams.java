import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class groupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            int[] arr = new int[26];
            for(int i = 0;i<s.length();i++){
                arr[s.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(arr);
            List<String> tempList = map.getOrDefault(key, new ArrayList<String>());
            tempList.add(s);
            map.put(key,tempList);
        }
        return new ArrayList<>(map.values());
    }
    public static void main (String[] args){
        String[] strs= {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> list = new ArrayList<>();
        list = groupAnagrams(strs);
        System.out.println(strs);
    }
    
}