import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		System.out.println("하고싶은 사칙연산을 입력하세요. : ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		
		if (!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/")  ) {
			System.out.println("사칙연산중 하나를 입력하세요. ");
		}else {
			System.out.println(str + "를 진행할 첫번째 숫자를 입력하세요.");
		}

		Scanner input1 = new Scanner(System.in);
//		int firstNum = input1.nextInt(); 
		
		while (!input1.hasNextInt()) {
			input1.next();
			System.err.print("정수를 입력하세요. ");
		}
		int firstNum = input1.nextInt();

		System.out.println("두번째 값을 입력하세요. : ");
		Scanner input2 = new Scanner(System.in);
		
		// 숫자만 입력가능하게
		while(!input2.hasNextInt()) {
			input2.next();
			System.err.print("정수를 입력하세요.");
		}
		
		int secondNum = input2.nextInt();
		int result = 0;
		
		if (str.equals("+")) {
			result = firstNum - secondNum;

		}else if(str.equals("-")) {
			result = firstNum - secondNum;

		}else if(str.equals("*")) {
			result = firstNum * secondNum;

		}else if(str.equals("/")) {
			result = firstNum / secondNum;
		}

		System.out.println(firstNum + str + secondNum + " = " + result);
	}
	
	// 숫자 체크
//	public boolean isNum(String input)
//	{
//	 var chars = "0123456789";
//	 return containsCharsOnly(input, chars);
//	}
//
}
