package edu.mdc.entec.microdeals;

import java.util.Timer;
import java.util.TimerTask;







import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;



public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_LEFT_ICON);
        setContentView(R.layout.activity_splash);
        //setFeatureDrawableResource(Window.FEATURE_LEFT_ICON,R.drawable.microdeallaunchicon );
        ImageView imgInterpolate=(ImageView)findViewById(R.id.imageView1);
        imgInterpolate.startAnimation(AnimationUtils.loadAnimation(this,R.anim.interpolate));

       TimerTask task= new TimerTask() {
       	public void run() {
       		startActivity (new Intent(Splash.this, MainActivity.class));
       	}
       
       };
       Timer opening=new Timer();
       opening.schedule(task,5000);
       
       
   }

    //@Override
   // public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
   //     getMenuInflater().inflate(R.menu.splash, menu);
    //    return true;
    //}
    
}
