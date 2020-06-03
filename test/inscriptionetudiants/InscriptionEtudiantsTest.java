/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscriptionetudiants;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class InscriptionEtudiantsTest {
    
    public InscriptionEtudiantsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class InscriptionEtudiants.
     */
    @Test
    public void testMain() {
     /*   int a = 4, b = 12;
        EnregistrementEtudiant enregistrer = new EnregistrementEtudiant();
        int result = enregistrer.addition(a, b);
        assertEquals(16, result);*/
                
                
        
        String email = "dongmosyndie@gmail.com"; 
        String cni = "abcd1234";
        String matricule = "18z2220";
        String nom = "dongmo";
        String prenom = "syndie";
        String filiere = "informatique";
        String niveau = "M2";
        int age = 25;
        EnregistrementEtudiant enregistrer = new EnregistrementEtudiant();
        String result = enregistrer.inscrireEtudiant(email);
        String resultcni = enregistrer.inscrireEtudiantcni(cni);
        String resultmat = enregistrer.inscrireEtudiantmatricule(matricule);
        String resultnom = enregistrer.inscrireEtudiantnom(nom);
        String resultprenom = enregistrer.inscrireEtudiantprenom(prenom);
        String resultfiliere = enregistrer.inscrireEtudiantfiliere(filiere);
        String resultniveau = enregistrer.inscrireEtudiantniveau(niveau);
        int resultage = enregistrer.inscrireEtudiantage(age);
        assertEquals("dongmosyndie@gmail.com", result); 
        assertEquals("abcd1234", resultcni); 
        assertEquals( "18z2220", resultmat); 
        assertEquals("dongmo", resultnom); 
        assertEquals("syndie", resultprenom);  
        assertEquals("informatique", resultfiliere); 
        assertEquals( "M2", resultniveau);
        assertEquals(25, resultage);
        
    /*    System.out.println("main");
        String[] args = null;
        InscriptionEtudiants.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype."); */
       
    }
     @Test
      public void testFalse(){
      String email = "dongmosyndie@gmail.com"; 
      EnregistrementEtudiant enregistrer = new EnregistrementEtudiant();
      String result = enregistrer.inscrireEtudiant(email);
      assertFalse("dongmosyndie@gmail.com", false);
      }
       @Test
      public void testtrue(){
      String email = "dongmosyndie@gmail.com"; 
      EnregistrementEtudiant enregistrer = new EnregistrementEtudiant();
      String result = enregistrer.inscrireEtudiant(email);
      assertFalse("dongmosyndie@gmail.com", true);
      }
    
}
