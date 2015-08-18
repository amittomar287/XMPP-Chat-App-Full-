package com.sys.android.activity;


import com.example.xmppchatapplication.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Window;
/**
 * @author yuanqihesheng
 * @date 2013-04-27
 */
public class WelcomeActivity extends Activity {
	private Handler mHandler;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		initView();
	}

	public void initView() {
			mHandler = new Handler();
			mHandler.postDelayed(new Runnable() {
				public void run() {
					goLoginActivity();
				}
			}, 1000);
	}


	public void goLoginActivity() {
		Intent intent = new Intent();
		intent.setClass(this, LoginActivity.class);
		startActivity(intent);
		finish();
	}

	public void createShut() {
		Intent addIntent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
		String title = getResources().getString(R.string.app_name);
		Parcelable icon = Intent.ShortcutIconResource.fromContext(WelcomeActivity.this, R.drawable.icon);

		Intent myIntent = new Intent(WelcomeActivity.this,WelcomeActivity.class);
		addIntent.putExtra(Intent.EXTRA_SHORTCUT_NAME, title);
		addIntent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE, icon);
		addIntent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, myIntent);
		sendBroadcast(addIntent);
	}
}