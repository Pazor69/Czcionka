package com.example.czcionka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        Button button;
        TextView tekst;
        TextView textView;
        TextView rozmiar;
        SeekBar seekBar;
        int jd=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        button=findViewById(R.id.button);
        tekst=findViewById(R.id.tekst);
        textView=findViewById(R.id.textView);
        rozmiar= findViewById(R.id.rozmiar);
        seekBar= findViewById(R.id.seekBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

        
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,boolean fromUser) {
                int i=(int)seekBar.getProgress();

                String aaaaaa="Rozmiar: "+i;
                rozmiar.setText(aaaaaa);

                tekst.setTextSize(1,i);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        button.setOnClickListener(v -> {
            jd++;
            String[] jabols={"Dzień Dobry","Good Morning", "Buenos Dias"};
            if(jd>jabols.length){
                jd=0;
            }
            tekst.setText(jabols[jd]);
        });
    }


}