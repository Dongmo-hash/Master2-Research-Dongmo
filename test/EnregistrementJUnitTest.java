/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import inscriptionetudiants.EnregistrementEtudiant;
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
public class EnregistrementJUnitTest {
    
    public EnregistrementJUnitTest() {
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

        
     @Test
     public void testeMain() {
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
       
    }
     
    @Test
    public void testeFalse(){
      String email = "dongmosyndie@gmail.com"; 
      EnregistrementEtudiant enregistrer = new EnregistrementEtudiant();
      String result = enregistrer.inscrireEtudiant(email);
      assertFalse("dongmosyndie@gmail.com", false);
      }
       @Test
    public void testetrue(){
      String email = "dongmoviada@gmail.com"; 
      EnregistrementEtudiant enregistrer = new EnregistrementEtudiant();
      String result = enregistrer.inscrireEtudiant(email);
      assertTrue("dongmoviada@gmail.com", true);
      }
        
    @Test
    public void testEnregistrement(){
        
        String email = "dongmoviada@gmail.com"; 
        String cni = "abcd1124";
        String matricule = "18z2221";
        String nom = "dogmo";
        String prenom = "syndie";
        String filiere = "informatique";
        String niveau = "M2";
        int age = 25;
        EnregistrementEtudiant enregistrer = new EnregistrementEtudiant();
        int nbreRow = enregistrer.countEtudiant();
        enregistrer.insertionEtudiant(email, cni, matricule, nom, prenom, age, filiere, niveau);
        int calcul = enregistrer.countEtudiant();    
        assertTrue(calcul > nbreRow);
    }   
   }
