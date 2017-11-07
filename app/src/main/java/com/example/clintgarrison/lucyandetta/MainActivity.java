package com.example.clintgarrison.lucyandetta;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ImageView lucy = (ImageView) findViewById(R.id.lucy);
        lucy.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view){
               Intent launchLucy = new Intent(MainActivity.this, LucyActivity.class);
               MainActivity.this.startActivity(launchLucy);
           }
        });

        ImageView etta = (ImageView) findViewById(R.id.etta);
        etta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent launchEta = new Intent(MainActivity.this, EttaActivity.class);
                MainActivity.this.startActivity(launchEta);
            }
        });

        ImageButton dogParkButton = (ImageButton) findViewById(R.id.dogParkButton);
        dogParkButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent dogPark = new Intent(MainActivity.this, DogParkMapsActivity.class);
                MainActivity.this.startActivity(dogPark);
            }
        });
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

        return super.onOptionsItemSelected(item);
    }
}
