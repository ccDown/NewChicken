package kuan.com.newchicken.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kuan.com.newchicken.R;
import kuan.com.newchicken.base.BaseFragment;

/**
 * Created by 刘永宽 on 2017/3/13 0013.
 */

public class SecondFragment  extends BaseFragment{
    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return getLayoutId(inflater,container,savedInstanceState);
    }

    @Override
    protected View getLayoutId(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_second,container,false);
        initView();
        initData();
        initAction();
        return view;
    }


    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initAction() {

    }
}
