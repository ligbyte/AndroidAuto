package com.example.clickdevice.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;

import com.example.clickdevice.R;

import com.example.clickdevice.fg.ScriptEditFragment;


public class ScriptEditActivity extends AppCompatActivity {
    private boolean isNew;
    private ScriptEditFragment scriptEditFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_script_edit);
        Intent intent = getIntent();
        if (intent != null) {
            isNew = intent.getBooleanExtra("isNew", true);
        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        scriptEditFragment = (ScriptEditFragment) fragmentManager.findFragmentById(R.id.frameLy_script_edit);
        if (scriptEditFragment == null) {
            fragmentManager.beginTransaction().add(R.id.frameLy_script_edit, new ScriptEditFragment(), "1").commit();
        }



    }

    public boolean getIsNew(){
        return isNew;
    }

    public void finishActivity(){
        finish();
    }
}