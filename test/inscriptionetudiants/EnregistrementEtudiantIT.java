/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscriptionetudiants;

import java.util.ArrayList;
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
public class EnregistrementEtudiantIT {
    
    public EnregistrementEtudiantIT() {
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
     * Test of inscrireEtudiant method, of class EnregistrementEtudiant.
     */
    @Test
    public void testInscrireEtudiant() {
        System.out.println("inscrireEtudiant");
        String email = "";
        EnregistrementEtudiant instance = new EnregistrementEtudiant();
        String expResult = "";
        String result = instance.inscrireEtudiant(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of etudList method, of class EnregistrementEtudiant.
     */
    @Test
    public void testEtudList() {
        System.out.println("etudList");
        EnregistrementEtudiant instance = new EnregistrementEtudiant();
        ArrayList<Etudiant> expResult = null;
        ArrayList<Etudiant> result = instance.etudList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of show_Etudiant method, of class EnregistrementEtudiant.
     */
    @Test
    public void testShow_Etudiant() {
        System.out.println("show_Etudiant");
        EnregistrementEtudiant instance = new EnregistrementEtudiant();
        instance.show_Etudiant();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
