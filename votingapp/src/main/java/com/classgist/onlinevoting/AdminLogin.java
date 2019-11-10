package com.classgist.onlinevoting;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLogin extends Activity {


    Button login;
    Button cancel;
    EditText usr;
    EditText psw;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminlogin);

        login=(Button)findViewById(R.id.login_btn);
        cancel=(Button)findViewById(R.id.cancel_btn);
        usr=(EditText)findViewById(R.id.usr_edt);
        psw=(EditText)findViewById(R.id.password_edt);




        cancel.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i=new Intent(AdminLogin.this,HomeScreen.class);
                startActivity(i);
            }
        });

        login.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String u = usr.getText().toString();
                String p = psw.getText().toString();

                if(u.equals("")||p.equals("")) {
                    Toast.makeText(getApplicationContext(), "Fields are empty", Toast.LENGTH_SHORT).show();
                }
                else {

                }
            }
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Close The Database

    }

}
