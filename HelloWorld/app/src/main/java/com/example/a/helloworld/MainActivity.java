package com.example.a.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*R: Resource 레이아웃을 자기 화면으로 만들겠다.*/

    }

    public void onHelloWorldClick(View view){ /*View를 받는다.*/
        Toast.makeText(this,"Hello world click",Toast.LENGTH_SHORT).show();
                /*텍스트를 만든다.*/
    }
}
