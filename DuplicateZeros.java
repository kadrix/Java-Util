public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
      
        int arrLen = arr.length;
        int len = arrLen;
        
        for (int i = 0; i < arrLen; i ++){
          if (arr[i]==0){
            for (int j = len-2; j>=i; j--){
              arr[j+1] = arr[j];
            }
            i++;
          }
        }
      }
      
      public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        String str = "weijf";
        char[] charArr = str.toCharArray();
        int size = charArr.length;
  
  
     }
}