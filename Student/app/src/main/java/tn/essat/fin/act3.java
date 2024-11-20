package tn.essat.fin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class act3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act3);
        Toast.makeText(getApplicationContext(),"Découvrir mieux l'application", Toast.LENGTH_LONG).show();

        Button b44 = findViewById(R.id.b44);
        b44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i4);
            }
        });
    }}
