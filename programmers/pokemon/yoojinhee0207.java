import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
		
		for(int i=0,length =nums.length; i<length; i++) {
			set.add(nums[i]);
		}
		
		int answer = set.size()<nums.length/2 ? set.size() : nums.length/2;
        
        return answer;
    }
}