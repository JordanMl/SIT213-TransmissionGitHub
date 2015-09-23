package sources;

import information.Information;
import information.InformationNonConforme;

import java.util.LinkedList;

import destinations.DestinationInterface;

public class SourceFixe extends Source<Boolean>{

	/**
	 * @param pdestinations 
	 * @param pinfos 
	 * @param args
	 */
	
	public SourceFixe(Information<Boolean> pinfos){
	
		informationGeneree = pinfos ;
		informationEmise = null;
	}

}
