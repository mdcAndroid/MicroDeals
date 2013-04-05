package edu.mdc.entec.microdeals;

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
 
public class Registration extends Activity {
    Button btnRegister;
    Button btnLinkToLogin;
    EditText inputFullName;
    EditText inputEmail;
    EditText inputPassword;
    TextView registerErrorMsg;
 
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
        setContentView(R.layout.register);
 
        // Importing all assets like buttons, text fields
        inputFullName = (EditText) findViewById(R.id.registerName);
        inputEmail = (EditText) findViewById(R.id.registerEmail);
        inputPassword = (EditText) findViewById(R.id.registerPassword);
        btnRegister = (Button) findViewById(R.id.btnRegister);
        btnLinkToLogin = (Button) findViewById(R.id.btnLinkToLoginScreen);
        registerErrorMsg = (TextView) findViewById(R.id.register_error);
 
        // Register Button Click event
        btnRegister.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	//Checking for empty field
           	 if ((inputFullName.getText().length()==0))
         	{
         		Toast.makeText(Registration.this, "Please enter your Name", Toast.LENGTH_SHORT).show();
         		return;
         	}
           	if ((inputEmail.getText().length()==0))
         	{
         		Toast.makeText(Registration.this, "Please enter your email", Toast.LENGTH_SHORT).show();
         		return;
         	}
           	if ((inputPassword.getText().length()==0))
         	{
         		Toast.makeText(Registration.this, "Please enter your password", Toast.LENGTH_SHORT).show();
         		return;
         	}
            	
            	//Saving the information if it pass the IF
                String name = inputFullName.getText().toString();
                String email = inputEmail.getText().toString();
                String password = inputPassword.getText().toString();
              
 
        };
    });

    
    // Link to Register Screen
        btnLinkToLogin.setOnClickListener(new View.OnClickListener() {

        public void onClick(View view) {
            Intent i = new Intent(getApplicationContext(),
                    Login.class);
            startActivity(i);
            finish();
        }
    });
}
}
    
    
    
	