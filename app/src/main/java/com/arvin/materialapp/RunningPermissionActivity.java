package com.arvin.materialapp;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*
 *  @项目名：  MaterialApp 
 *  @包名：    com.arvin.materialapp
 *  @文件名:   RunningPermissionActivity
 *  @创建者:   Administrator
 *  @创建时间:  2016/12/23 21:19
 *  @描述：    TODO
 */
public class RunningPermissionActivity extends AppCompatActivity implements View.OnClickListener {

	private Button mCamera;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_runningpermission);
		mCamera = (Button)findViewById(R.id.camera);
		mCamera.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		//检查是否获取到权限
		String permission= Manifest.permission.CAMERA;
		int getPermission=checkPermission(permission, Process.myPid(),Process.myUid());//true false
		if(getPermission== PackageManager.PERMISSION_GRANTED){
			Toast.makeText(this,"已经获得权限",Toast.LENGTH_SHORT).show();
		}else {
			//判断是否弹出友好提示
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
				if(shouldShowRequestPermissionRationale(permission)){

					AlertDialog.Builder builder=new AlertDialog.Builder(this);
					builder.setTitle("友情提示");
					builder.setMessage("需要获取拍照权限");
					builder.setNegativeButton("取消",null);
					builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dialogInterface, int i) {
							requestPermission();
						}
					});
					builder.show();
				}else {
					requestPermission();
				}
			}

		}
	}

	private void requestPermission() {
		Toast.makeText(this,"没有获得权限",Toast.LENGTH_SHORT).show();
		//一次请求多个权限
		String [] permissions=new String[]{Manifest.permission.CAMERA};
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
			requestPermissions(permissions,1);
		}
	}
	//返回权限结果

	@Override
	public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		Toast.makeText(this,permissions[0]+"授权结果为:"+grantResults[0],Toast.LENGTH_SHORT).show();
	}
}
