package test;

import destinations.DestinationFinale;
import information.Information;
import information.InformationNonConforme;
import sources.SourceFixe;
import transmetteurs.TransmetteurParfait;
import visualisations.SondeLogique;

public class test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Boolean[] b = {true,false,true,false,true,false,true,false};
		Information<Boolean> pinfos = new Information<>(b);
		SourceFixe<Boolean> sf = new SourceFixe<Boolean>(pinfos);
		
		SondeLogique sl1 = new SondeLogique("sl1",50);
		SondeLogique sl2 = new SondeLogique("sl2",50);
		
		TransmetteurParfait<Boolean,Boolean> tp = new TransmetteurParfait<Boolean,Boolean>() ;
		
		DestinationFinale<Boolean> df = new DestinationFinale<Boolean>() ;
		
		sf.connecter(sl1);
		sf.connecter(tp);
		
		tp.connecter(sl2) ;
		tp.connecter(df) ;
		try {
			sf.emettre();
		} catch (InformationNonConforme e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
