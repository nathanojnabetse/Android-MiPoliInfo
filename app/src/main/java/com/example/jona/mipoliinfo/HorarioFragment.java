package com.example.jona.mipoliinfo;


import android.os.Bundle;
import android.view.View;


import android.view.LayoutInflater;

import android.view.ViewGroup;


import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import android.widget.AdapterView.OnItemSelectedListener;


public class HorarioFragment extends android.app.Fragment {

    private Spinner spinner;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_horario, container, false);

        Spinner spinner = (Spinner) v.findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.dias));
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                TextView horario1 = (TextView) getView().findViewById(R.id.textView1);//referencia 7am
                TextView horario2 = (TextView) getView().findViewById(R.id.textView2);
                TextView horario3 = (TextView) getView().findViewById(R.id.textView3);
                TextView horario4 = (TextView) getView().findViewById(R.id.textView4);
                TextView horario5 = (TextView) getView().findViewById(R.id.textView5);
                TextView horario6 = (TextView) getView().findViewById(R.id.textView6);
                TextView horario7 = (TextView) getView().findViewById(R.id.textView7);
                TextView horario8 = (TextView) getView().findViewById(R.id.textView8);
                TextView horario9 = (TextView) getView().findViewById(R.id.textView9);
                TextView horario10 = (TextView) getView().findViewById(R.id.textView10);
                TextView horario11 = (TextView) getView().findViewById(R.id.textView11);
                TextView horario12 = (TextView) getView().findViewById(R.id.textView12);

                Spinner dia = (Spinner) getView().findViewById(R.id.spinner2);//referencvia spinner
                String diaSel = String.valueOf(dia.getSelectedItem());


                if(diaSel.equals("Lunes")){
                    horario1.setText("7:00 - 8:00 | - - - - - -");
                    horario2.setText("8:00 - 9:00 | - - - - - -");
                    horario3.setText("9:00 - 10:00 | Laboratorio de sistemas microprocesados (GR1) ELE-E303B");
                    horario4.setText("10:00 - 11:00 | Laboratorio de sistemas microprocesados (GR1) ELE-E303B");
                    horario5.setText("11:00 - 12:00 | - - - - - -");
                    horario6.setText("12:00 - 13:00 | Redes TCP/IP (GR2) ELE-E206");
                    horario7.setText("13:00 - 14:00 | - Almuerzo -");
                    horario8.setText("14:00 - 15:00 | Seminario IB (GR1) ELE-E307");
                    horario9.setText("15:00 - 16:00 | Seminario IB (GR1) ELE-E307");
                    horario10.setText("16:00 - 17:00 | - - - - - -");
                    horario11.setText("17:00 - 18:00 | - - - - - -");
                    horario12.setText("18:00 - 19:00 | - - - - - -");
                } else  if(diaSel.equals("Martes")){
                    horario1.setText("7:00 - 8:00 | Sistemas microprocesados (GR4) Q/E-306");
                    horario2.setText("8:00 - 9:00 | Sistemas microprocesados (GR4) Q/E-306");
                    horario3.setText("9:00 - 10:00 | Redes de área local (GR1) ELE-E004");
                    horario4.setText("10:00 - 11:00 | Redes de área local (GR1) ELE-E004");
                    horario5.setText("11:00 - 12:00 | Redes TCP/IP (GR2) ELE-E206");
                    horario6.setText("12:00 - 13:00 | Redes TCP/IP (GR2) ELE-E206");
                    horario7.setText("13:00 - 14:00 | - Almuerzo -");
                    horario8.setText("14:00 - 15:00 | - - - - - -");
                    horario9.setText("15:00 - 16:00 | Laboratorio de redes de área local (GR1) ELE-E308");
                    horario10.setText("16:00 - 17:00 | Laboratorio de redes de área local (GR1) ELE-E308");
                    horario11.setText("17:00 - 18:00 | Sistemas de cableado estructurado (GR2) Q/E-402");
                    horario12.setText("18:00 - 19:00 | Sistemas de cableado estructurado (GR2) Q/E-402");
                } else  if(diaSel.equals("Miércoles")){
                    horario1.setText("7:00 - 8:00 | - - - - - -");
                    horario2.setText("8:00 - 9:00 | - - - - - -");
                    horario3.setText("9:00 - 10:00 | - - - - - -");
                    horario4.setText("10:00 - 11:00 | - - - - - -");
                    horario5.setText("11:00 - 12:00 | - - - - - -");
                    horario6.setText("12:00 - 13:00 | - - - - - -");
                    horario7.setText("13:00 - 14:00 | - Almuerzo -");
                    horario8.setText("14:00 - 15:00 | Ingeniería Financiera (GR3) Q/E-402");
                    horario9.setText("15:00 - 16:00 | Ingeniería Financiera (GR3) Q/E-402");
                    horario10.setText("16:00 - 17:00 | Ingeniería Financiera (GR3) Q/E-402");
                    horario11.setText("17:00 - 18:00 | Sistemas de cableado estructurado (GR2) Q/E-402");
                    horario12.setText("18:00 - 19:00 | - - - - - -");
                } else  if(diaSel.equals("Jueves")){
                    horario1.setText("7:00 - 8:00 | - - - - - -");
                    horario2.setText("8:00 - 9:00 | - - - - - -");
                    horario3.setText("9:00 - 10:00 | - - - - - -");
                    horario4.setText("10:00 - 11:00 | - - - - - -");
                    horario5.setText("11:00 - 12:00 | - - - - - -");
                    horario6.setText("12:00 - 13:00 | - - - - - -");
                    horario7.setText("13:00 - 14:00 | - Almuerzo -");
                    horario8.setText("14:00 - 15:00 | Ecología y medio ambiente (GR1) ELE-E004");
                    horario9.setText("15:00 - 16:00 | Ecología y medio ambiente (GR1) ELE-E004");
                    horario10.setText("16:00 - 17:00 | Ecología y medio ambiente (GR1) ELE-E004");
                    horario11.setText("17:00 - 18:00 | - - - - - -");
                    horario12.setText("18:00 - 19:00 | - - - - - -");
                } else  if(diaSel.equals("Viernes")){
                    horario1.setText("7:00 - 8:00 | - - - - - -");
                    horario2.setText("8:00 - 9:00 | Sistemas microprocesados (GR4) Q/E-306");
                    horario3.setText("9:00 - 10:00 | - - - - - -");
                    horario4.setText("10:00 - 11:00 | - - - - - -");
                    horario5.setText("11:00 - 12:00 | Redes de área local (GR1) ELE-E004");
                    horario6.setText("12:00 - 13:00 | Redes de área local (GR1) ELE-E004");
                    horario7.setText("13:00 - 14:00 | - Almuerzo -");
                    horario8.setText("14:00 - 15:00 | Laboratorio de redes TCP/IP (GR4) Q/E-601A");
                    horario9.setText("15:00 - 16:00 | Laboratorio de redes TCP/IP (GR4) Q/E-601A");
                    horario10.setText("16:00 - 17:00 | - - - - - -");
                    horario11.setText("17:00 - 18:00 | - - - - - -");
                    horario12.setText("18:00 - 19:00 | - - - - - -");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        return v;

    }

}
