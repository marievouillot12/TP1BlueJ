

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test ColisTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class ColisTest
{
    private Colis colis2;
    private bonLivraison BonLivraison1;

    
    

    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    
    

    /**
     * Constructeur de la classe-test ColisTest
     */
    public ColisTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        colis2 = new Colis("Marie", "Montreuil");
        BonLivraison1 = new bonLivraison();
        colis2.chargementColis(1.5);
        BonLivraison1.setColis(colis2);
        BonLivraison1.getPoids();
        BonLivraison1.getPrix();
        BonLivraison1.calculPrix();
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    

    @Test
    public void testChargementColis()
    {
        Colis colis_1 = new Colis("Paris", "Julienne");
        assertEquals(3.0, colis_1.chargementColis(2.9), 0.1);
    }

    @Test
    public void testCalculPrix()
    {
        assertEquals(2.0, colis2.chargementColis(0.4), 0.1);
        assertEquals(2.0, BonLivraison1.getPoids(), 0.1);
        assertEquals(21.0, BonLivraison1.calculPrix(), 0.1);
    }
}



