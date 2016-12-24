package com.arvin.materialapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/*
 *  @项目名：  MaterialApp 
 *  @包名：    com.arvin.materialapp
 *  @文件名:   TextInputLayoutActivity
 *  @创建者:   Administrator
 *  @创建时间:  2016/12/23 19:27
 *  @描述：    TODO
 */
public class TextInputLayoutActivity extends AppCompatActivity implements View.OnClickListener {

	private TextInputLayout mLayout_username;
	private TextInputLayout mLayout_pwd;
	private EditText mEt_username;
	private EditText mEt_pwd;
	private Button mBt_check;
	private Button mBt_count;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text_input);
		mLayout_username = (TextInputLayout) findViewById(R.id.layout_username);
		mLayout_pwd = (TextInputLayout) findViewById(R.id.layout_pwd);
		mEt_username = (EditText) findViewById(R.id.edit_username);
		mEt_pwd = (EditText)findViewById(R.id.edit_pwd);
		mBt_check = (Button) findViewById(R.id.bt_check);
		mBt_count = (Button) findViewById(R.id.bt_count);
		mBt_check.setOnClickListener(this);
		mBt_count.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		if(view.getId()==R.id.bt_check){
			mLayout_username.setErrorEnabled(true);
			mLayout_username.setError("用户名错误");
		}else {
			mLayout_pwd.setCounterEnabled(true);
		}
	}
}
