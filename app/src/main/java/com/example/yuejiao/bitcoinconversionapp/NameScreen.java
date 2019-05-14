package com.example.yuejiao.bitcoinconversionapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NameScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_name);
        Intent activityCalled = getIntent();
        String previousActivity = ((Intent) activityCalled).getExtras().getString("callingActivity");
    }

    public void onSendUserName(View view) {

        EditText userNameText = (EditText)findViewById(R.id.enter_name_edit_view);
        String userName = String.valueOf(userNameText.getText());

        Intent sentBack = new Intent();
        sentBack.putExtra("UserName", userName);
        setResult(RESULT_OK, sentBack);

        finish();
    }
}
