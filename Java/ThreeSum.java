import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class ThreeSum {
    public Set<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        return set;
    } 

    public static void main(String[] args)  { 
    	ThreeSume t = new ThreeSume();
    	int[] nums = new int[] {-1,0,1,2,-1,-4};
    	System.out.println(t.threeSum(nums));
    } 
} 