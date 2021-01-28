package com.tni.nunthicha.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

//Question
// 1. C  2.C  3.A  4.A

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private TextView TextView11;
    private TextView TextView12;
    private TextView TextView13;
    private TextView TextView14;
    private TextView TextView15;
    private TextView TextView16;
    private TextView TextView17;
    private TextView TextView18;
    private TextView TextView19;
    private TextView TextView20;
    public static final int TEXT_REQUEST =1;
    public int listofitem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String message = intent.getStringExtra(SecondActivity.TEXT_MESSAGE);
        TextView11 = findViewById(R.id.textView1);
        TextView12 = findViewById(R.id.textView2);
        TextView13 = findViewById(R.id.textView3);
        TextView14 = findViewById(R.id.textView4);
        TextView15 = findViewById(R.id.textView5);
        TextView16 = findViewById(R.id.textView6);
        TextView17 = findViewById(R.id.textView7);
        TextView18 = findViewById(R.id.textView8);
        TextView19 = findViewById(R.id.textView9);
        TextView20 = findViewById(R.id.textView10);
        TextView11.setText(message);

        if(savedInstanceState != null)
        {
            boolean isVisible = savedInstanceState.getBoolean("reply_visible");
            if(isVisible)
            {
                TextView11.setVisibility(View.VISIBLE);
                TextView11.setText(savedInstanceState.getString("reply_text1"));
                TextView12.setVisibility(View.VISIBLE);
                TextView12.setText(savedInstanceState.getString("reply_text2"));
                TextView13.setVisibility(View.VISIBLE);
                TextView13.setText(savedInstanceState.getString("reply_text3"));
                TextView14.setVisibility(View.VISIBLE);
                TextView14.setText(savedInstanceState.getString("reply_text4"));
                TextView15.setVisibility(View.VISIBLE);
                TextView15.setText(savedInstanceState.getString("reply_text5"));
                TextView16.setVisibility(View.VISIBLE);
                TextView16.setText(savedInstanceState.getString("reply_text6"));
                TextView17.setVisibility(View.VISIBLE);
                TextView17.setText(savedInstanceState.getString("reply_text7"));
                TextView18.setVisibility(View.VISIBLE);
                TextView18.setText(savedInstanceState.getString("reply_text8"));
                TextView19.setVisibility(View.VISIBLE);
                TextView19.setText(savedInstanceState.getString("reply_text9"));
                TextView20.setVisibility(View.VISIBLE);
                TextView20.setText(savedInstanceState.getString("reply_text10"));
            }
        }

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (TextView11.getVisibility() == View.VISIBLE)
        {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text1", TextView11.getText().toString());
            outState.putString("reply_text2", TextView12.getText().toString());
            outState.putString("reply_text3", TextView13.getText().toString());
            outState.putString("reply_text4", TextView14.getText().toString());
            outState.putString("reply_text5", TextView15.getText().toString());
            outState.putString("reply_text6", TextView16.getText().toString());
            outState.putString("reply_text7", TextView17.getText().toString());
            outState.putString("reply_text8", TextView18.getText().toString());
            outState.putString("reply_text9", TextView19.getText().toString());
            outState.putString("reply_text10", TextView20.getText().toString());

        }
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent,TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST)
        {
            if (resultCode == RESULT_OK)
            {
                String reply = data.getStringExtra(SecondActivity.TEXT_MESSAGE);
                listofitem++;
                if (listofitem == 0){
                }
                else if(listofitem == 1)
                {
                    TextView11.setText(reply);
                    TextView11.setVisibility(View.VISIBLE);
                }
                else if(listofitem == 2)
                {
                    TextView12.setText(reply);
                    TextView12.setVisibility(View.VISIBLE);
                }
                else if(listofitem == 3)
                {
                    TextView13.setText(reply);
                    TextView13.setVisibility(View.VISIBLE);
                }
                else if(listofitem == 4)
                {
                    TextView14.setText(reply);
                    TextView14.setVisibility(View.VISIBLE);
                }
                else if(listofitem == 5)
                {
                    TextView15.setText(reply);
                    TextView15.setVisibility(View.VISIBLE);
                }
                else if(listofitem == 6)
                {
                    TextView16.setText(reply);
                    TextView16.setVisibility(View.VISIBLE);
                }
                else if(listofitem == 7)
                {
                    TextView17.setText(reply);
                    TextView17.setVisibility(View.VISIBLE);
                }
                else if(listofitem == 8)
                {
                    TextView18.setText(reply);
                    TextView18.setVisibility(View.VISIBLE);
                }
                else if(listofitem == 9)
                {
                    TextView19.setText(reply);
                    TextView19.setVisibility(View.VISIBLE);
                }
                else if(listofitem == 10)
                {
                    TextView20.setText(reply);
                    TextView20.setVisibility(View.VISIBLE);
                }
                else
                {
                    TextView11.setText("");
                    TextView12.setText("");
                    TextView13.setText("");
                    TextView14.setText("");
                    TextView15.setText("");
                    TextView16.setText("");
                    TextView17.setText("");
                    TextView18.setText("");
                    TextView19.setText("");
                    TextView20.setText("");
                    listofitem = 0;
                }
            }
        }
    }
}