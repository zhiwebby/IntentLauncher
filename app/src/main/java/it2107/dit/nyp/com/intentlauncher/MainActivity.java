package it2107.dit.nyp.com.intentlauncher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton btnCamera, btnPlayer, btnDialer, btnSms;

    ImageView ivThumbnail;
    final int REQUEST_IMAGE_CAPTURE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCamera = (ImageButton)findViewById(R.id.btnCamera);
        btnDialer = (ImageButton)findViewById(R.id.btnDialer);
        btnPlayer = (ImageButton)findViewById(R.id.btnPlayer);
        btnSms = (ImageButton)findViewById(R.id.btnSms);
        ivThumbnail = (ImageView)findViewById(R.id.ivThumbnail);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        else
        {
            if(id == R.id.action_about)
            {
                Intent myIntent = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(myIntent);
            }
        }

        return super.onOptionsItemSelected(item);
    }
}
