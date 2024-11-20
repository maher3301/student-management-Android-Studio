package tn.essat.fin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class EtudiantAdapter extends BaseAdapter {
    private Context context;
    private  List<Etudiant> liste;

    public EtudiantAdapter(Context context , List<Etudiant> liste) {
        this.context = context;
        this. liste=liste;
    }

    @Override
    public int getCount() {
        return liste.size();
    }

    @Override
    public Object getItem(int i) {
        return liste.get(i);
    }

    @Override
    public long getItemId(int i) {
        return liste.get(i).getId();
    }

    @Override
    public View getView(int i, View View , ViewGroup parent) {
        if (View == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View = inflater.inflate(R.layout.list_item_etudiant, parent, false);
        }

        Etudiant etd=liste.get(i);
        TextView txt1=View.findViewById(R.id.txt1);
        TextView txt2=View.findViewById(R.id.txt2);
        TextView txt3=View.findViewById(R.id.txt3);
        TextView txt4=View.findViewById(R.id.txt4);
        TextView txt5=View.findViewById(R.id.txt5);
        TextView txt6=View.findViewById(R.id.txt6);

        //ImageView img=View.findViewById(R.id.im1);


        txt1.setText(etd.getNom());
        txt2.setText(etd.getPrenom());
        txt3.setText(etd.getFiliere());
        txt4.setText(etd.getNomParent());
        txt5.setText(etd.getNumParent());
        txt6.setText(etd.getNote());


        //img.setImageResource(R.drawable.avatar1);


        return View;
    }
}
