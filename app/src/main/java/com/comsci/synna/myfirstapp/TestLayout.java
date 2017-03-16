package com.comsci.synna.myfirstapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TestLayout extends AppCompatActivity {


    //Explicit
    MediaPlayer mediaPlayer;
    int soundID = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_layout);

        //Toast onClick
        ImageView clickImageView = (ImageView) findViewById(R.id.imvMyPic); //ติดเส้นแดงกดalt +enter = cast
        clickImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hello! My name is Tinna Boonin", Toast.LENGTH_SHORT).show();

                //Show Sound When Click Image
                soundID = R.raw.r1;
                playSound(soundID);

            }


        });
        //Toast onLongClick
        ImageView longClickImageView = (ImageView) findViewById(R.id.imvMyPic);
        longClickImageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(), "Thanks guys! \n Hope you like my first app", Toast.LENGTH_SHORT).show();

                //Show Sound When Click Image
                soundID = R.raw.r2;


                return true;
            }
        });

        //Phone onClick
        TextView phoneTextView = (TextView) findViewById(R.id.txtTel);
        phoneTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:0957078611"));
                startActivity(phoneIntent);
            }
        });


        //link to facebook


    }//main method

    private void playSound(int soundID) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), soundID);
        mediaPlayer.start();
    }

    public void clickBack(View view) {

        finish();
    }
}//main class
