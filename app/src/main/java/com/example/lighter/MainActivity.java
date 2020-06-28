package com.example.lighter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button switchBtn;
private Flash flash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }


    private void  init(){

        switchBtn= findViewById(R.id.switchBtn);
        flash = new Flash(this);

    }
    public void onClickFlash(View view) {

        if (flash.isFlash_status() == true){
            flash.flashOff();
            switchBtn.setText("On");
            switchBtn.setBackgroundResource(R.drawable.circle_green);

        }

        else{
            flash.flashOn();
            switchBtn.setText("Off");
            switchBtn.setBackgroundResource(R.drawable.circle_red);
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (flash.isFlash_status() == true){
            flash.flashOff();


        }





    }
}