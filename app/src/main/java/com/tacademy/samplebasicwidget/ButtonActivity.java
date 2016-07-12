package com.tacademy.samplebasicwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        Button btn = (Button)findViewById(R.id.btn_toast);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    //이런식으로 쓰면 Activity에서만 가능... fragment등에서는 못씀
    public void onButtonClick(View view) {
        Toast.makeText(ButtonActivity.this, "onButtonClick medthod", Toast.LENGTH_SHORT).show();
    }
}
