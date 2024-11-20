package tn.essat.fin;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "essat2.db";
    private static final int DATABASE_VERSION = 1;

    // Constructeur
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableAdmin = "CREATE TABLE admin (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nom TEXT, prenom TEXT, motdepasse TEXT, Email TEXT, ecole TEXT, annee_universitaire TEXT)";
        db.execSQL(createTableAdmin);

        String createTableEtudiant = "CREATE TABLE etudiant (id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "nom TEXT, prenom TEXT, filiere TEXT, note INTEGER, nomParent TEXT, numeroParent INTEGER)";
        db.execSQL(createTableEtudiant);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 2) {
            db.execSQL("ALTER TABLE admin ADD COLUMN nouvelle_colonne TEXT");
        }
    }

    public List<Etudiant> rechercherEtudiants(String searchTerm) {
        List<Etudiant> resultatRecherche = new ArrayList<>();

        SQLiteDatabase db = this.getReadableDatabase();

        String query = "SELECT * FROM etudiant WHERE nom LIKE ? OR prenom LIKE ?";
        String[] selectionArgs = new String[]{"%" + searchTerm + "%", "%" + searchTerm + "%"};

        Cursor cursor = db.rawQuery(query, selectionArgs);

        if (cursor.moveToFirst()) {
            do {
                @SuppressLint("Range") int id = cursor.getInt(cursor.getColumnIndex("id"));
                @SuppressLint("Range") String nom = cursor.getString(cursor.getColumnIndex("nom"));
                @SuppressLint("Range") String prenom = cursor.getString(cursor.getColumnIndex("prenom"));
                @SuppressLint("Range") String filiere = cursor.getString(cursor.getColumnIndex("filiere"));
                @SuppressLint("Range") int note = cursor.getInt(cursor.getColumnIndex("note"));
                @SuppressLint("Range") String nomParent = cursor.getString(cursor.getColumnIndex("nomParent"));
                @SuppressLint("Range") int numeroParent = cursor.getInt(cursor.getColumnIndex("numeroParent"));

                Etudiant etudiant = new Etudiant(id, nom, prenom, filiere, nomParent, numeroParent, note);

                resultatRecherche.add(etudiant);
            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();

        return resultatRecherche;
    }

}
