package com.project.brunchlayout;

import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by 정인섭 on 2017-11-25.
 */

public class ViewPagerAdapter extends PagerAdapter {

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
