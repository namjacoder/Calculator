import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		String str 		= "";
		int secondNum 	= 0;
		int result 		= 0;

		Scanner input1 = new Scanner(System.in);
		result = Input.getFirstValue(input1);	//첫번째 정수 가져오기
		
		while (true) {
			Scanner arithmetics = new Scanner(System.in);
			str = Input.getSymbol(arithmetics);	//사칙연산 가져오기
			
			//"quit" 입력시 탈출
			if (str.equals("quit")) {
				System.out.println("탈출!");
				break;
			}
			
			//사칙연산 입력받을때까지 반복
			if (!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/")  ) {

			//정수를 입력받아서 계산
			}else {
				Scanner input2 = new Scanner(System.in);
				secondNum = Input.getSecondValue(input2);		//두번째 정수 가져오기
				
				result = calculate(result, str, secondNum);
				Output.print(result);
			}
		}
	}
	
	static int calculate(int input1, String symbol, int input2) {
		int result = 0;

		if (symbol.equals("+")) {
			result = Plus(input1, input2);

		}else if(symbol.equals("-")) {
			result = Minus(input1, input2);

		}else if(symbol.equals("*")) {
			result = Multiplication(input1, input2);

		}else if(symbol.equals("/")) {
			result = Division(input1, input2);
		}	
		
		return result;
	}
	
	//덧셈
	static int Plus(int num1, int num2) {
		return num1 + num2;
	}

	//뺄셈
	static int Minus(int num1, int num2) {
		return num1 - num2;
	}

	//곱셈
	static int Multiplication(int num1, int num2) {
		return num1 * num2;
	}

	//나눗셈
	static int Division(int num1, int num2) {
		return num1 / num2;
	}
}
