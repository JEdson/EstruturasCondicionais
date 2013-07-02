import java.util.Scanner;


public class RaizezEq04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double A, B, C, Disc;
		System.out.print("Digite o coeficiente de x^2: ");
		Scanner LerS = new Scanner(System.in);
		A = LerS.nextDouble();
		System.out.print("Digite o coeficiente de x: ");
		B = LerS.nextDouble();
		System.out.print("Digite o coeficiente independente: ");
		C = LerS.nextDouble();
		Disc=Math.pow(B, 2)-4*A*C;
			if (Disc>0){
				System.out.print(String.format("x1=%5.2f\n", (-B+Math.sqrt(Disc))/(2*A)));
				System.out.print(String.format("x1=%5.2f\n", (-B-Math.sqrt(Disc))/(2*A)));
			}else
					System.out.print(String.format("Raízesimaginárias\n"));
						
			
	}

}
