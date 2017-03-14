package kuan.com.newchicken.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ab.fragment.AbFragment;

/**
 * Created by 刘永宽 on 2017/3/14 0014.
 */

public abstract class BaseFragment extends AbFragment{

    protected abstract View getLayoutId(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState);

    protected abstract void initView();

    protected abstract void initData();

    protected abstract void initAction();
}
