package com.example.a16046562.demoaddon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.jsibbold.zoomage.ZoomageView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    ZoomageView zv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.iv);
        //iv.setImageResource(R.mipmap.ic_launcher);

        // 2.5.2 picasso version: Picasso.with(this).load("http://square.github.io/picasso/static/sample.png").into(iv);
        // 2.71828 picasso version:
        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(iv);

        zv = (ZoomageView) findViewById(R.id.myZoomageView);
        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(zv);
    }
}
