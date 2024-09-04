// Q3. 두 정수를 입력 받아서, 두 수중에서 큰 값을 구하는
//       자바 프로그램을 제작하시기 바랍니다.
//       결과 화면은 다음과 같이 구현하시기 바랍니다.
// 결과 화면
// 첫 번째 수를 입력해 주세요 ==> 
// 10
// 두 번째 수를 입력해 주세요 ==> 
// 20
// 두 번째 입력값 20이 더 큽니다.

import java.util.Scanner;

public class Project_Coding_Practice03 {
	public static void main(String[] args) {
		
		// Scanner 클래스를 활용하여 시스템으로부터 입력 받은 값을 변수 in에 담아서
		// scan 객체 참조 변수에 대입해 줍니다.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력해 주세요 ==> ");
		int num1 = scan.nextInt();
		
		System.out.print("두 번째 수를 입력해 주세요 ==> ");
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println("첫 번째 입력값 " + num1 + "이 더 큽니다!");
		} else if(num1 < num2) {
			System.out.println("두 번째 입력값 " + num2 + "이 더 큽니다!");
		} else {
			 System.out.println("입력하신 두 수의 값은 같습니다!");
		}

		// 객체 참조 변수 scan의 resource 자원 사용을 종결 처리합니다.
		scan.close();		
	}
}


