package com.cachecats.meituan.app;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;

import com.cachecats.meituan.R;
import com.cachecats.meituan.app.home.DiscoverFragment;
import com.cachecats.meituan.app.home.HomeFragment;
import com.cachecats.meituan.base.BaseActivity;
import com.cachecats.meituan.base.BaseFragment;
import com.cachecats.meituan.widget.bottomtab.CustomBottomTabWidget;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.tabWidget)
    CustomBottomTabWidget tabWidget;
    private List<BaseFragment> fragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        init();

    }

    private void init() {
        fragmentList = new ArrayList<>();
        fragmentList.add(new HomeFragment());
        fragmentList.add(new DiscoverFragment());
        tabWidget.init(getSupportFragmentManager(), fragmentList);
    }
}