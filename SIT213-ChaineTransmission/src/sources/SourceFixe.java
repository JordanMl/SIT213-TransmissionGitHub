package sources;

import information.*;
import destinations.DestinationInterface;
import java.util.*;

public class SourceFixe <T> extends Source<T>{

	/**
	 * @param pdestinations 
	 * @param pinfos 
	 * @param args
	 */
	
	public SourceFixe(Information<T> pinfos){
	
		informationGeneree = pinfos ;
		informationEmise = null;
	}

}
