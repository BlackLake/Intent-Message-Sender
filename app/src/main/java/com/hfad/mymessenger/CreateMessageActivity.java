package com.hfad.mymessenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view)
    {
        EditText editText = (EditText)findViewById(R.id.message);
        String value = editText.getText().toString();
        //Intent intent = new Intent(this,ReceiveMessageActivity.class);
        //intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,value);

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,value);
        //startActivity(intent);

        String chooserTitle = getString(R.string.chooser);
        Intent choosenIntent= Intent.createChooser(intent,chooserTitle);
        startActivity(choosenIntent);
    }
}
