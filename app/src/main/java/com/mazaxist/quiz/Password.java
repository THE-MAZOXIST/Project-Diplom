package com.mazaxist.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

//Direct by Birulia Maksim, supervisor - Gorbadei Olga [BSAC]
public class Password extends AppCompatActivity {

    private long backPressedTime;
    private Toast backToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.password);

//кнопка "Вход" - начало
        Button lubsbut = (Button)findViewById(R.id.password_but);
        lubsbut.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText editText = (EditText) findViewById(R.id.password);
                if (editText.getText().toString().equals("DIPLOM"))
                {
                try{//переход к выбору уровня - начало
                    Intent intent = new Intent(Password.this, MainActivity.class);//создали намерения для перехода
                    startActivity(intent);finish();//старт намерения
                }catch (Exception e){

                }}//переход к выбору уровня - конец
            }
        });
//кнопка "Вход" - конец


        Window w = getWindow();//расстягивает приложение на весь экран
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    //системная кнопка "назад" - начало
    @Override
    public void onBackPressed() {


        if (backPressedTime + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        }else{
            backToast= Toast.makeText(getBaseContext(),"нажмите еще раз, чтобы выйти", Toast.LENGTH_SHORT);
            backToast.show();
        }

        backPressedTime = System.currentTimeMillis();
    }
    //системная кнопка "назад" - конец
}
