package com.mazaxist.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//Direct by Birulia Maksim, supervisor - Gorbadei Olga [BSAC]
public class Test1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_universal);








                                                                                //развернуть игру на весь экран (убрать строку состояния)- начало
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
                                                                                //развернуть игру на весь экран - конец






                                                                //кнопка назад - начало
        Button btn_back = (Button)findViewById(R.id.button_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                                                                //обработка нажатия кнопки "назад" - начало
                try{
                    Intent intent = new Intent(Test1.this, MainActivity.class); //создали намерения для перехода к выбору уровня
                    startActivity(intent);                          //старт намерений
                    finish();                                      //закрыть этот класс
                                                                  //вернуться назад к выбору уровя
                }catch (Exception e){
                                                                //здесь кожа не будет
                }
                                                                //обрабатываем нажатие кнопки "наза" - конец
            }
        });
                                                                //кнопка назад = конец




    }



    //системная кнопка назад - начало
    @Override
    public void onBackPressed(){
        //обработка нажатия кнопки "назад" - начало
        try{
            Intent intent = new Intent(Test1.this, MainActivity.class); //создали намерения для перехода к выбору уровня
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