import java.util.Scanner;


public class OperadorTernario06 {

	/**
	 * @param args
	 */
	public static void main(String[] args)  {
		int Nota;
		// TODO Auto-generated method stub
		System.out.print("Nota do exame:");
		Scanner LerS = new Scanner(System.in);
		Nota=LerS.nextInt();
		System.out.println(Nota>=7? "Parabens":"Marque novo exame");
	}

}
