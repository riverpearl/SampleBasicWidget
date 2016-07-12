package com.tacademy.samplebasicwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {
    TextView messageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        messageView = (TextView)findViewById(R.id.text_testxt);
        Button btn = (Button)findViewById(R.id.btn_marquee);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                messageView.setSelected(!messageView.isSelected());
            }
        });

        btn = (Button)findViewById(R.id.btn_change);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = getResources().getString(R.string.change_text_message);
                messageView.setText(msg);
            }
        });

        btn = (Button)findViewById(R.id.btn_html);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String html = getResources().getString(R.string.html_text);
                messageView.setText(Html.fromHtml(html));
            }
        });
    }
}
