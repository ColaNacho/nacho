package codingTest01;

import java.util.ArrayList;
import java.util.Comparator;

public class Unlucky2 {
	 	public static void main(String[] args) {
	 		class Solution {
	 		    public long solution(int n) {
	 		        long answer = 0;
	 		        
	 		        ArrayList<Long> unlucky = new ArrayList<Long>();
	 		        
	 		        unlucky.add((long) 4);
	 		        unlucky.add((long)13);
	 		        //0과 1에 넣어주기
	 		        
	 		       int count = 0;
	 		       Long num_1 = 0L;
	 		       
	 		     while(true) {
	 		    	 if(count==n) {
	 		    		 break;
	 		    		 //count가 n보다 커지는 경우 n번째가 50이라 치면 count가 0부터 시작하여 51이 됐을 경우이며
	 		    	 }
	 			       System.out.println(count+"일 때 "+unlucky.get(0));
	 		    	   num_1 = unlucky.remove(0); // 4가 num_1로 들어가고 그 다음인 13이 들어감
	 		    	   unlucky.add(Long.parseLong(num_1+"4")); //44 134
		 		       // 413 134 첫 번째 수가 13이 되려면 remove(0)을 해주고 그 자리에 13을 넣는다. 첫 수는 4 그 다음 수는 13
		 		       unlucky.add(Long.parseLong(num_1+"13")); // 413 1313
		 		       unlucky.add(num_1); // 다시  4집어 넣기 , 13들어감
		 		       // 4 13 44 413 134 1313 13
		 		       count++;
		 		       
	 		      }
	 		        
	 		     	unlucky.sort(Comparator.naturalOrder());
	 		     	answer = unlucky.get(n-1);
	 		     	return answer;
	 		        
	 		    }
	 		}
	 		
	 		Solution s = new Solution();
			System.out.println(s.solution(10));
			

	 	}
}
