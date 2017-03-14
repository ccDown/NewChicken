package kuan.com.newchicken.activity;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import kuan.com.newchicken.R;
import kuan.com.newchicken.base.BaseFragment;

/**
 * Created by 刘永宽 on 2017/3/13 0013.
 */

public class FirstFragmjent extends BaseFragment {
    private TextView textView;
    private View mview;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return getLayoutId(inflater,container,savedInstanceState);
    }

    @Override
    protected View getLayoutId(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mview = inflater.inflate(R.layout.fragment_first,container,false);
        initView();
        initData();
        initAction();
        return mview;
    }


    @Override
    protected void initView() {
        textView = (TextView) mview.findViewById(R.id.textview);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initAction() {
        Log.e("执行","执行");
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"点击",Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}
