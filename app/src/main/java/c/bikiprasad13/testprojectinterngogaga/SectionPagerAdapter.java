package c.bikiprasad13.testprojectinterngogaga;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class SectionPagerAdapter extends FragmentPagerAdapter {
    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                SettingsFragment settings = new SettingsFragment();
                return settings;
            case 1:
                profileFragment profileFragment = new profileFragment();
                return profileFragment;
            case 2:
                supportFragment support = new supportFragment();
               return support;
            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Preferences";
            case 1:
                return "My Profile";
            case 2:
                return "Support";
            default:
                return null;

        }

    }
}
