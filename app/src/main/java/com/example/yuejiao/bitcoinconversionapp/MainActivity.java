package com.example.yuejiao.bitcoinconversionapp;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onGetNameClick(View view) {
        Intent getName = new Intent(this, NameScreen.class);
        final int result = 1;

        getName.putExtra("callingActivity", "MainActivity");

        startActivityForResult(getName, result);
        TextView callingActivityMessage = (TextView)findViewById(R.id.info_text_view);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView userName = (TextView)findViewById(R.id.name_message);

        String nameSentBack = data.getStringExtra("UserName");
        userName.append(" " + nameSentBack);
    }
}
