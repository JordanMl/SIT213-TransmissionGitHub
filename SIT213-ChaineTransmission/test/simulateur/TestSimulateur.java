package simulateur;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import test.ArgumentsException;
import test.Simulateur;

public class TestSimulateur {

	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Before
	public void setUp() throws Exception {
		//Execution de cas normaux.
		String args[] = {"-mess","1001001","-s"};
		Simulateur simulateur = new Simulateur(args);
		String args2[] = {"-mess","1001001","-s","-seed","14514"};
		Simulateur simulateur2 = new Simulateur(args2);
		String args3[] = {"-mess","1425","-s"};
		Simulateur simulateur3 = new Simulateur(args3);
		
	}

	@Test
	public void testSimulateur() throws ArgumentsException {
		thrown.expect(ArgumentsException.class);
		thrown.expectMessage("Vous devez avoir au moins deux argument");
		String args[] = {"-mess"} ;
		Simulateur simulateur2 = new Simulateur(args);
		
		thrown.expect(ArgumentsException.class);
		thrown.expectMessage("Vous devez avoir au moins deux argument");
		String args2[] = {} ;
		simulateur2 = new Simulateur(args2);
		
	}
	/**
	 * Cette classe test va tester les differentes exceptions que peut catcher la méthode argument
	 * Pour ce faire, nous utilisons le constructeur Simulateur, qui utilise cette methode lors de la construction
	 * d'une instance Simulateur
	 * @throws ArgumentsException
	 */
	@Test
	public void testAnalyseArguments1() throws ArgumentsException { 
		thrown.expect(ArgumentsException.class);
		thrown.expectMessage("Valeur du parametre -mess invalide : 10010002251");
		String args[] = {"-mess","10010002251"};
		Simulateur simulateur = new Simulateur(args);

	}
	@Test
	public void testAnalyseArguments2() throws ArgumentsException { 
		thrown.expect(ArgumentsException.class);
		thrown.expectMessage("Valeur du parametre -mess invalide : 0");
		String args[] = {"-mess","00"};
		Simulateur simulateur = new Simulateur(args);

	}
	
	@Test
	public void testAnalyseArguments3() throws ArgumentsException { 
		thrown.expect(ArgumentsException.class);
		thrown.expectMessage("Valeur du parametre -seed  invalide :dqsdqs");
		String args[] = {"-seed","dqsdqs"};
		Simulateur simulateur = new Simulateur(args);

	}
	
	@Test
	public void testAnalyseArguments4() throws ArgumentsException { 
		thrown.expect(ArgumentsException.class);
		thrown.expectMessage("Option invalide :-seedDS");
		String args[] = {"-seedDS","dqsdqs"};
		Simulateur simulateur = new Simulateur(args);

	}
	/**
	 * Classe testant la méthode permettant de calculer le TEB
	 * Puisque nous utilisons dans cette étape (1) un simulateur parfait, il doit nous renvoyer à chaque fois 0.
	 * @throws Exception 
	 */
	@Test
	public void testCalculTEB() throws Exception {
		String args[] = {"-mess","1001001","-s"};
		Simulateur simulateur = new Simulateur(args);
		simulateur.execute();
		assertEquals((float)0,simulateur.calculTauxErreurBinaire(),0.0000f);
		
		String args2[] = {"-mess","541","-s"};
		Simulateur simulateur2 = new Simulateur(args2);
		simulateur2.execute();
		assertEquals((float)0,simulateur2.calculTauxErreurBinaire(),0.0000f);
		
		String args3[] = {"-mess","541","-seed","1451","-s"};
		Simulateur simulateur3= new Simulateur(args3);
		simulateur3.execute();
		assertEquals((float)0,simulateur3.calculTauxErreurBinaire(),0.0000f);
		
		
	}
	
	@Test
	public void testMain(){
		String args[] = {"-mess","1001001","-s"};
		Simulateur.main(args);
		String args2[] = {"-mess","1001001","-s","-seed","14514"};
		Simulateur.main(args2);
		String args3[] = {"-mess","1425","-s"};
		Simulateur.main(args3);
	}
}
