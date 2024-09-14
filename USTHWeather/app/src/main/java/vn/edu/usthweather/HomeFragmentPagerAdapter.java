package vn.edu.usthweather;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.Objects;

public class HomeFragmentPagerAdapter extends FragmentStateAdapter {
    private final String[] titles = new String[]{"Hanoi-Vietnam", "Patis-France", "Toulous"};

    public HomeFragmentPagerAdapter(AppCompatActivity activity) {
        super(activity);
    }

    @Override
    public int getItemCount() {
        return 3; // number of pages for a Viewer
    }
        @NonNull
        @Override
        public Fragment createFragment ( int position){
            return new WeatherAndForecastFragment(); // failsafe
        }
        public CharSequence getPageTitle ( int page){
            // return a tab title corresponding to the specified page
            return titles[page];
        }
    }
