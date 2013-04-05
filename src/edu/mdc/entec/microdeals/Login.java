package edu.mdc.entec.microdeals;

import java.util.HashMap;

import library.UserFunctions;
 
import org.json.JSONException;
import org.json.JSONObject;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

 
public class Login extends Activity {
    Button btnLogin;
    Button btnLinkToRegister;
    EditText inputEmail;
    EditText inputPassword;
    TextView loginErrorMsg;
 
    // JSON Response node names
    private static String KEY_SUCCESS = "success";
    private static String KEY_ERROR = "error";
    private static String KEY_ERROR_MSG = "error_msg";
    private static String KEY_UID = "uid";
    private static String KEY_NAME = "name";
    private static String KEY_EMAIL = "email";
    private static String KEY_CREATED_AT = "created_at";
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
 
        // Importing all assets like buttons, text fields
        inputEmail = (EditText) findViewById(R.id.loginEmail);
        inputPassword = (EditText) findViewById(R.id.loginPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLinkToRegister = (Button) findViewById(R.id.btnLinkToRegisterScreen);
        loginErrorMsg = (TextView) findViewById(R.id.login_error);
        
        //Checking for empty text boxes
       
        
        // Login button Click Event
        btnLogin.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View view) {
            	//Checking for empty email text boxes
            
            	 if ((inputEmail.getText().length()==0))
            	{
            		Toast.makeText(Login.this, "Please enter an email", Toast.LENGTH_SHORT).show();
            		return;
            	}
            		//Checking for empty password text boxes
            	 if ((inputPassword.getText().length()==0))
            	{
            		Toast.makeText(Login.this, "Please enter a password", Toast.LENGTH_SHORT).show();
            		return;
            	}
            	
            	
            	//Program save email and password
                String email = inputEmail.getText().toString();                
                String password = inputPassword.getText().toString();
             
 //Connect with Log in Class for the server connection.
              
              }
        });
 
        // Link to Register Screen
        btnLinkToRegister.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),
                        Registration.class);
                startActivity(i);
                finish();
            }
        });
    }



}