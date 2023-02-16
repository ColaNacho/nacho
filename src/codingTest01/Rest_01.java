package codingTest01;

public class Rest_01 {
	public static void main(String[] args) {
		class Solution {
		    public int solution(int n) {
		        long num = n;
		        int answer = 0;
		        while(num != 1 ){
		            if(num % 2 == 0){
		                num /= 2;
		            } else if(num % 2 != 0){   //3번
		                num = (num * 3)+1;
		            }
		            answer++;
		            if(answer > 500){
		                return -1;
		            }
		        }
		        
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		System.out.println(s.solution(626331));
	}
}
