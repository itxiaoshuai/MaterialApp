package com.arvin.materialapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/*
 *  @项目名：  MaterialApp 
 *  @包名：    com.arvin.materialapp
 *  @文件名:   AppBarLayoutActivity
 *  @创建者:   Administrator
 *  @创建时间:  2016/12/21 22:55
 *  @描述：    TODO
 */
public class AppBarLayoutActivity extends AppCompatActivity {
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_appbar);
		Toolbar toolBar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolBar);
		getSupportActionBar().setTitle("标题");
	}
}
