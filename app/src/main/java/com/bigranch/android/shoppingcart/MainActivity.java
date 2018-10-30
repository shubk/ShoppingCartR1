package com.bigranch.android.shoppingcart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mButtonInMainPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_login);

        mButtonInMainPage=(Button) findViewById(R.id.btn_firstpage);
        mButtonInMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,R.string.going_to_loginpage,Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,Login.class);

                startActivity(i);
            }
        });
    }


}
