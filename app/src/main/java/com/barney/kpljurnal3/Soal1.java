package com.barney.kpljurnal3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Soal1 extends AppCompatActivity {

    public static ArrayList<KodeBuah> list = new ArrayList<KodeBuah>();

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal1);

        setupData();
        listView = findViewById(R.id.ListView);

        ListAdapter adapter = new ListAdapter(getApplicationContext(), 0, list);
        listView.setAdapter(adapter);
    }

    private void setupData()
    {
        KodeBuah q1 = new KodeBuah("Apel", "A00");
        list.add(q1);

        KodeBuah q2 = new KodeBuah("Aprikot", "B00");
        list.add(q2);

        KodeBuah q3 = new KodeBuah("Alpukat", "C00");
        list.add(q3);

        KodeBuah q4 = new KodeBuah("Pisang", "D00");
        list.add(q4);

        KodeBuah q5 = new KodeBuah("Paprika", "E00");
        list.add(q5);

        KodeBuah q6 = new KodeBuah("BlackBerry", "F00");
        list.add(q6);

        KodeBuah q7 = new KodeBuah("Ceri", "H00");
        list.add(q7);

        KodeBuah q8 = new KodeBuah("Kelapa", "I00");
        list.add(q8);

        KodeBuah q9 = new KodeBuah("Jagung", "J00");
        list.add(q9);

        KodeBuah q10 = new KodeBuah("Kurma", "K00");
        list.add(q10);

        KodeBuah q11 = new KodeBuah("Durian", "L00");
        list.add(q11);

        KodeBuah q12 = new KodeBuah("Anggur", "M00");
        list.add(q12);

        KodeBuah q13 = new KodeBuah("Melon", "N00");
        list.add(q13);

        KodeBuah q14 = new KodeBuah("Semangka", "O00");
        list.add(q14);

    }

}