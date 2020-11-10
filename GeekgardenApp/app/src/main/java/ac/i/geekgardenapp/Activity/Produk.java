package ac.i.geekgardenapp.Activity;

import ac.i.geekgardenapp.R;
import ac.i.geekgardenapp.produk.ALFRED;
import ac.i.geekgardenapp.produk.DOM;
import ac.i.geekgardenapp.produk.GES;
import ac.i.geekgardenapp.produk.UDIO;
import ac.i.geekgardenapp.produk.eGOV;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Produk extends AppCompatActivity {

    CardView dom , ges , geekpos , udio , nomand , medstore , alferd , egov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        dom = findViewById(R.id.DOM);
        ges = findViewById(R.id.GES);
        geekpos = findViewById(R.id.Geekpos);
        udio = findViewById(R.id.UDIO);
        nomand = findViewById(R.id.Nomand);
        medstore = findViewById(R.id.MedStore);
        alferd = findViewById(R.id.alferd);
        egov = findViewById(R.id.eGOV);

        ges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Produk.this, GES.class);
                startActivity(i);
            }
        });


        udio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Produk.this, UDIO.class);
                startActivity(i);
            }
        });

        dom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Produk.this, DOM.class);
                startActivity(i);
            }
        });

        alferd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Produk.this, ALFRED.class);
                startActivity(i);
            }
        });

        egov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Produk.this, eGOV.class);
                startActivity(i);
            }
        });
    }
}