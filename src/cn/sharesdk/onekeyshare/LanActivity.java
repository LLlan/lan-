package cn.sharesdk.onekeyshare;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import cn.sharesdk.framework.ShareSDK;

import com.lidroid.xutils.ViewUtils;

public class LanActivity extends Activity {

	Button btu;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ShareSDK.initSDK(getApplicationContext());//初始化
		
		
		setContentView(R.layout.activity_lan);
		ViewUtils.inject(this);
		btu = (Button) findViewById(R.id.but_share_sina);
		
		btu.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//一键分享功能
				OnekeyShare onekeyShare = new OnekeyShare();
				//设置分享标题
				onekeyShare.setTitle("分享");
				//设置分享文本信息
				onekeyShare.setText("我用技术为自己加油！");
				//设置图标
				onekeyShare.setImagePath("sdcard/image/*");
				
			     //显示分享列表
				onekeyShare.show(LanActivity.this);
				
				
			}
		});
		

	/*@OnClick(R.id.but_share_sina)
	public void Button(View v){
		//一键分享功能
		OnekeyShare onekeyShare = new OnekeyShare();
		//设置分享标题
		onekeyShare.setTitle("蓝建分享");
		//设置分享文本信息
		onekeyShare.setText("我用技术为自己加油！");
		//设置图标
		onekeyShare.setImagePath("sdcard/image/*");
		
	     //显示分享列表
		onekeyShare.show(LanActivity.this);
			
		}*/
	
	
		
	}
}

