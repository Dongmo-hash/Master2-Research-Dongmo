/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscriptionetudiants;

import com.mysql.jdbc.Connection;
import static inscriptionetudiants.ConnexionBD.connexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author user
 */
public class InscriptionEtudiants {
     /**
     * @param args the command line arguments
     */
   static Connection con = (Connection) connexion();
   static Statement st;
   static ResultSet rst;
   static PreparedStatement pst;
   public static void main(String[] args) {
        try{
          con = (Connection) connexion();
         
          st=con.createStatement();
       
          rst=st.executeQuery("SELECT * FROM etudiant");
          while(rst.next()){
          System.out.print(rst.getInt("id")+"\t");
          System.out.print(rst.getString("email")+"\t");
          System.out.print(rst.getString("cni")+"\t");
          System.out.print(rst.getString("matricule")+"\t");
          System.out.print(rst.getString("nom")+"\t");
          System.out.print(rst.getString("prenom"));         
          System.out.print(rst.getInt("age")+"\t");
      //    System.out.print(rst.getString("filiere")+"\t");
      //    System.out.print(rst.getString("niveau"));
          System.out.println();
          }
          }catch (Exception ex) {
              ex.printStackTrace();
            }

      //  ConnexionBD connect = new ConnexionBD();
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    try {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(InscriptionEtudiants.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        Logger.getLogger(InscriptionEtudiants.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(InscriptionEtudiants.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(InscriptionEtudiants.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
            }
    /*  EnregistrementEtudiant enregistrer = new EnregistrementEtudiant(); 
      enregistrer.setVisible(false);
      enregistrer.setSize(700, 600);
      enregistrer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      enregistrer.setLocationRelativeTo(null);
        
       */
      Connexion con = new Connexion();
      con.setVisible(true);
      con.setSize(500, 400);
      con.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      con.setLocationRelativeTo(null);

 //   }
    
}

}
