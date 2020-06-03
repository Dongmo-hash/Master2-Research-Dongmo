/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscriptionetudiants;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author user
 */
//public class ConnexionBD extends InscriptionEtudiants {
public class ConnexionBD{
  
 Connection con = null;

 public static Connection connexion(){
         
         
        /*  Chargement de la Base de données  */
            try{
                 
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println(" Driver oki!!!! ");
                String url="jdbc:mysql://localhost:3306/gestionetudiant_bd";
                String user="root";
                String passwd="";
                Connection con=DriverManager.getConnection(url, user, passwd);
                System.out.println(" Connexion bien etablie!!! ");
                return con; 
            } catch (Exception e) {
               e.printStackTrace();
               return null;
            }
 }        

}
