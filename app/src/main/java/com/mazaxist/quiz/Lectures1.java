package com.mazaxist.quiz;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Lectures1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lectures1_1);
        PDFView pdfView=findViewById(R.id.pdfView);
        //pdfView.fromAsset("lectures.pdf")
          //          .load();
        pdfView.fromAsset("lectures.pdf")
                .pages(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10) // all pages are displayed by default
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
                .load();
    }

    //системная кнопка "назад" - начало
    @Override
    public void onBackPressed(){
        try{
            Intent intent = new Intent(Lectures1.this, Lectures_main.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }
    //системная кнопка "назад" - конец
}
