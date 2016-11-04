package com.example.xuanfengwuxiang.androidannotions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewById(R.id.button)
    Button bt;

    @Click(R.id.button)
    void showMSG(){
        Toast.makeText(getBaseContext(),"你很叼！！！",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        bt.setText("我屌吧！！！");
    }
}
