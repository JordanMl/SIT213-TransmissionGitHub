package destinations;

import information.Information;
import information.InformationNonConforme;

public class DestinationFinale extends Destination<Boolean>{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void recevoir(Information<Boolean> information) throws InformationNonConforme {
		
		for(Boolean info : information){
			System.out.println(info);
		}
	}

}
