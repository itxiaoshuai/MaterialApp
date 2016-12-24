package com.arvin.materialapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/*
 *  @项目名：  MaterialApp 
 *  @包名：    com.arvin.materialapp
 *  @文件名:   ToolBar
 *  @创建者:   Administrator
 *  @创建时间:  2016/12/21 21:08
 *  @描述：    TODO
 */
public class ToolBar extends AppCompatActivity{
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_toolbar);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);//通过toolbar代替actionbar
		getSupportActionBar().setTitle("我是标题");//设置标题
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);//设置返回按键
		getSupportActionBar().setLogo(R.mipmap.ic_launcher);//设置标题
		getSupportActionBar().setSubtitle("二级标题");

		//监听返回按键的点击
		toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast.makeText(ToolBar.this, "点击了返回按钮", Toast.LENGTH_SHORT).show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_toolbar,menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()){
			case R.id.email:
				Toast.makeText(this, "email被点击了", Toast.LENGTH_SHORT).show();
				break;
			case R.id.btn1:
				Toast.makeText(this, "btn1被点击了", Toast.LENGTH_SHORT).show();
				break;
			case R.id.btn2:
				Toast.makeText(this, "btn2被点击了", Toast.LENGTH_SHORT).show();
				break;
			case R.id.btn3:
				Toast.makeText(this, "btn3被点击了", Toast.LENGTH_SHORT).show();
				break;
		}
		return true;
	}
}
