import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] numbers, int target){
		Map<Integer, Integer> hashMap = new HashMap<>();
		for(int i = 0; i < numbers.length; i++){
			hashMap.put(numbers[i], i);
		}
		int complement;
		for(int i = 0; i < numbers.length; i++){
			complement = target - numbers[i];
			if(hashMap.containsKey(complement) && hashMap.get(complement) != i)
			return new int[] { i, hashMap.get(complement) };
		}
		throw new IllegalArgumentException("No solution found");
	}
	
	public static void main(int[] args){
		TwoSum ts = new TwoSum();
		int[] numbers = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int target = 7;
		System.out.println(ts.twoSum(numbers, target));
	}
	
}