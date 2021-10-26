package com.lab02.claseview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
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
        DibujarBarra(canvas,17,20, "Hola");
        DibujarBarra(canvas,32,20, "Jaja");
        DibujarBarra(canvas,41,20, "Me la pelas");
        DibujarBarra(canvas,25,20, "pokenei");
        DibujarBarra(canvas,20,20, "jasd");
    }

    public void DibujarBase(Canvas canvas){
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        ancho = canvas.getWidth();
        alto = canvas.getHeight();
        canvas.drawRect(10,alto/4,ancho-10,alto-alto/4,paint);

    }

    public void DibujarBarra(Canvas canvas,int peso,int ancho,String str){
        Paint paint = new Paint();

        paint.setStrokeWidth(5);
        paint.setColor(Color.BLUE);
        canvas.drawRect(temp1-ancho,alto-alto/3-(peso*10),temp1+ancho,alto-alto/3,paint);
        paint.setColor(Color.BLACK);
        canvas.drawText(str, temp1-ancho,alto-(alto/3)+50,paint);

        temp1+=temp2;

    }

    public void cantidad(int x){
        temp1= ancho/(x+1);
        temp2=temp1;

    }


}