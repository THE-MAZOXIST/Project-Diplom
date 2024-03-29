package com.mazaxist.quiz;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//Direct by Birulia Maksim, supervisor - Gorbadei Olga [BSAC]
public class Alab1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab1_1);


        final ImageView img_left = (ImageView)findViewById(R.id.img_left);
        //код который скругляет углы в левой картинке
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            img_left.setClipToOutline(true);
        }


        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        Button btn_back = (Button)findViewById(R.id.button_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //обработка нажатия кнопки "назад" - начало
                try{
                    Intent intent = new Intent(Alab1_1.this, Alabs_Levels.class); //создали намерения для перехода к выбору уровня
                    startActivity(intent);                          //старт намерений
                    finish();                                      //закрыть этот класс
                    //вернуться назад к выбору уровя
                }catch (Exception e){
                    //здесь кожа не будет
                }
                //обрабатываем нажатие кнопки "назад" - конец
            }
        });

        TextView text_on_level1 = (TextView)findViewById(R.id.textView);

        //кнопко продолжить - начало
        Button btncontinuelevel1 = (Button)findViewById(R.id.btncontinuelevel1);

        btncontinuelevel1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try{
                    Intent intent = new Intent(Alab1_1.this, Alabs_Levels.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });                                                     //кнопка продолжить - конец


    }

    //системная кнопка назад - начало
    @Override
    public void onBackPressed(){
        //обработка нажатия кнопки "назад" - начало
        try{
            Intent intent = new Intent(Alab1_1.this, Electures_main.class); //создали намерения для перехода к выбору уровня
            startActivity(intent);//старт намерений
            finish();//закрыть этот класс
            //вернуться назад к выбору уровня
        }catch (Exception e){
            //здесь кода не будет
        }
        //обрабатываем нажатие кнопки "наза" - конец
    }
    //системная кнопка назад - конец

}
