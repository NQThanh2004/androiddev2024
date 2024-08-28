package vn.edu.usth.usthweather;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import vn.edu.usthweather.databinding.ActivityWeatherBinding;

public class WeatherActivity extends AppCompatActivity {
    private static String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
    }

    protected void onStart(){
        super.onStart();
        Log.i(TAG,"Start");
    }

    protected void onResume(){
        super.onResume();
        Log.i(TAG,"Resume");
    }

    protected void onPause(){
        super.onPause();
        Log.i(TAG,"Pause");
    }

    protected void onStop(){
        super.onStop();
        Log.i(TAG,"Stop");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"Destroy");
    }
}
