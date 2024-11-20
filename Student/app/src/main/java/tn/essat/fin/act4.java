package tn.essat.fin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class act4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act4);
        Toast.makeText(getApplicationContext(),"Il faut prendre en considération tout ce qu'est écrit dans cette page", Toast.LENGTH_LONG).show();

        Button b44=findViewById(R.id.b44);
    b44.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent h=new Intent(getApplicationContext(), MainActivity.class);
            startActivity(h);
        }
    });}
}