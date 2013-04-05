package library;

import java.util.ArrayList;
import java.util.List;
 
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;
 
import android.content.Context;
 
public class UserFunctions {
 
   
 
    // Testing in localhost using wamp or xampp
    // use http://10.0.2.2/ to connect to your localhost ie http://localhost/
    private static String loginURL = "http://10.0.2.2/ah_login_api/";
    private static String registerURL = "http://10.0.2.2/ah_login_api/";
 
    private static String login_tag = "login";
    private static String register_tag = "register";
 
    // constructor
    public UserFunctions(){
   
    }

	public JSONObject registerUser(String name, String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public JSONObject loginUser(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}
 
    /**
     * function make Login Request
     * @param email
     * @param password
     * */
   
       
        // return json
        // Log.e("JSON", json.toString());
       
    
 
    /**
     * function make Login Request
     * @param name
     * @param email
     * @param password
     * */
 
 
    /**
     * Function get Login status
     * */
    
            // user logged in
         
    }
 
    /**
     * Function to logout user
     * Reset Database
     * */
   
    