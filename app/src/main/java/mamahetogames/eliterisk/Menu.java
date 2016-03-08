package mamahetogames.eliterisk;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button buttonHighScores = (Button) findViewById(R.id.buttonHighScores);
        buttonHighScores.setOnClickListener(this);
        Button buttonSettings = (Button) findViewById(R.id.buttonSettings);
        buttonSettings.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.buttonHighScores:
                i = new Intent(this, HighScores.class);
                startActivity(i);
                break;
            case R.id.buttonSettings:
                i = new Intent(this, Settings.class);
                startActivity(i);
                break;
        }
    }

}