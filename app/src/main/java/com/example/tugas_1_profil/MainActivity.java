package com.example.tugas_1_profil;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView ivSetting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivSetting = findViewById(R.id.ivSetting);
        ivSetting.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_follow:
                onStop();
                break;
            case R.id.ivSetting:
                Intent setting = new Intent(MainActivity.this, AppSetting.class);
                startActivity(setting);
                return;
        }
    }
}
