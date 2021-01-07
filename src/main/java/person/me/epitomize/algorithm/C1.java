package person.me.epitomize.algorithm;

public class C1 {
    public static void Fibonacci(){

    }

    public static void Hanoi(){

    }

    /**
     *
     * @return is exist
     */
    public boolean existInorderedMatrix(int n, int[][] matrix){

        return  true;
    }


    public static int findAnyRepeat(int[] nums){
        for (int i=0; i< nums.length; i++){
            while (nums[i] != i){
                if (nums[i] == nums[nums[i]]){
                    return nums[i];
                }
                swap(nums, i, nums[i]);
            }
        }
        return -1;
    }

    public static void  swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


    public static void main(String[] args) {
        int[] input = new int[]{0,1,2,3,4,3};
        System.out.println(findAnyRepeat(input));
    }



}
