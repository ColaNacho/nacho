package codingTest01;

public class Numbers {
	 	public static void main(String[] args) {
	 		 class Solution {
	 			public int solution(int n, int v[]) {

	 				int tmp_top = 0;
	 				int tmp_low = 0;
	 				
	 				for(int i=0; i<v.length-1; i++) {
	 					for(int j=i+1; j<v.length; j++) {
		 					tmp_top=v[i]-v[j];
		 					if(tmp_low<tmp_top) {
		 						tmp_low=tmp_top;
		 						}
	 					}
	 				
	 			}
	 				if(tmp_low==0) {
	 					tmp_low=-1;
	 				}
	 				return tmp_low;
		    }
	 	}
	 		 
	 		Solution s = new Solution();
				int n=10;
				int[] v=new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
				System.out.println(s.solution(n, v));
		 	}


}
