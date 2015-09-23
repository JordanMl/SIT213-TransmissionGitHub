package transmetteurs;

import destinations.DestinationInterface;
import information.Information;
import information.InformationNonConforme;

public class TransmetteurParfait<R,E> extends Transmetteur<R,E>{


	@Override
	public void recevoir(Information<R> information) throws InformationNonConforme {
		informationRecue = information;
		informationEmise = (Information<E>) informationRecue; //On se contente de copier l'info recue pour l'emettre
        emettre();		
	}

	@Override
	public void emettre() throws InformationNonConforme {
		for (DestinationInterface<E> destinationConnectee : destinationsConnectees) {
            destinationConnectee.recevoir(informationEmise);
         }   
	}

}
