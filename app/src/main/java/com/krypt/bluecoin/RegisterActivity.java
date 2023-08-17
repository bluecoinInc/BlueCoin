package com.krypt.bluecoin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;



import com.krypt.bluecoin.User.RegisterPages.Firstpage;
import com.krypt.bluecoin.User.RegisterPages.Secondpage;


public class RegisterActivity extends AppCompatActivity {
    Firstpage firstpage=new Firstpage();
    Secondpage secondpage=new Secondpage();

    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportFragmentManager().beginTransaction().replace(R.id.cointainer,firstpage).commit();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        RegisterActivity.this.onBackPressed();


    }

}