import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrays {

    public static void mergeArrs(int[] nums1, int[] nums2, int m, int n ) {
    int len = nums1.length;
    for (int i = 0; m < len; m ++){
        nums1[m]= nums2[i];
        i++;
    }

    }
    
      public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(43223);

        int m =3, n=3;
        mergeArrs(nums1, nums2, m, n);
        String str = "weijf";
        char[] charArr = str.toCharArray();
        int size = charArr.length;

        System.out.println(new ArrayList<Integer>(list));
  
  
     }
}