package tn.essat.fin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class act1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act1);

        Toast.makeText(getApplicationContext(),"Créer votre compte en toute sécurité et l'utiliser aprés pour se connecter ", Toast.LENGTH_LONG).show();

        Button b23 = findViewById(R.id.b23);
        b23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText e1 = findViewById(R.id.e1);
                String nom = e1.getText().toString();

                EditText e2 = findViewById(R.id.e2);
                String prenom = e2.getText().toString();

                EditText e4 = findViewById(R.id.e4);
                String mdp = e4.getText().toString();

                EditText e5 = findViewById(R.id.e5);
                String mail = e5.getText().toString();

                EditText e6 = findViewById(R.id.e6);
                String ecole = e6.getText().toString();

                EditText e7 = findViewById(R.id.e7);
                String AU = e7.getText().toString();

                ContentValues val = new ContentValues();
                val.put("nom", nom);
                val.put("prenom", prenom);
                val.put("mdp", mdp);
                val.put("mail", mail);
                val.put("ecole", ecole);
                val.put("annee universitaire", AU);
                DatabaseHelper dbHelper = new DatabaseHelper(getApplicationContext());
                SQLiteDatabase db = dbHelper.getWritableDatabase();

                ContentValues values = new ContentValues();
                values.put("nom", nom);
                values.put("prenom", prenom);
                values.put("motdepasse", mdp);
                values.put("Email", mail);
                values.put("ecole", ecole);
                values.put("annee_universitaire", AU);

                long newRowId = db.insert("admin", null, values);

                if (newRowId == -1) {
                } else {
                }

                db.close();

            }
        });

        Button b12 = findViewById(R.id.b12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i5);
            }
        });
    }
}