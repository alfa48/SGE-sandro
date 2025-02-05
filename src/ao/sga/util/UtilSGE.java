/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sandrosge;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author man-tung
 */
public class UtilSGE {
    public static int loginUtilAluno(JTextField username, JTextField password, ArrayList<Aluno> alunos)
    {
           if(username != null && password != null)
           {
               alunos.forEach((a) -> {
                                 
                  if(a.getUsername().equals(username.getText().toString()) &&
                          a.getPassword().equals(password.getText().toString()))
                      return 1;
               });
           }
           return 0;
    }
    
    public static int loginUtilProf(JTextField username, JTextField password, ArrayList<Prof> profs)
    {
        
           if(username != null && password != null && profs != null)
           {
               profs.forEach((a) -> {
                                 
                  if(a.getUsername().equals(username.getText().toString()) &&
                          a.getPassword().equals(password.getText().toString()))
                      return 1;
               });
           }
           return 0;
    }
    
    public static int loginUtilAdmin(JTextField username, JTextField password, ArrayList<Admin> admins)
    {
           if(username != null && password != null)
           {
               admins.forEach((a) -> {
                                 
                  if(a.getUsername().equals(username.getText().toString()) &&
                          a.getPassword().equals(password.getText().toString()))
                      return 1;
               });
           }
           return 0;
    }
}
