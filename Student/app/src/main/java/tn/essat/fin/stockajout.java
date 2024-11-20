package tn.essat.fin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;





public class stockajout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stockajout);

        Intent intent = getIntent();
        String nom = intent.getStringExtra("nom");
        String prenom = intent.getStringExtra("prenom");
        String filiere = intent.getStringExtra("filiere");
        String nomParent = intent.getStringExtra("nomParent");
        String numParent = intent.getStringExtra("numParent");
        String note = intent.getStringExtra("note");

        TextView textViewNom = findViewById(R.id.textViewNom);
        TextView textViewPrenom = findViewById(R.id.textViewPrenom);
        TextView textViewFiliere = findViewById(R.id.textViewFiliere);
        TextView textViewNomParent = findViewById(R.id.textViewNomParent);
        TextView textViewNumParent = findViewById(R.id.textViewNumParent);
        TextView textViewNote = findViewById(R.id.textViewNote);

        textViewNom.setText("Nom : " + nom);
        textViewPrenom.setText("Prénom : " + prenom);
        textViewFiliere.setText("Filière : " + filiere);
        textViewNomParent.setText("Nom du parent : " + nomParent);
        textViewNumParent.setText("Numéro du parent : " + numParent);
        textViewNote.setText("Note : " + note);
        Button bibi=findViewById(R.id.bibi);
        bibi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent k=new Intent(getApplicationContext(), ajouter.class);
            startActivity(k);
        }
    }); }}

