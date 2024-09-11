package vn.edu.usthweather;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

import vn.edu.usthweather.R;


public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Create a new Fragment to be placed in the activity DetailFragment firstFragment = new DetailFragment();
        ForecastFragment forecastFragment = new ForecastFragment();
        // Add the fragment to the 'container' FrameLayout
        getSupportFragmentManager().beginTransaction().add(
                R.id.fab, forecastFragment).commit();

        Log.i(TAG, "Create");
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