package com.js980112.dokkaebi;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img1,img2;
    boolean t=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=(ImageView)findViewById(R.id.img1);
        img2=(ImageView)findViewById(R.id.img2);

        new Handler().postDelayed(new ImgRunn(),500);
    }
    private class ImgRunn implements Runnable{
        @Override
        public void run() {
            if(t){
                img1.setVisibility(View.VISIBLE);
                img2.setVisibility(View.GONE);
            }else{
                img1.setVisibility(View.GONE);
                img2.setVisibility(View.VISIBLE);
            }
            t=!t;
            new Handler().postDelayed(new ImgRunn(),500);
        }
    }
}
