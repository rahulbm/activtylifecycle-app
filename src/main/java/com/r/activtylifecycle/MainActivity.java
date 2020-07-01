package com.r.activtylifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart::::::::::::","super.onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume::::::::::::","super.onResume()");

    }

    //Suppose another ActivityB comes to foreground

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause::::::::::::","super.onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStop::::::::::::","super.onStop()");

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d("onSaveInstanceState::::::::::::","super.onSaveInstanceState()");

    }

    //Return button is pressed from ActivityB -->onPause, onStop are invoked followed by onDestroy
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy::::::::::::","super.onDestroy()");
    }

    //User is on app and rotate the screen i.e. when the config are changed,
    //then onPause, onStop, onSavedInstanceState,onDestroy are invoked followed by onCreate onStart and below onRestoreInstaceState
    //onResume

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("onRestoreInstanceState::::::::::::","super.onRestoreInstanceState()");
    }

    //User selects the app from home assuming app left in background by pressing home button

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("onRestart::::::::::::","super.onRestart()");

    }
}
