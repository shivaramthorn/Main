package com.example.shape;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class MainActivity extends Activity 
{
	Bitmap b;
	ImageView i;
	Canvas c;
	Paint p,e,l;
    @SuppressWarnings("deprecation")
	@Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);
        i = (ImageView) findViewById(R.id.imageView);
        i.setBackgroundDrawable(new BitmapDrawable(b));
        c = new Canvas(b);
        p = new Paint();
        e = new Paint();
        l = new Paint();
        p.setColor(Color.BLUE);
        e.setColor(Color.WHITE);
        l.setColor(Color.RED);
        p.setStrokeWidth(5f);
        c.drawCircle(540, 350, 150, p);
        c.drawCircle(545, 350, 50, e);
        c.drawCircle(190, 350, 150, p);
        c.drawCircle(195, 350, 50, e);
        c.drawRect(100, 550, 650, 1000, l);
        c.drawRect(200, 650, 550, 900, e);
        c.drawLine(0, 280, 260, 130, p);
        c.drawLine(450, 130, 1000, 390, p);
    }
}
