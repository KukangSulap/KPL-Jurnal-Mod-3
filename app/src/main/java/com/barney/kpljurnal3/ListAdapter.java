package com.barney.kpljurnal3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends ArrayAdapter<KodeBuah> {
   public ListAdapter(Context context, int resource, List<KodeBuah> list)
   {
      super(context,resource,list);
   }


   @Override
   public View getView(int position, View convertView, ViewGroup parent)
   {
      KodeBuah kodeBuah = getItem(position);

      if(convertView == null)
      {
         convertView = LayoutInflater.from(getContext()).inflate(R.layout.cell, parent, false);
      }
      TextView txtNama = convertView.findViewById(R.id.nama);
      TextView txtKodeBuah = convertView.findViewById(R.id.kode_buah);

      txtNama.setText(kodeBuah.getNama());
      txtKodeBuah.setText(kodeBuah.getKodeBuah());

      return convertView;
   }
}
