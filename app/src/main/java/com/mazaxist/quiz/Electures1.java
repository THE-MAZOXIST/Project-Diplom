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
public class Electures1 extends AppCompatActivity {

    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lectures1);


        PDFView pdfView=findViewById(R.id.pdfView1); //pdf на экране начало
        //pdfView.fromAsset("lectures.pdf")
        //          .load();
        pdfView.fromAsset("lecturesend.pdf")
                .pages(1, 2, 3, 4, 5, 6, 7, 8) // all pages are displayed by default
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

        /*                                                                        //вызов диалогового окна в начале игры
        dialog = new Dialog(this);                                       //создаем новое диалоговое окно
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.previewdialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));//прозрачный фон диалогового окна
        dialog.setCancelable(false);                                            // окно нельзя закрыть кнопкой назад

                                                                                //кнопка закрывающее диалоговое окно - начало
        TextView btncloce = (TextView)dialog.findViewById(R.id.btnclose);
        btncloce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //обрабатываем нажатие кнопки - начало
                try{
                    //вернуться назад к выбору уровня - начало
                    Intent intent = new Intent(Electures1.this, Electures_main.class); //создали намерения для перехода
                    startActivity(intent); //старт намерения
                    finish();//закрыть этот класс
                    //вернуться назад к выбору уровня - конец

                }catch (Exception e){
                    //здесь кода не будет
                }
                dialog.dismiss();//закрываем диалоговое окно
                //обрабатываем нажатие кнопки - конец

            }
        });
                                                                 //кнопка закрывающее диалоговое окно - конец

         */

                                                                //кнопко продолжить - начало
        //кнопка продолжить - начало
      /* Button btncontinuelevel1 = (Button)findViewById(R.id.btncontinuelevel1);

        EditText editText = (EditText) findViewById(R.id.edit_text_level1);
        String ima;
        btncontinuelevel1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){


                    try{
                        Intent intent = new Intent(Electures1.this, Electures_main.class);
                        startActivity(intent);finish();
                    }catch (Exception e){

                    }
            }
        });                                                    //кнопка продолжить - конец
*/
  /*                                                              //кнопка продолжить - начало
        Button btncontinue = (Button)dialog.findViewById(R.id.btncontinue);
        btncontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();//закрываем диалоговое окно
            }
        });
                                                                // кнопка продолжить - конец
*/

                                                                //кнопка назад - начало
        Button btn_back = (Button)findViewById(R.id.button_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                                                                //обработка нажатия кнопки "назад" - начало
                try{
                    Intent intent = new Intent(Electures1.this, Electures_main.class); //создали намерения для перехода к выбору уровня
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


        //dialog.show();

    }

  //  private TextView editText() {
  //  }

    //системная кнопка назад - начало
    @Override
    public void onBackPressed(){
        //обработка нажатия кнопки "назад" - начало
        try{
            Intent intent = new Intent(Electures1.this, Electures_main.class); //создали намерения для перехода к выбору уровня
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