package com.liu.logutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.liu.loglibs.LogUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void showLog(View view){
        LogUtil.logD("test");
    }
}
