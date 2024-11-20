package tn.essat.fin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ajouter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ajouter);
        Toast.makeText(getApplicationContext(),"Ajouter un nouvel étudiant", Toast.LENGTH_LONG).show();

        Spinner s1=findViewById(R.id.s1);
        String[] items={"Cycle préparatoire 1 INFO",
                "Cycle préparatoire 2 INFO",
                "Cycle ingénieur 1 INFO",
                "Cycle ingénieur 2 INFO",
                "Cycle ingénieur 3 INFO",
                "Licence" };
ArrayAdapter<String>adp=new ArrayAdapter<>(this,android.R.layout.simple_gallery_item,items);
s1.setAdapter(adp);
s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String spin=s1.getItemAtPosition(position).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
});
        Button b22=findViewById(R.id.b22);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e2 = findViewById(R.id.e2);
                String nom = e2.getText().toString();

                EditText e3 = findViewById(R.id.e3);
                String prenom = e3.getText().toString();

                EditText e6 = findViewById(R.id.e6);
                String nomparent = e6.getText().toString();

                EditText e8 = findViewById(R.id.e8);
                String numparent = e8.getText().toString();

                EditText e9 = findViewById(R.id.e9);
                String note = e9.getText().toString();

                Spinner s1 = findViewById(R.id.s1);
                String filiere = s1.getSelectedItem().toString();

                Intent intent = new Intent(getApplicationContext(), stockajout.class);
                intent.putExtra("nom", nom);
                intent.putExtra("prenom", prenom);
                intent.putExtra("filiere", filiere);
                intent.putExtra("nomParent", nomparent);
                intent.putExtra("numParent", numparent);
                intent.putExtra("note", note);
                startActivity(intent);
                DatabaseHelper dbHelper = new DatabaseHelper(getApplicationContext());
                SQLiteDatabase db = dbHelper.getWritableDatabase();

                ContentValues values = new ContentValues();
                values.put("nom", nom);
                values.put("prenom", prenom);
                values.put("filiere", filiere);
                values.put("nomp", nomparent);
                values.put("num", numparent);
                values.put("note", note);

                long newRowId = db.insert("etudiant", null, values);

                if (newRowId == -1) {
                    // Gestion de l'erreur d'insertion
                } else {
                    // Succès de l'insertion
                }

// Fermeture de la base de données
                db.close();

            }
        });



        Button buttonRechercher = findViewById(R.id.buttonRechercher);
        buttonRechercher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextSearch = findViewById(R.id.editTextSearch);
                String searchTerm = editTextSearch.getText().toString().trim();
                DatabaseHelper dbHelper = new DatabaseHelper(getApplicationContext());
                List<Etudiant> resultatRecherche = dbHelper.rechercherEtudiants(searchTerm);

                ArrayAdapter<Etudiant> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_gallery_item, resultatRecherche);

                ListView listViewResultat = findViewById(R.id.listViewResultat);

                listViewResultat.setAdapter(adapter);
            }
        });


        Button b12=findViewById(R.id.b12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(getApplicationContext(), act2.class);
                startActivity(k);
            }
        });
    }
}