
import java.io.IOException;
import java.util.*;

import javax.swing.JOptionPane;
public class BruteForce extends CrackPassword{
    static List<String> caracter = new ArrayList<String> (Arrays.asList("a","b","c","d","e","f",
    "g","h","i","j","k","l","m","n","o","p",
    "q","r","s","t","u","v","w","x","y",
    "z","0","1","2","3","4","5","6","7","8","9","@","[","!",
     "#","(",")","*","/",":",";","=","|","~",""));	
     

    public void findPassword()
    {
        long startTime = System.currentTimeMillis();
        String passw =new String("");
        loops :for(int i = 0 ; i < caracter.size(); i++)
        {
                 for(int j = 0 ; j < caracter.size(); j++)

                    {
                            for(int k= 0 ; k <  caracter.size(); k++)
                            {
                                for(int l = 0 ; l < caracter.size(); l++)
                                {
                                    for(int m = 0 ; m < caracter.size(); m++)
                                    {
                                                passw = caracter.get(i) + caracter.get(j)  + caracter.get(k) + caracter.get(l) + caracter.get(m);
                                                    
                                                System.out.println(passw) ; //ralentit la recherche 
                                                
                                                try {
                                                    if (User.authentificate(passw)==true)
                                                    {  
                                                        break loops ;
                                                    }
                                                } catch (IOException e) {
                                                   
                                                    e.printStackTrace();
                                                }
                                                
                                    }

                                
                                    
                                }
                                
                            
                            }
                        
                    
                    } 
            
             
       }
       long endTime = System.currentTimeMillis();
       
       JOptionPane.showMessageDialog(null, "Votre mot de passe est : "+passw,"Password Found", JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showMessageDialog(null,GetTime.duration(endTime, startTime),"Temps de recherche",JOptionPane.INFORMATION_MESSAGE );
       
       
    }    

}



