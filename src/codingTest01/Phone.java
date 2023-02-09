package codingTest01;

import java.util.ArrayList;
import java.util.Comparator;

public class Phone {
	 	public static void main(String[] args) {
	 		 class Solution {
	 		    public String solution(String s) {

	 		        String finalString = s
	 		                .replace("111", "Z")
	 		                .replace("11", "Q")
	 		                .replace("1", ".")
	 		                .replace("222", "C")
	 		              .replace("22", "B")
	 		              .replace("2", "A")
	 		                .replace("333", "F")
	 		              .replace("33", "E")
	 		              .replace("3", "D")
	 		                .replace("444", "I")
	 		              .replace("44", "H")
	 		              .replace("4", "G")
	 		                .replace("555", "L")
	 		              .replace("55", "K")
	 		              .replace("5", "J")
	 		                .replace("666", "O")
	 		              .replace("66", "N")
	 		              .replace("6", "M")
	 		                .replace("777", "S")
	 		              .replace("77", "R")
	 		              .replace("7", "P")
	 		                .replace("888", "V")
	 		              .replace("88", "U")
	 		              .replace("8", "T")
	 		                .replace("999", "Y")
	 		              .replace("99", "X")
	 		              .replace("9", "W")
	 		              .replace("0", "");
	 		       
	 		       
	 		       return finalString;
	 		    }
	 		}
	 		
	 		Solution s = new Solution();
			System.out.println(s.solution("2220281"));
			

	 	}
}
