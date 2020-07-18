
class findMaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
      int runMax = 0;
      int finalMax = 0;
      
      for (int i = 0; i < nums.length; i++){
        if (nums[i] == 1){
          runMax ++;
          finalMax = Math.max(finalMax, runMax);
        } else {
          runMax = 0;
        }
      }
      return finalMax;
    }




    public static void main(String[] args) {
      int[] arr = {1, 0, 1, 1,0,1,1,1,1};
      int result = findMaxConsecutiveOnes(arr);
      String str = "weijf";
      char[] charArr = str.toCharArray();
      int size = charArr.length;

      System.out.println(result);

   }
}