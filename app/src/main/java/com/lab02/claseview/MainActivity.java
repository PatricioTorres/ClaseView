package com.lab02.claseview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Vista vista= new Vista(this);

        setContentView(vista);
    }

}

class Vista extends View {

    int alto,ancho;
    int temp1,temp2;

    public Vista(Context context){
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        DibujarBase(canvas);
        cantidad(5);
        DibujarBarra(canvas,40,20);
        DibujarBarra(canvas,40,20);
        DibujarBarra(canvas,40,20);
        DibujarBarra(canvas,45,20);
        DibujarBarra(canvas,20,20);
    }

    public void DibujarBase(Canvas canvas){
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        ancho = canvas.getWidth();
        alto = canvas.getHeight();
        canvas.drawRect(10,alto/4,ancho-10,alto-alto/4,paint);

    }

    public void DibujarBarra(Canvas canvas,int peso,int ancho){
        int alto = canvas.getHeight();

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        canvas.drawRect(temp1-ancho,alto-alto/3-(peso*10),temp1+ancho,alto-alto/3,paint);
        temp1+=temp2;

    }

    public void cantidad(int x){
        temp1= ancho/(x+1);
        temp2=temp1;

    }


}