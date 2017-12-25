package org.freedesktop.gstreamer.tutorial_3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.freedesktop.gstreamer.tutorials.tutorial_3.R;
import org.freedesktop.gstreamer.tutorials.tutorial_3.Tutorial3;

public class InputAddressActivity extends Activity {
    Button buttonView;
    EditText editTextAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_address);
        buttonView = (Button)findViewById(R.id.button_view);
        editTextAdd = (EditText)findViewById(R.id.address);
        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String address = editTextAdd.getText().toString();
                Intent intent = new Intent(InputAddressActivity.this, Tutorial3.class);
                intent.putExtra("ADDRESS",address);
                startActivity(intent);
            }
        });
    }
}
