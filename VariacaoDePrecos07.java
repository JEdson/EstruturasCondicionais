import java.util.Scanner;


public class VariacaoDePrecos07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int Pmaxima=5;
		String Aviso="Aumento razo�vel";
		double Patual, Pantes, Varia;
		System.out.print("Pre�o atual? ");
		Scanner LerS = new Scanner(System.in);
		Patual=LerS.nextDouble();
		System.out.print("Pre�o anterior? ");
		Pantes=LerS.nextDouble();
		Varia=(Patual-Pantes)/Pantes*100;
		if (Varia>Pmaxima)
			Aviso="Aumento excessivo!";
		System.out.print(String.format("%5.2f%c----> %s", Varia,'%',Aviso));
				
	}

}
