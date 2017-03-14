package kuan.com.newchicken.activity;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.view.View;

import com.ab.view.slidingmenu.SlidingMenu;

import kuan.com.newchicken.R;
import kuan.com.newchicken.base.BaseActivity;

public class MainActivity extends BaseActivity {

    private FirstFragmjent mfirstFragmjent;
    private SecondFragment msecondFragment;
    private ThirdFragment mthirdFragment;
    private FragmentTransaction mfragmentTransaction;
    private SlidingMenu mslidingMenu;


    private BottomNavigationView mainnacigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        mainnacigation = (BottomNavigationView) findViewById(R.id.main_acti_navigation);
        mslidingMenu = (SlidingMenu) findViewById(R.id.slidingmenu);
        mfirstFragmjent = new FirstFragmjent();
        msecondFragment = new SecondFragment();
        mthirdFragment = new ThirdFragment();
    }

    @Override
    protected void initData() {
        //初始化界面
        getFragmentManager().beginTransaction().replace(R.id.content, mfirstFragmjent).commit();
        mslidingMenu .setMode(SlidingMenu.LEFT);
        mslidingMenu.setMenu(R.layout.item_slidingmenu);
        mabtitlebar.setVisibility(View.VISIBLE);
        mabtitlebar.setBackgroundColor(0xffffff);
        mabtitlebar.setTitleText("标题");
    }

    @Override
    protected void initAction() {
        mainnacigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            mfragmentTransaction = MainActivity.this.getFragmentManager().beginTransaction();
            Fragment mshowFragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_first:
                    mshowFragment = mfirstFragmjent;
                    break;
                case R.id.navigation_second:
                    mshowFragment = msecondFragment;
                    break;
                case R.id.navigation_third:
                    mshowFragment = mthirdFragment;
                    break;
                case R.id.navigation_forth:
                    break;
            }
            mfragmentTransaction.replace(R.id.content, mshowFragment).commit();
            return true;
        }

    };

}
