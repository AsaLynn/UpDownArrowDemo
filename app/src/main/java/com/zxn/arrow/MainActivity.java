package com.zxn.arrow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;

/**
 * Created by zxn on 2018-11-9 10:42:06.
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.cb_arrow_coin_type)
    CheckBox cbArrowCoinType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        cbArrowCoinType.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//
//            }
//        });
    }

    @OnCheckedChanged(R.id.cb_arrow_coin_type)
    void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            Toast.makeText(this, "选中了!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "取消了!", Toast.LENGTH_SHORT).show();
        }
    }
}
