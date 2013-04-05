package edu.mdc.entec.microdeals;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	//Locks screen orientation to vertical mode
	setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	
	Button btnFacebook = (Button) findViewById(R.id.btnFacebook);
	Button btnGoogle = (Button) findViewById(R.id.btnGoogle);
	Button btnMicroDealAccount = (Button) findViewById(R.id.btnExistingAccount);
	Button btnCreateAccount = (Button) findViewById(R.id.btnCreateAccount);
	
	
	//FaceBook Button
	btnFacebook.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			Toast.makeText(MainActivity.this, "FaceBook", Toast.LENGTH_SHORT).show();
		}
	});
	
	
	//Google Button
	btnGoogle.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			Toast.makeText(MainActivity.this, "Google", Toast.LENGTH_SHORT).show();
		}
	});
	
	
	//Existing Account Button
	btnMicroDealAccount.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			
			 Intent intent = new Intent(MainActivity.this, Login.class);
	            startActivity(intent);
	            
		}
	});
	
	
	//Create Account Button
	btnCreateAccount.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			
			 Intent intent = new Intent(MainActivity.this, Registration.class);
	            startActivity(intent);
	        
		}
	});
	
	
	}
}

