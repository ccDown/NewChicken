package kuan.com.newchicken.base;

import android.os.Bundle;

import com.ab.activity.AbActivity;
import com.ab.view.titlebar.AbTitleBar;

/**
 * Created by 刘永宽 on 2017/3/14 0014.
 */

public abstract class BaseActivity extends AbActivity {

    public static AbTitleBar mabtitlebar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setAbContentView(getLayoutId());
        mabtitlebar=getTitleBar();
        initView();
        initData();
        initAction();
    }
    protected abstract int getLayoutId();

    protected abstract void initView();

    protected abstract void initData();

    protected abstract void initAction();
}
