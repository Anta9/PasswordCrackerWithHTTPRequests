import java.io.*;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class GetDico extends CrackPassword
{   
    public static boolean testing()
    {
        boolean b=false;
    
    try
    {
      // Le fichier d'entrée
      FileInputStream file = new FileInputStream("/media/anta/38B2CABDB2CA7F3E/Users/USER/Desktop/PHACK/file1.txt");   
      Scanner scanner = new Scanner(file);  
      
      //renvoie true s'il y a une autre ligne à lire
      while(scanner.hasNextLine())
      {
        if(User.authentificate(scanner.nextLine())==true)
        {
            b=true;
            break;
        }
      }
      scanner.close();    
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
    return b;
}
    
    public void findPassword()
    {
        long startTime = System.currentTimeMillis();

        String guess;
            if (testing()==true)
                {
                    guess = itIs();
                    JOptionPane.showMessageDialog(null, "Votre mot de passe se trouve dans le dictionnaire : "+guess,"Password Found", JOptionPane.INFORMATION_MESSAGE);
                }
            else
                {
                  JOptionPane.showMessageDialog(null, "Votre mot de passe ne se trouve pas dans le dictionnaire : ","Password  not Found", JOptionPane.INFORMATION_MESSAGE);

                }
                long endTime = System.currentTimeMillis();
                JOptionPane.showMessageDialog(null,GetTime.duration(endTime, startTime),"Temps de recherche",JOptionPane.INFORMATION_MESSAGE );
    }
    public static String itIs()
    { String var="";
    String test;
    try
    {
      FileInputStream file = new FileInputStream("/media/anta/38B2CABDB2CA7F3E/Users/USER/Desktop/PHACK/file1.txt");   
      Scanner scanner = new Scanner(file);  
      
      while(scanner.hasNextLine())
      {
          test=scanner.nextLine();
        if(User.authentificate(test)==true){
             var= test;
            break;
        }
      }
      scanner.close();    
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
   return var;
    }
}
    