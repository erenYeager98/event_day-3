package com.app.demo1;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes3.dex */
public class MainActivity extends AppCompatActivity {
    Button blinkBTN;
    Button fadeBTN;
    ImageView imageView;
    Button moveBTN;
    Button rotateBTN;
    Button slideBTN;
    Button stopBTN;
    Button zoomBTN;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.imageView = (ImageView) findViewById(R.id.imageView);
        this.blinkBTN = (Button) findViewById(R.id.BTNblink);
        this.rotateBTN = (Button) findViewById(R.id.BTNrotate);
        this.fadeBTN = (Button) findViewById(R.id.BTNfade);
        this.moveBTN = (Button) findViewById(R.id.BTNmove);
        this.slideBTN = (Button) findViewById(R.id.BTNslide);
        this.zoomBTN = (Button) findViewById(R.id.BTNzoom);
        this.stopBTN = (Button) findViewById(R.id.BTNstop);
        this.blinkBTN.setOnClickListener(new View.OnClickListener() { // from class: com.app.mad11.MainActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this.getApplicationContext(), R.anim.blink);
                MainActivity.this.imageView.startAnimation(animation);
            }
        });
        this.rotateBTN.setOnClickListener(new View.OnClickListener() { // from class: com.app.mad11.MainActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this.getApplicationContext(), R.anim.rotate);
                MainActivity.this.imageView.startAnimation(animation);
            }
        });
        this.fadeBTN.setOnClickListener(new View.OnClickListener() { // from class: com.app.mad11.MainActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this.getApplicationContext(), R.anim.fade);
                MainActivity.this.imageView.startAnimation(animation);
            }
        });
        this.moveBTN.setOnClickListener(new View.OnClickListener() { // from class: com.app.mad11.MainActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this.getApplicationContext(), R.anim.move);
                MainActivity.this.imageView.startAnimation(animation);
            }
        });
        this.slideBTN.setOnClickListener(new View.OnClickListener() { // from class: com.app.mad11.MainActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this.getApplicationContext(), R.anim.slide);
                MainActivity.this.imageView.startAnimation(animation);
            }
        });
        this.zoomBTN.setOnClickListener(new View.OnClickListener() { // from class: com.app.mad11.MainActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this.getApplicationContext(), R.anim.zoom);
                MainActivity.this.imageView.startAnimation(animation);
            }
        });
        this.stopBTN.setOnClickListener(new View.OnClickListener() { // from class: com.app.mad11.MainActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                MainActivity.this.imageView.clearAnimation();
            }
        });
    }
}