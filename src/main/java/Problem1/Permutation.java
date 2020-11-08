package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums){

        List<List<Integer>> result= new ArrayList<>();
        permute(nums,0,result);
        return result;

    }

    // [1,2,3]

    //1,2,3
    // 1,3,2
    //2,1,3
    //2,3,1
    //3,1,2
    //3,2,1
    private static void permute(int [] nums, int position, List<List<Integer>> result) {
        // put number at position in the front
        // call the same private permute with position+1
        //put number back to its original position

        if(nums.length==0){
            List<Integer> emptyish= new ArrayList<Integer>();
            result.add(emptyish);
            return;
        }
        //stopping condition

        if (position == nums.length - 1) {
            List<Integer> oneResult = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                oneResult.add(nums[i]);
            }
            result.add(oneResult);
            return;
        }
        for(int i=position;i<nums.length;i++){
            swap(nums,i,position);
            permute(nums, position+1, result);
            swap(nums,i,position);
        }
    }

    private static void swap(int [] nums,int i,int j){
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j]=temp;
    }
}
