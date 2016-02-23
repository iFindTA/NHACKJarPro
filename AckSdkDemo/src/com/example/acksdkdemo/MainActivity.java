package com.example.acksdkdemo;

import org.apache.http.Header;
import org.json.JSONObject;

import com.gongshidai.sdk.Ack;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
/**
 *  爱财客 SDK 接入demo 
 */
public class MainActivity extends Activity {
	private String mPhoneNum = "15068821111"; // 手机号码
	private String mName = "赵日天"; // 姓名
	private String mIdc = "3301010101010010101010"; // 身份证号
	private String mInvestNum = "1"; // 投资金额

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button download = (Button) findViewById(R.id.init);
		Button registe = (Button) findViewById(R.id.registe);
		Button realname = (Button) findViewById(R.id.realname);
		Button invest = (Button) findViewById(R.id.invest);

		/**
		 *  用户启动应用时，下载完成回调
		 */
		download.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Ack.init(MainActivity.this, "4FCUND77NX2C4S"); // 初始化Lcb
			}
		});

		/**
		 *  用户注册完成时，回调
		 */
		registe.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				doLcbRegiste();
			}
		});

		/**
		 *  用户实名认证后回调
		 */
		realname.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				doLcbTruename();
			}
		});

		/**
		 *  用户投资成功后回调
		 */
		invest.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				doLcbInvestSuccess();
			}
		});

	}

	protected void doLcbRegiste() {
		Ack.register(mPhoneNum, new com.loopj.android.https.JsonHttpResponseHandler() {

			@Override
			public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
				super.onSuccess(statusCode, headers, response);
			}

			@Override
			public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
				super.onFailure(statusCode, headers, throwable, errorResponse);
			}

		});
	}

	protected void doLcbTruename() {
		Ack.realname(mPhoneNum, mName, mIdc, new com.loopj.android.https.JsonHttpResponseHandler() {
			@Override
			public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
				super.onSuccess(statusCode, headers, response);
			}

			@Override
			public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
				super.onFailure(statusCode, headers, throwable, errorResponse);
			}
		});
	}

	private void doLcbInvestSuccess() {
		Ack.investment(mPhoneNum, mInvestNum, new com.loopj.android.https.JsonHttpResponseHandler() {
			@Override
			public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
				super.onSuccess(statusCode, headers, response);
			}

			@Override
			public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
				super.onFailure(statusCode, headers, throwable, errorResponse);
			}
		});
	}
}
