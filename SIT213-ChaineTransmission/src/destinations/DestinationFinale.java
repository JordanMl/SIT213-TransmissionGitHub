package destinations;

import information.Information;
import information.InformationNonConforme;

public class DestinationFinale<T> extends Destination<T>{

	@Override
	public void recevoir(Information<T> information) throws InformationNonConforme {
		
		for(T info : information){
			System.out.println(info);
		}
	}

}
