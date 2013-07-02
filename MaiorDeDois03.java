import java.util.Scanner;


public class MaiorDeDois03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		double A, B;
		System.out.print("Digite o primeiro número: ");
		Scanner LerS = new Scanner(System.in);
		A=LerS.nextDouble();
		System.out.print("Digite o segundo número: ");
		B=LerS.nextDouble();
		if (A>B)
			System.out.println(A+" é o maior.");
		else if (B>A)
			System.out.println(B+" é o maior");
		else
			System.out.println("Os dois números são iguais.");
		
	}

}
