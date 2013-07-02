import java.util.Scanner;


public class MaiorDeDois01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double A, B, Maior;
		System.out.print("Digite o primeiro número: ");
		Scanner Ler = new Scanner(System.in);
		A=Ler.nextDouble();
		System.out.print("Digite o segundo número: ");
		B=Ler.nextDouble();
		if (A>B)
			Maior=A;
		else
			Maior=B;
		//System.out.printf(String.format("%1.4f é o maior dos dois números: %1.4f e %1.4f", Maior, A,B));
		System.out.printf(String.format("%s é o maior dos dois números: %s e %s", Maior, A,B));
	}

}
