import java.util.Scanner;


public class MaiorDeTres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o primeiro n�mero ");
		Scanner LerS = new Scanner(System.in);
		double A=LerS.nextDouble();
		System.out.println("Digite o segundo n�mero ");
		double B=LerS.nextDouble();
		System.out.println("Digite o terceiro n�mero ");
		double C=LerS.nextDouble();
		double Maior;
		if (A>B)
			if (A>C)
				Maior=A;
			else Maior=C;
		else
			if(B>C)
				Maior=B;
			else
				Maior=C;
		System.out.printf(String.format("%3.2f � o maior de %3.2f,  %3.2f, %3.2f", Maior, A,B, C));
		
		
	}

}
