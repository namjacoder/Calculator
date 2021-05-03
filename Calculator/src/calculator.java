import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		String str 		= "";
		int secondNum 	= 0;
		int result 		= 0;

		System.out.println("정수를 입력하세요. : ");
		
		Scanner input1 = new Scanner(System.in);
		while (!input1.hasNextInt()) {
			input1.next();
			System.err.print("정수를 입력하세요. ");
		}
		result = input1.nextInt();
		
		while (true) {
			System.out.println("사칙연산중 하나를 입력하세요. ");
			Scanner scanner = new Scanner(System.in);
			str = scanner.next();
			
			//"quit" 입력시 탈출
			if (str.equals("quit")) {
				System.out.println("계산값은 : "+result);
				break;
			}
			
			//사칙연산 입력받을때까지 반복
			if (!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/")  ) {
				System.out.println("사칙연산중 하나를 입력하세요. ");

			//정수를 입력받아서 계산
			}else {
				System.out.println("정수를 입력하세요.");

				Scanner input2 = new Scanner(System.in);
				while (!input2.hasNextInt()) {
					input2.next();
					System.err.print("정수를 입력하세요. ");
				}
				secondNum = input2.nextInt();
				
				if (str.equals("+")) {
					result = Plus(result, secondNum);

				}else if(str.equals("-")) {
					result = Minus(result, secondNum);

				}else if(str.equals("*")) {
					result = Multiplication(result, secondNum);

				}else if(str.equals("/")) {
					result = Division(result, secondNum);
				}
			}
		}
	}
	
	//덧셈
	public static int Plus(int num1, int num2) {
		return num1 + num2;
	}

	//뺄셈
	public static int Minus(int num1, int num2) {
		return num1 - num2;
	}

	//곱셈
	public static int Multiplication(int num1, int num2) {
		return num1 * num2;
	}

	//나눗셈
	public static int Division(int num1, int num2) {
		return num1 / num2;
	}
}
