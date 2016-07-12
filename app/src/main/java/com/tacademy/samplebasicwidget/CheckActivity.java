package com.tacademy.samplebasicwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckActivity extends AppCompatActivity {

    CheckBox checkView;
    boolean isForced = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        checkView = (CheckBox)findViewById(R.id.cbox_test);
        checkView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(!isForced)
                    Toast.makeText(CheckActivity.this, "checked changed : " + b, Toast.LENGTH_SHORT).show();
            }
        });

        Button btn = (Button)findViewById(R.id.btn_check);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //이렇게 하면 체크박스 조작 외에 임의로 isChecked 값을 바꿀 때 onCheckedChanged가 호출되는 걸 막을 수 있다
                boolean checked = checkView.isChecked();
                isForced = true;
                checkView.setChecked(!checked);
                isForced = false;
            }
        });
    }
}
