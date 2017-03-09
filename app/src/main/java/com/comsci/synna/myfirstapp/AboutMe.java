package com.comsci.synna.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        TextView textView = (TextView)findViewById(R.id.txtDetailFacebook);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://www.facebook.com/synsynna'> Facebook </a>";
        textView.setText(Html.fromHtml(text));

        Button button = (Button) findViewById(R.id.btnBack);
    }
    public void clickBack(View view) {
        finish();
    }
}
