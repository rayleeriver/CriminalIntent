package android.bignerdranch.com.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by ray on 9/1/14.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
