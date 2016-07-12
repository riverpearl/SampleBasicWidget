package com.tacademy.samplebasicwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioActivity extends AppCompatActivity {

    RadioGroup groupView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        groupView = (RadioGroup)findViewById(R.id.group_radio);
        groupView.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                displayRadio(i);
            }
        });

        Button btn = (Button)findViewById(R.id.btn_set);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //그냥 이렇게 하면 라디오 버튼을 직접 조작하지 않고 값을 바꿀 때 oncheckedchanged가 호출된다.
                int id = groupView.getCheckedRadioButtonId();
                displayRadio(id);
                groupView.check(R.id.radio_b2);
            }
        });
    }

    private void displayRadio(int id) {
        String message = null;
        switch (id) {
            case R.id.radio_b1:
                message = "B1";
                break;
            case R.id.radio_b2:
                message = "B2";
                break;
            case R.id.radio_b3:
                message = "B3";
                break;
        }
        Toast.makeText(this, "Select : " + message, Toast.LENGTH_SHORT).show();
    }
}
