import java.util.HashSet;

class FindDuplicatesInArray {
    public static boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i< nums.length; i++){
            if (set.contains(nums[i])){
                return false;
            }
            else {
                set.add(nums[i]);
            }
            
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        containsDuplicate(nums);

    }
}