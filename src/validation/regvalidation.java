/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Asus
 */
public class regvalidation {
    private Pattern name,email,phno,password;
    private Matcher matcher;
    String email_patter="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,6}$";
    String phone_pattern="^[0-9]{10}";
    String pass_pattern="^[a-zA-Z0-9]{5,20}";
    String name_pattern="^[a-zA-z ]{3,30}$";
    
    public regvalidation(){
         name=Pattern.compile(name_pattern);
         email=Pattern.compile(email_patter);
         phno=Pattern.compile(phone_pattern);
         password=Pattern.compile(pass_pattern);
    }
    public  boolean namevalidation(String user_name){
        matcher=name.matcher(user_name);
        return matcher.matches();
    }
    public boolean emailvalidation(String user_email){
          matcher=email.matcher(user_email);
        return matcher.matches();
    }
     public boolean phonevalidation(String user_phone){
          matcher=phno.matcher(user_phone);
        return matcher.matches();
    }
      public boolean passwordvalidation(String pass_val){
          matcher=password.matcher(pass_val);
        return matcher.matches();
    }
}
