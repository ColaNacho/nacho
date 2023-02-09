package codingTest01;

public class ShotOfMoney {
	public static void main(String[] args) {
		class Solution {
		    public long solution(long price, long money, int count) {
		       long answer = 0;
		       long price_ori = price;
		        for(int i=1; i<count+1; i++) {
		        		if(i==1) {
		        			price = (price_ori)*i;
			        		money -= price;
			        		System.out.println("1번  price_ori: "+i+"번째 : "+price_ori);
			        		System.out.println("1번  price: "+i+"번째 : "+price);
			        		System.out.println("1번 money: "+i+"번째 : "+money);
		        		}else {
		        			price = (price_ori)*i;
			        		money -= price;
			        		System.out.println("2번  price_ori: "+i+"번째 : "+price_ori);
			        		System.out.println("2번  price: "+i+"번째 : "+price);
			        		System.out.println("2번 money: "+i+"번째 : "+money);
		        		}
		        		if(money<0) {
		        			answer = -(money);
		        		}else {
		        			answer = 0;
		        		}
		        	}
		        return answer;
		        }
		    }
		
		class Solution1 {
		    public long solution(long price, long money, long count) {
		        return Math.max(price * (count * (count + 1) / 2) - money, 0);
		    }
		}
		
		Solution s = new Solution();
		System.out.println(s.solution(3, 20, 4));
		
		Solution1 s1 = new Solution1();
		System.out.println(s1.solution(3, 20, 4));
	}
}


