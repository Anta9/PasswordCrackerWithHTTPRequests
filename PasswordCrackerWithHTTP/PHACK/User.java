// import java.util.*;
import java.io.BufferedReader;
// import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.net.HttpURLConnection;
// import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JOptionPane;
public class User{
    
    static String password;
    static String login;
    public User(String login, String password)
    {
        
    }
    static public String getUser()
    {
        String username = JOptionPane.showInputDialog(null,
        "Quelle est le nom d'utilisateur?"," Récupération du login",  JOptionPane.INFORMATION_MESSAGE);
        return username;
    }
   static  String username =getUser();
    static public  Boolean authentificate(String testpassword) throws IOException
    {
        
        URL url = new URL("http://localhost/login_page/verification.php?username="+username+"&password="+testpassword);
URLConnection conn = url.openConnection(); 
BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
String line;
boolean v=false ;
while ((line = br.readLine()) != null) {
    //System.out.println(line);
    if(line.contains("Principale")){
        //System.out.println(line);
        v=true;
    }

} br.close(); 
return v; 
}
        
   
    

}
