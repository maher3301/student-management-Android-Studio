package tn.essat.fin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class actlog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actlog);


        EditText e2=findViewById(R.id.e2);
        String pass=e2.getText().toString();

        Toast.makeText(getApplicationContext(),"bonjour Admin ! Voulez vous accéder à votre compte", Toast.LENGTH_LONG).show();
        Button bos=findViewById(R.id.bos);
        bos.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent k=new Intent(getApplicationContext(), act2.class);
            startActivity(k);
        }


    });}}