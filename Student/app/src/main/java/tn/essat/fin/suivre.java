package tn.essat.fin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class suivre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suivre);
        Toast.makeText(getApplicationContext(),"Stocker et suivre les notes", Toast.LENGTH_LONG).show();

     Button b3=findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent k=new Intent(getApplicationContext(), act2.class);
            startActivity(k);
        }
    });
}}