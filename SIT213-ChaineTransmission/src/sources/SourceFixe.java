package sources;

import information.*;
import destinations.DestinationInterface;

import java.util.*;

public class SourceFixe extends Source<Boolean>{

	/**
	 * Classe SourceFixe, permettant d'emettre une suite de bits non aléatoire
	 * @param pinfos Données sous fprme de chaîne de caractere contenant des 0 et 1, representant les données à emettre
	 */
	
	public SourceFixe(String pinfos){
	
		   
		   String[] tabString = pinfos.split("");
		   
		   Boolean[] information = new Boolean[tabString.length] ;
		   int i = 0 ;
		   for(String echantilon : tabString){
			   if(echantilon.equals("1")){
				   information[i] = true;
			   }else{
				   information[i] = false;
			   }
			   i++;
		   }
		   
		   informationGeneree = new Information<Boolean>(information);
		   
		  
	}
	

}
