package com.davymutiso.tracknganyaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
ProgressBar progressbar;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);




        progressbar = findViewById(R.id.progress_bar);
        textView = findViewById(R.id.text_view);

        progressbar.setMax(100);
        progressbar .setScaleY(3f);

        progressAnimation();


    }


    public void progressAnimation()
    {
            ProgressBarAnimation anim = new ProgressBarAnimation(this,progressbar,textView,0f,100f);
            anim.setDuration(8000);
            progressbar.setAnimation(anim);

    }
}