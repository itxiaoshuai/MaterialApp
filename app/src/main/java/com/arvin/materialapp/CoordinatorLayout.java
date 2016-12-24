package com.arvin.materialapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/*
 *  @项目名：  MaterialApp 
 *  @包名：    com.arvin.materialapp
 *  @文件名:   CoordinatorLayout
 *  @创建者:   Administrator
 *  @创建时间:  2016/12/21 18:26
 *  @描述：    TODO
 */
public class CoordinatorLayout extends AppCompatActivity implements View.OnClickListener {

	private FloatingActionButton mFloatingActionButton;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_coor);
		mFloatingActionButton = (FloatingActionButton) findViewById(R.id.floatActionBtn);
		mFloatingActionButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		Snackbar snackbar =Snackbar.make(mFloatingActionButton,"我是提示",Snackbar.LENGTH_SHORT);
		snackbar.setAction("取消", new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast.makeText(CoordinatorLayout.this,"取消显示snackbar",Toast.LENGTH_SHORT).show();
			}
		});
		snackbar.show();
	}
}
