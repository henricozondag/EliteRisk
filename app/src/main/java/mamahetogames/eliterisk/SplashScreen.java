package mamahetogames.eliterisk;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Wacht 2500ms en ga door naar menu
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                Intent i;
                i = new Intent(SplashScreen.this, Menu.class);
                startActivity(i);
            }
        }, 2500);

    }


}