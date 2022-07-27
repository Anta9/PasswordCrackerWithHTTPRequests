

import javax.swing.JOptionPane;

public class MainAp
{   
    
    public static void main(String[] args)
     {  
     
      Integer var ;
      
        var = Integer.parseInt(JOptionPane.showInputDialog(null,
        "1. Tester le craquage par Brute Force\n"
       +"2. Vérifier si votre mot de passe se trouve dans le dictionnaire \n"
       +"0. Quitter \n"
      
       + "Que voulez-vous faire ?", "Password Cracker",JOptionPane.PLAIN_MESSAGE));
      
     CrackPassword newInstance = FabriquePassword.testPassword(var);
     JOptionPane.showMessageDialog(null, "Authenfication...","Authentification", JOptionPane.INFORMATION_MESSAGE);
                
     newInstance.findPassword();

     }
}

    

