package com.arvin.materialapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/*
 *  @项目名：  MaterialApp 
 *  @包名：    com.arvin.materialapp
 *  @文件名:   CollapsingToolbarLayoutActivity
 *  @创建者:   Administrator
 *  @创建时间:  2016/12/21 23:53
 *  @描述：    折叠效果的布局容器
 */
public class CollapsingToolbarLayoutActivity extends AppCompatActivity {
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_collaps);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		getSupportActionBar().setTitle("我是Toolbar");
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);//设置返回按键
	}
}
