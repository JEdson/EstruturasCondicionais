import java.util.Scanner;


public class ReprovacaoAprovDistincao_EX11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		final int Limaprov=10, Limdist=16;
		int T1, T2, T3;
		String Nome, Situacao;
		Scanner LerS = new Scanner(System.in);
		System.out.print("Nome do Aluno? ");
		Nome=LerS.next();
		System.out.print("Nota de Programa��o? ");
		T1=LerS.nextInt();
		System.out.print("Nota de Matem�tica? ");
		T2=LerS.nextInt();
		System.out.print("Nota de Sistemas de Informa��o? ");
		T3=LerS.nextInt();
		Situacao="Reprovado";
		if (T1>=Limaprov && T2>=Limaprov && T3>=Limaprov)
			Situacao="Aprovado";
		if ((T1>=Limdist && T2>=Limdist && T3>=Limaprov)||
			(T1>=Limdist && T3>=Limdist && T2>=Limaprov)||
			(T2>=Limdist && T3>=Limdist && T1>=Limaprov))
			Situacao="Aprovado com distin��o";
		   System.out.printf("%s --- %s",Nome, Situacao);
	}
}
