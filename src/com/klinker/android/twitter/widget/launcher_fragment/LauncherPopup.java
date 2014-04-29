package com.klinker.android.twitter.widget.launcher_fragment;

import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.klinker.android.twitter.R;
import com.klinker.android.twitter.ui.MainActivityPopup;


public class LauncherPopup extends MainActivityPopup {

    @Override
    public void setDim() {
        // Params for the window.
        // You can easily set the alpha and the dim behind the window from here
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.alpha = 1.0f;
        params.dimAmount = .75f;  // set it higher if you want to dim behind the window

        getWindow().setAttributes(params);
    }

    @Override
    public void setLauncherPage() {
        mViewPager.setCurrentItem(getIntent().getIntExtra("launcher_page", 0));
        LinearLayout drawer = (LinearLayout) findViewById(R.id.left_drawer);
        drawer.setVisibility(View.GONE);
    }
}
