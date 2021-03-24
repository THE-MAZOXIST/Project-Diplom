package com.mazaxist.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//Direct by Birulia Maksim, supervisor - Gorbadei Olga [BSAC]
public class Alabs_Levels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_main);



        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button button_back = (Button)findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // команда для кноки
                //начало конструкции
                try{
                    Intent intent = new Intent(Alabs_Levels.this, MainActivity.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
                //конец конструкции
            }
        });


        //кнопка для перехода на первый уровень - начало
        TextView lab1 = (TextView)findViewById(R.id.lab1);
        lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Alabs_Levels.this, Alab1_1.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        //кнопка для перехода на первый уровень - конец


    }
    //системная кнопка "назад" - начало
    @Override
    public void onBackPressed(){
        try{
            Intent intent = new Intent(Alabs_Levels.this, MainActivity.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }
    //системная кнопка "назад" - конец
}
