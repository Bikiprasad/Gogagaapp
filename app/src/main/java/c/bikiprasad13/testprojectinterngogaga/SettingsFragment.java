package c.bikiprasad13.testprojectinterngogaga;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SettingsFragment extends Fragment {

    private Fragment mSettingsFragment;
    private View mSettingsFragmentView;

    public SettingsFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mSettingsFragmentView =inflater.inflate(R.layout.activity_settings_fragment, container, false);



        return mSettingsFragmentView;

    }
}
