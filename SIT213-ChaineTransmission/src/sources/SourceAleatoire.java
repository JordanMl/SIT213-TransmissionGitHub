package sources;

import information.Information;

import java.util.Random;

public class SourceAleatoire extends Source<Boolean>{
	
	/**
	 * Classe permettant de generer une suite de bits aléatoire avec le germe.
	 * le germe permet d'avoir la même suite binaire à chaque réalisation
	 * @param seed  germe utilisé pour generer une suite de bit aléatoire
	 * @param nb  taille de la donnée à emettre
	 */
	public SourceAleatoire(int seed,int nb){

		   Random generator = new Random(seed);
		   Boolean[] information = new Boolean[nb] ;
		   int i = 0 ;
		   for(i=0;i<nb;i++){
			   
				   information[i] = generator.nextBoolean();
			   
		   }
		   
		   informationGeneree = new Information<Boolean>(information);
		   
		  
	}
	/**
	 * Classe permettant de generer une suite de bits aléatoire sans le germe.
	 * @param nb  taille de la donnée à emettre
	 */
	public SourceAleatoire(int nb){

		   Random generator = new Random();
		   Boolean[] information = new Boolean[nb] ;
		   int i = 0 ;
		   for(i=0;i<nb;i++){			   
			   information[i] = generator.nextBoolean();	   
		   }
		   
		   informationGeneree = new Information<Boolean>(information);

	}
	
	 

}
