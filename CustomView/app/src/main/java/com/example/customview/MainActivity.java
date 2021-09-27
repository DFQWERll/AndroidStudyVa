package com.example.customview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_my_view);

//        Button btn = (Button) this.findViewById(R.id.button1);
//
//        //接口不能直接new 以下写法是new了一个实现接口的匿名类
//        btn.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                btn.setText("OnClicked!");
//
//            }
//        });
    }
}