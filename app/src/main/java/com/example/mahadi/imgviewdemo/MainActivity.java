package com.example.mahadi.imgviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView imageView1, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.img1);
        imageView2 = (ImageView) findViewById(R.id.img2);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.img1:
                customToast();
                break;

            case R.id.img2:
                customToast();
                break;
        }
    }

    public void customToast(){
        LayoutInflater inflater = getLayoutInflater();
        View customView = inflater.inflate(R.layout.customtoast_layout, (ViewGroup) findViewById(R.id.custom_toast));

        Toast toast = new Toast(MainActivity.this);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setView(customView);
        toast.show();
    }
}
