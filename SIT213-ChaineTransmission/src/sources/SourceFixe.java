package sources;

import information.*;
import destinations.DestinationInterface;

import java.util.*;

public class SourceFixe extends Source<Boolean>{

	/**
	 * Ce constructeur va cr�er une objet de type source fixe. Cet objet va permettre � l'utilisateur de sp�cifie la donn�e � emettre.
	 * Pour ce faire, le constructeur recupere en parametre une chaine de caractere contenant la donn�e � emettre, et va la transformer
	 * en suite de booleens
	 * @param pinfos : contient une cha�ne de caract�re (une suite de 0 et de 1) qu'on suite �mettre
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
