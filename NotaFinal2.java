import java.util.Scanner;


public class NotaFinal2 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		final int Limaprov=6, Clfinal;
		final double Peso1=0.2, Peso2=0.5, Peso3=0.3;
		double T1, T2, T3;
		String Nome="", Situacao="";
		System.out.print("Nome do Aluno? ");
		Scanner LerS = new Scanner(System.in);
		Nome = LerS.next();
		System.out.print("Nota teste 1? ");
		T1=LerS.nextDouble();
		System.out.print("Nota teste 2? ");
		T2 = LerS.nextDouble();
		System.out.print("Nota teste 3? ");
		T3 = LerS.nextDouble();
		Clfinal=(int)(Peso1* T1+ Peso2* T2+ Peso3* T3+ 0.5);
		if (Clfinal>=Limaprov)
			Situacao="Aprovado";
		else
			Situacao="Reprovado";
		System.out.printf("%s ---%d --- %s", Nome, Clfinal, Situacao);
	}

}
