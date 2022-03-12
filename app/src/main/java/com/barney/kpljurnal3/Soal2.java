package com.barney.kpljurnal3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Soal2 extends AppCompatActivity {

    public enum Posisi {
        Jongkok, Berdiri, Tengkurap, Terbang
    }

    public enum Tombol {
        TombolW, TombolS, TombolX
    }

    public Posisi posisiSekarang = Posisi.Jongkok;

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal2);

        Button w = findViewById(R.id.mio1);
        Button s = findViewById(R.id.mio2);
        Button x = findViewById(R.id.mio3);
        txt = findViewById(R.id.txtState);

        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pencetTombol(Tombol.TombolW);

            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pencetTombol(Tombol.TombolS);

            }
        });

        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pencetTombol(Tombol.TombolX);

            }
        });

    }

    public void pencetTombol(Tombol tombol) {
        String output = "";
        Posisi posisiSelanjutnya = getPosisiSelanjutnya(posisiSekarang, tombol);

        output += ("menekan "+tombol + "\n");

        output += ("Posisi saat ini : "+posisiSelanjutnya + "\n");

        this.posisiSekarang = posisiSelanjutnya;

        if(this.posisiSekarang == Posisi.Berdiri) {
            output += ("posisi standby" + "\n");
        } else if(this.posisiSekarang == Posisi.Tengkurap) {
            output += ("posisi istirahat"+ "\n");
        }

        txt.setText(output);
    }

    public Posisi getPosisiSelanjutnya(Posisi awal, Tombol tombol) {
        Posisi posisiSelanjutnya = awal;

        for(int i = 0; i < transisi.length; i++) {
            if(transisi[i].posisiAwal == awal && transisi[i].tombol == tombol) {
                posisiSelanjutnya = transisi[i].posisiAkhir;
            }
        }

        return posisiSelanjutnya;
    }

    public class Transisi {
        public Posisi posisiAwal, posisiAkhir;
        public Tombol tombol;

        public Transisi(Posisi posisiAwal, Posisi posisiAkhir, Tombol tombol) {
            this.posisiAwal = posisiAwal;
            this.posisiAkhir = posisiAkhir;
            this.tombol = tombol;
        }
    }

    Transisi[] transisi =  {
            new Transisi(Posisi.Jongkok, Posisi.Berdiri, Tombol.TombolW),
            new Transisi(Posisi.Jongkok, Posisi.Tengkurap, Tombol.TombolS),
            new Transisi(Posisi.Berdiri, Posisi.Jongkok, Tombol.TombolS),
            new Transisi(Posisi.Berdiri, Posisi.Terbang, Tombol.TombolW),
            new Transisi(Posisi.Terbang, Posisi.Berdiri, Tombol.TombolS),
            new Transisi(Posisi.Terbang, Posisi.Jongkok, Tombol.TombolX),
            new Transisi(Posisi.Tengkurap, Posisi.Jongkok, Tombol.TombolW)
    };

}