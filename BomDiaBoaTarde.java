
public class BomDiaBoaTarde {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int Meiodia=12;
		Long Horacorrente=System.currentTimeMillis();
		int H=Integer.valueOf(String.format("%1$tH", Horacorrente));
		String Msg="";
		if (H<Meiodia)
			Msg="Bom dia";
		else
			Msg="Boa tarde";
		System.out.println(Msg);
	}

}
