package com.arvin.materialapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

	private ListView mListView;
	private String[] items = new String[]{"CoordinatorLayout(协调者布局)",
			"Toolbar(工具栏)",
			"AppBarLayout (应用标题栏容器)",
			"CollapsingToolbarLayout (折叠效果的布局容器)",
			"TabLayout (标签导航)",
			"TextInputLayout (输入框控件的悬浮标签)",
			"NavigationView (抽屉导航)",
			"RunningPermission (运行时权限)"};
	private Class[] classes = new Class[]{
			CoordinatorLayout.class,
			ToolBar.class,
			AppBarLayoutActivity.class,
			CollapsingToolbarLayoutActivity.class,
			TabLayoutActivity.class,
			TextInputLayoutActivity.class,
			NavigationViewActivity.class,
			RunningPermissionActivity.class
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mListView = (ListView) findViewById(R.id.listView);
		mListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));
		mListView.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
		Intent intent = new Intent(this, classes[i]);
		startActivity(intent);
	}
}
