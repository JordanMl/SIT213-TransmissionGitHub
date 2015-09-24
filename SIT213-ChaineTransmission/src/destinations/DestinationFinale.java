package destinations;

import information.Information;
import information.InformationNonConforme;


public class DestinationFinale extends Destination<Boolean>{

	@Override
	public void recevoir(Information<Boolean> information) throws InformationNonConforme {
		
//		for(Boolean info : information.iterator()){
//			System.out.println(info);
//		}
		this.informationRecue = information ;
	}
	
	public Information<Boolean>  getInformationRecue() {
        return this.informationRecue;
     }


}
