package codingTest01;

public class WaterMelon {
	public static void main(String[] args) {
		class Solution {
		    public String solution(int n) {
		    	  String[] answer = new String[n];
			        String water = "";
			        for(int i=0; i<n; i++) {
			        	answer[0]="수";
			        	if(i%2!=0) {
			        		answer[i]="박";
			        	}else {
			        		answer[i]="수";
			        	}
			        }
			        for(int i=0; i<n; i++) {
			        	water+=answer[i];
			        	System.out.println(i+"는 "+water);
			        }
			        return water;
			    }
			}
			
			Solution s = new Solution();
			System.out.println(s.solution(15));
		}
		        
}
/*
 * public class WaterMelon { public String watermelon(int n){
 * 
 * return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n); }
 * 
 * // 실행을 위한 테스트코드입니다. public static void main(String[] args){ WaterMelon wm =
 * new WaterMelon(); System.out.println("n이 3인 경우: " + wm.watermelon(3));
 * System.out.println("n이 4인 경우: " + wm.watermelon(4)); } }
 */

