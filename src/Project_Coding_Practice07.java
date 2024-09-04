// while문을 사용하여, 1부터 Scanner 클래스 활용 입력값까지
// 양의 정수 중에서 다음의 실행 결과와 같이
// 3의 배수만 출력하는 자바 프로그램을 제작해 봅니다.
//  [실행 결과 예시(1) : Scanner 클래스 활용 20를 입력값으로 받을 경우,
//  3, 6, 9, 12, 15, 18
//  [실행 결과 예시(2) : Scanner 클래스 활용 10를 입력값으로 받을 경우,
//  3, 6, 9

import java.util.Scanner;

public class Project_Coding_Practice07 {

    public static void main(String[] args) {
    	// Scanner 클래스를 활용하여 시스템으로부터 입력 받은 값을 변수 in에 담아서
    			// scan 객체 참조 변수에 대입해 줍니다.		
    		Scanner scan = new Scanner(System.in);
	      
    		System.out.print(" 정수를 입력해 주세요 ===> ");
    			
    			
    			int n= scan.nextInt();
    			System.out.println( n +"의 3의배수");
    			
    			int i = 3;
    			
    			while(i <=n) {
    				if (i%3 == 1){
    					System.out.println(i);
    					i +=3; 
    					if(i+3 <= n) {
    						System.out.println(", ");
    					}
    					i+=3; 
    				}
    				
    				scan.close();
    				
    			
    			}
    			
    			

    		

    }
}










