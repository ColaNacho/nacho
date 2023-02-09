package codingTest01;

public class FindKim {
	public static void main(String[] args) {
		class Solution {
		    public String solution(String[] seoul) {
		        String answer = "Kim";
		        int l = 0;
		        for(int i=0; i<seoul.length; i++) {
		        	if(seoul[i].equals(answer)) {
			        	l = i;
		        }
		        }
		        return "김서방은 "+l+"에 있다";
		    }
		}
		
		Solution s = new Solution();
		String[] seoul = new String[] {"Jane", "Kim"};
		System.out.println(s.solution(seoul));
	}
}


