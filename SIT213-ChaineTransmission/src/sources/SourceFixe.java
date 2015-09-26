package sources;

import information.*;
import destinations.DestinationInterface;

import java.util.*;

public class SourceFixe extends Source<Boolean>{

	/**
	 * Ce constructeur va créer une objet de type source fixe. Cet objet va permettre à l'utilisateur de spécifie la donnée à emettre.
	 * Pour ce faire, le constructeur recupere en parametre une chaine de caractere contenant la donnée à emettre, et va la transformer
	 * en suite de booleens
	 * @param pinfos : contient une chaîne de caractére (une suite de 0 et de 1) qu'on suite émettre
	 * 
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
