package com.bigranch.android.shoppingcart;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.santalu.maskedittext.MaskEditText;

public class Login extends AppCompatActivity {


    // This for the Login Page
    //private EditText mUserPhNumber;
    private MaskEditText mUserPhNumber;
    private EditText mUserPassword;
    private Button mBtnLogin;
    private  Button mBtnSignUp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       // mUserPhNumber=(EditText) findViewById(R.id.txtuser_name_mblphone);
        mUserPhNumber=findViewById(R.id.txtuser_name_mblphone);
        mUserPassword=(EditText) findViewById(R.id.txtuser_pwd);
        mBtnLogin=(Button) findViewById(R.id.btn_login);
        // write function for each of the above
        validate(mUserPhNumber.toString(),mUserPassword.toString());
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate( mUserPhNumber.getText().toString(),mUserPassword.getText().toString());
            }
        });
    }

    private void validate(String userName,String userPassword){
        //if((userName.equals("mobile"))&&(userPassword.equals("shk"))){
        if((userName.equals("(951)-474-2140"))&&(userPassword.equals("shk"))){
            Intent intent=new Intent(Login.this,SignUp.class);
            //PhoneNumberUtils.formatNumber(mUserPhNumber.getText().toString(),)
            //PhoneNumberUtils.formatNumber(text.getText().toString()
             //Toast.makeText(Login.this,R.string.going_to_loginpage,Toast.LENGTH_SHORT).show();
            Toast.makeText(Login.this,"Welcome "+mUserPhNumber.getText(),Toast.LENGTH_SHORT).show();//txtuser_name_mblphone
            startActivity(intent);
        }
    }
}
