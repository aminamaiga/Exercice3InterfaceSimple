package com.example.exercice3interfacesimple;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.resources.TextAppearance;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    TextView tvNom, tvPrenom, tvDomaine, tvAge, tvTelephone, tvTitre;
    EditText edNom, edPrenom, edDomaine, edAge, edTelephone;
    Button valider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //A décommenter pour visualiser la vue xml
        //  setContentView(R.layout.activity_main);

        linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        tvTitre = new TextView(this);
        tvTitre.setTextAppearance(this, android.R.style.TextAppearance_Large);
        tvNom = new TextView(this);
        tvNom.setTextAppearance(this, android.R.style.TextAppearance_Large);
        tvPrenom = new TextView(this);
        tvPrenom.setTextAppearance(this, android.R.style.TextAppearance_Large);
        tvDomaine = new TextView(this);
        tvDomaine.setTextAppearance(this, android.R.style.TextAppearance_Large);
        tvAge = new TextView(this);
        tvAge.setTextAppearance(this, android.R.style.TextAppearance_Large);
        tvTelephone = new TextView(this);
        tvTelephone.setTextAppearance(this, android.R.style.TextAppearance_Large);
        valider = new Button(this);

        edNom = new EditText(this);
        edPrenom = new EditText(this);
        edDomaine = new EditText(this);
        edAge = new EditText(this);
        edTelephone = new EditText(this);

        edNom.setHint(R.string.votre_nom);
        edPrenom.setHint(R.string.votre_prenom);
        edAge.setHint(R.string.votre_age);
        edDomaine.setHint(R.string.domaine_compet);
        edTelephone.setHint(R.string.telephone);

        tvTitre.setText(R.string.titre2);
        tvNom.setText(R.string.nom);
        tvPrenom.setText(R.string.prenom);
        tvAge.setText(R.string.age);
        tvDomaine.setText(R.string.domaine_comp);
        tvTelephone.setText(R.string.telephone);
        valider.setText(R.string.valider);

        linearLayout.addView(tvTitre);
        linearLayout.addView(tvNom);
        linearLayout.addView(edNom);
        linearLayout.addView(tvPrenom);
        linearLayout.addView(edPrenom);
        linearLayout.addView(tvAge);
        linearLayout.addView(edAge);
        linearLayout.addView(tvDomaine);
        linearLayout.addView(edDomaine);
        linearLayout.addView(tvTelephone);
        linearLayout.addView(edTelephone);
        linearLayout.addView(valider);
        setContentView(linearLayout);

    }
}