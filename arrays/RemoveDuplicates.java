import java.util.Set;
import java.util.HashSet;


public class RemoveDuplicates {

    static int[] removeduplicate(int nums[]){
       int i=0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; // Write unique value
            }
        }
        int uniqueCount = i + 1;

   return nums;
    };

    static int[] removeDuplicates(int nums[]){

          Set <Integer> rd=new HashSet<>();

          for(int a:nums){
              rd.add(a);
          }

          int narr[]=new int[rd.size()];
        int i=0;
          for(Integer a:rd){
              narr[i++]=a;
          }

        return narr;

    };

    public  static void main (String [] args){
        int arr[]={12,42,10,56,10,45,22,45};

        int n[]=RemoveDuplicates.removeDuplicates(arr);

        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);

        }

    }


}
