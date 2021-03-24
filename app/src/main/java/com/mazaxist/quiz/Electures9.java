package com.mazaxist.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

//Direct by Birulia Maksim, supervisor - Gorbadei Olga [BSAC]
public class Electures9 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lectures9);


        PDFView pdfView=findViewById(R.id.pdfView9); //pdf на экране начало

        pdfView.fromAsset("lecturesend.pdf")
                .pages(77, 78, 79, 80, 81, 82, 83) // all pages are displayed by default
                .enableSwipe(true) // allows to block changing pages using swipe
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .defaultPage(0)
                .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                .password(null)
                .scrollHandle(null)
                .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                // spacing between pages in dp. To define spacing color, set view background
                .spacing(0)
                .load();                                // pdf на экране конец


        final ImageView img_left = (ImageView)findViewById(R.id.img_left);
                                                                                //код который скругляет углы в левой картинке
        img_left.setClipToOutline(true);


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
                    Intent intent = new Intent(Electures9.this, Electures_main.class); //создали намерения для перехода к выбору уровня
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
            Intent intent = new Intent(Electures9.this, Electures_main.class); //создали намерения для перехода к выбору уровня
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