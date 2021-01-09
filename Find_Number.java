
public class Find_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Arrays = {12, 345, 2, 6, 7896};
		
		findNumbers(Arrays);
		
		
	}
	
	public static int findNumbers(int[] nums) {
		int dig = 0;
		int[] Array_Even = {};
		for(int i = 0; i < nums.length; i++) {
			
			for(int j = 5; j <= 0; j--) {
				if((nums[i] / 10^j) != 0) {
					dig = j;
					if(j % 2 == 0) {
						Array_Even = nums[i];
					}
				}
			}
		}
		
	}

}
