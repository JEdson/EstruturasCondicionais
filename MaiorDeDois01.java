import java.util.Scanner;


public class MaiorDeDois01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double A, B, Maior;
		System.out.print("Digite o primeiro n�mero: ");
		Scanner Ler = new Scanner(System.in);
		A=Ler.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		B=Ler.nextDouble();
		if (A>B)
			Maior=A;
		else
			Maior=B;
		//System.out.printf(String.format("%1.4f � o maior dos dois n�meros: %1.4f e %1.4f", Maior, A,B));
		System.out.printf(String.format("%s � o maior dos dois n�meros: %s e %s", Maior, A,B));
	}

}
