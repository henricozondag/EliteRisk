package mamahetogames.eliterisk;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Sleep toevoegen
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Menu openen
        Intent i;
        i = new Intent(this, Menu.class);
        startActivity(i);

    }


}