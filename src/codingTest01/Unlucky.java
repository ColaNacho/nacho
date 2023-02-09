package codingTest01;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;

public class Unlucky {
	 	public static void main(String[] args) {
	 		class Solution {
	 		    public long solution(int n) {
	 		        long answer = 0;
	 		        BigInteger bigInteger;
	 		        ArrayList<Long> unlucky = new ArrayList<Long>();
	 		        ArrayList<Long> tmp = new ArrayList<Long>();
	 		        
	 		        tmp.add((long)4);
	 		        tmp.add((long)13);
	 		        //0과 1에 넣어주기
	 		        
	 		       int count = 0;
	 		       Long num_1 = 0L;
	 		      Long num_2 = 0L;
	 		     while(true) {
	 		    	 if(count>n) {
	 		    		 break;
	 		    	 }
	 		    	   num_1 = tmp.remove(0); // 4 13 44 413 > 134 4134
	 		    		  num_2 = Long.parseLong(num_1+"4");
	 		    		  tmp.add(num_2); 
	 		    		  num_2 = Long.parseLong(num_1+"13");
		 		    	  tmp.add(num_2); // 413 1313
			 		      unlucky.add(num_1); // 다시  4집어 넣기 , 13들어감
	 		    	   
		 		       count++;
	 		      }
	 		        
	 		     	unlucky.sort(Comparator.naturalOrder());
	 		     	answer = (long)unlucky.get(n-1);
	 		     	return answer;
	 		        
	 		    }
	 		}
	 		
	 		Solution s = new Solution();
			System.out.println(s.solution(3500));
			

	 	}
}
