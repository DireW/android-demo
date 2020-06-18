package com.direw.mysecond;

import android.content.Intent;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class AuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        //      模拟取得intent中的传递参数
        Intent intent = getIntent();
        String from = intent.getStringExtra("from");
        assert from != null;
        Log.d("from", from);
    }
}
