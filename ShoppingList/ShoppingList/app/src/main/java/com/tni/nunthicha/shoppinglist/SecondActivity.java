package com.tni.nunthicha.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String TEXT_MESSAGE = "com.tni.nunthicha.shoppinglist.text.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d(LOG_TAG,"-------");
        Log.d(LOG_TAG,"onCreate");
    }

    public void click1(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        if(view.getId() == R.id.button2) {
            Intent replyIntent = new Intent();
            replyIntent.putExtra(TEXT_MESSAGE,getResources().getString(R.string.banana));
            setResult(RESULT_OK,replyIntent);
            finish();
        }
        else if(view.getId() == R.id.button3){
            Intent replyIntent = new Intent();
            replyIntent.putExtra(TEXT_MESSAGE,getResources().getString(R.string.tea));
            setResult(RESULT_OK,replyIntent);
            finish();
        }
        else if(view.getId() == R.id.button4){
            Intent replyIntent = new Intent();
            replyIntent.putExtra(TEXT_MESSAGE,getResources().getString(R.string.tomato));
            setResult(RESULT_OK,replyIntent);
            finish();
        }
        else if(view.getId() == R.id.button5){
            Intent replyIntent = new Intent();
            replyIntent.putExtra(TEXT_MESSAGE,getResources().getString(R.string.orange));
            setResult(RESULT_OK,replyIntent);
            finish();
        }
        else if(view.getId() == R.id.button6){
            Intent replyIntent = new Intent();
            replyIntent.putExtra(TEXT_MESSAGE,getResources().getString(R.string.water));
            setResult(RESULT_OK,replyIntent);
            finish();
        }
        else if(view.getId() == R.id.button7){
            Intent replyIntent = new Intent();
            replyIntent.putExtra(TEXT_MESSAGE,getResources().getString(R.string.apple));
            setResult(RESULT_OK,replyIntent);
            finish();
        }
        else if(view.getId() == R.id.button8){
            Intent replyIntent = new Intent();
            replyIntent.putExtra(TEXT_MESSAGE,getResources().getString(R.string.rice));
            setResult(RESULT_OK,replyIntent);
            finish();
        }
        else if(view.getId() == R.id.button9){
            Intent replyIntent = new Intent();
            replyIntent.putExtra(TEXT_MESSAGE,getResources().getString(R.string.cheese));
            setResult(RESULT_OK,replyIntent);
            finish();
        }
        else if(view.getId() == R.id.button10){
            Intent replyIntent = new Intent();
            replyIntent.putExtra(TEXT_MESSAGE,getResources().getString(R.string.milk));
            setResult(RESULT_OK,replyIntent);
            finish();
        }
        else{
            Intent replyIntent = new Intent();
            replyIntent.putExtra(TEXT_MESSAGE,getResources().getString(R.string.grape));
            setResult(RESULT_OK,replyIntent);
            finish();
        }
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d(LOG_TAG,"onStart");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(LOG_TAG,"onPause");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(LOG_TAG,"onRestart");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(LOG_TAG,"onDestroy");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(LOG_TAG,"onResume");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(LOG_TAG,"onStop");
    }
}