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
public class Electures_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lectures_main);



        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button button_back = (Button)findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // команда для кноки
                //начало конструкции
                try{
                    Intent intent = new Intent(Electures_main.this, MainActivity.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
                //конец конструкции
            }
        });


        //кнопка для перехода на 1 уровень - начало
        TextView lekcii1 = (TextView)findViewById(R.id.lectures1);
        lekcii1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Electures_main.this, Electures1.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        //кнопка для перехода на 1 уровень - конец

        //кнопка для перехода на 2 уровень - начало
        TextView lectures2 = (TextView)findViewById(R.id.lectures2);
        lectures2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Electures_main.this, Electures2.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        //кнопка для перехода на 2 уровень - конец


        //кнопка для перехода на 3 уровень - начало
        TextView lectures3 = (TextView)findViewById(R.id.lectures3);
        lectures3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Electures_main.this, Electures3.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        //кнопка для перехода на 3 уровень - конец

        //кнопка для перехода на 4 уровень - начало
        TextView lectures4 = (TextView)findViewById(R.id.lectures4);
        lectures4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Electures_main.this, Electures4.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        //кнопка для перехода на 4 уровень - конец

        //кнопка для перехода на 5 уровень - начало
        TextView lectures5 = (TextView)findViewById(R.id.lectures5);
        lectures5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Electures_main.this, Electures5.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        //кнопка для перехода на 5 уровень - конец

        //кнопка для перехода на 6 уровень - начало
        TextView lectures6 = (TextView)findViewById(R.id.lectures6);
        lectures6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Electures_main.this, Electures6.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        //кнопка для перехода на 6 уровень - конец

        //кнопка для перехода на 7 уровень - начало
        TextView lectures7 = (TextView)findViewById(R.id.lectures7);
        lectures7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Electures_main.this, Electures7.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        //кнопка для перехода на 7 уровень - конец

        //кнопка для перехода на 8 уровень - начало
        TextView lectures8 = (TextView)findViewById(R.id.lectures8);
        lectures8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Electures_main.this, Electures8.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        //кнопка для перехода на 8 уровень - конец

        //кнопка для перехода на 9 уровень - начало
        TextView lectures9 = (TextView)findViewById(R.id.lectures9);
        lectures9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Electures_main.this, Electures9.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        //кнопка для перехода на 9 уровень - конец

        //кнопка для перехода на 10 уровень - начало
        TextView lectures10 = (TextView)findViewById(R.id.lectures10);
        lectures10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Electures_main.this, Electures10.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        //кнопка для перехода на 10 уровень - конец

        //кнопка для перехода на 11 уровень - начало
        TextView lectures11 = (TextView)findViewById(R.id.lectures11);
        lectures11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Electures_main.this, Electures11.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        //кнопка для перехода на 11 уровень - конец

    }
    //системная кнопка "назад" - начало
    @Override
    public void onBackPressed(){
        try{
            Intent intent = new Intent(Electures_main.this, MainActivity.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }
    //системная кнопка "назад" - конец
}
