package com.mazaxist.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//Direct by Birulia Maksim, supervisor - Gorbadei Olga [BSAC]
public class Level1_4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level1_4);

        //создаем переменную text_levels
        TextView text_levels = findViewById(R.id.text_levels);
        text_levels.setText(R.string.level1);                                   //установили текст

        final ImageView img_left = (ImageView)findViewById(R.id.img_left);
        //код который скругляет углы в левой картинке
        img_left.setClipToOutline(true);


        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);



// Здесь код, если EditText пуст

        Button btn_back = (Button)findViewById(R.id.button_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //обработка нажатия кнопки "назад" - начало
                try{
                    Intent intent = new Intent(Level1_4.this, Level1_3.class); //создали намерения для перехода к выбору уровня
                    startActivity(intent);                          //старт намерений
                    finish();                                      //закрыть этот класс
                    //вернуться назад к выбору уровя
                }catch (Exception e){
                    //здесь кода не будет
                }
                //обрабатываем нажатие кнопки "назад" - конец
            }
        });

        //работа с едит текстом и проверка



        //кнопка продолжить - начало
        Button btncontinuelevel1 = (Button)findViewById(R.id.btncontinuelevel1_4);

        btncontinuelevel1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                EditText editText = (EditText) findViewById(R.id.edittext_level1_4);
                if (editText.getText().toString().equals("private"))
                {
                try{
                    Intent intent = new Intent(Level1_4.this, Lekcii_Levels.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }}
            }
        });                                                   //кнопка продолжить - конец



        //конец работы с эдит текстом



        //кнопко продолжить - начало
        //  Button btncontinuelevel1 = (Button)findViewById(R.id.btncontinuelevel1);

        // btncontinuelevel1.setOnClickListener(new View.OnClickListener(){
        //     @Override
        //     public void onClick(View v){
        //         try{
        //            Intent intent = new Intent(Level1_3.this, Lekcii_Levels.class);
        //             startActivity(intent);finish();
        //        }catch (Exception e){

        //         }
        //      }
        //  });                                                     //кнопка продолжить - конец

    }
    //системная кнопка назад - начало
    @Override
    public void onBackPressed(){
        //обработка нажатия кнопки "назад" - начало
        try{
            Intent intent = new Intent(Level1_4.this, Lekcii_Levels.class); //создали намерения для перехода к выбору уровня
            startActivity(intent);//старт намерений
            finish();//закрыть этот класс
            //вернуться назад к выбору уровя
        }catch (Exception e){
            //здесь кода не будет
        }
        //обрабатываем нажатие кнопки "наза" - конец
    }
    //системная кнопка назад - конец
}