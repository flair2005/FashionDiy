package com.chuangmeng.fashiondiy;

import com.chuangmeng.fashiondiy.base.BaseFragmentActivity;
import com.chuangmeng.fashiondiy.design.DesignActivity_;
import com.chuangmeng.fashiondiy.login.UserLoginActivity_;
import com.chuangmeng.fashiondiy.login.UserRegistActivity;
import com.chuangmeng.fashiondiy.login.UserRegistActivity_;
import com.chuangmeng.fashiondiy.util.Constant;
import com.chuangmeng.fashiondiy.viewmanager.SystemBarTintManager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_home)
public class HomeActivity extends BaseFragmentActivity { 

	@ViewById
	ImageView view_home_all_diy_iv;

	@ViewById
	ImageView view_home_couple_iv;
	 
	@ViewById
	ImageView view_home_male_iv;

	@ViewById
	ImageView view_home_female_iv;
	
	@ViewById
	ImageView view_home_clothespress_iv;

	@ViewById
	ImageView view_home_about_us_iv;

	@ViewById
	ImageView view_home_help_iv;

	private TranslateAnimation dragMoveAnimation;
	
	@AfterViews
	void initView() {	
		initSystemBar(this);
		adjustTitleViewForScreen();
	}
	
	public static void initSystemBar(Activity activity) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
			setTranslucentStatus(activity, true);
		}
		SystemBarTintManager tintManager = new SystemBarTintManager(activity);
		tintManager.setStatusBarTintEnabled(true);
		// 使用颜色资源
		tintManager.setStatusBarTintResource(R.color.toolbar_color);
	}

	@TargetApi(19)
	private static void setTranslucentStatus(Activity activity, boolean on) {
		Window win = activity.getWindow();
		WindowManager.LayoutParams winParams = win.getAttributes();
		final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
		if (on) {
			winParams.flags |= bits;
		} else {
			winParams.flags &= ~bits;
		}
		win.setAttributes(winParams);
	}

	/**
	 * 情侣装入口
	 * 
	 * @author hch
	 * @date 2014年10月30日 下午11:08:52
	 */
	@Click
	void view_home_couple_iv() {
		Intent intent = new Intent(getApplicationContext(), DesignActivity_.class);
		intent.putExtra(Constant.STYLE, Constant.COUPLE_STYLE);
		startActivity(intent);
	}
 
	/**
	 * 男装入口
	 * 
	 * @author hch
	 * @date 2014年10月30日 下午11:09:10
	 */
	@Click
	void view_home_male_iv() {
		Intent intent = new Intent(getApplicationContext(),DesignActivity_.class);
		intent.putExtra(Constant.STYLE, Constant.MALE_STYLE);
		startActivity(intent);
	}
	
	/**
	 * 女装入口
	 * 
	 * @author chengang
	 * @date 2014-11-13 上午11:44:40
	 */
	@Click
	void view_home_female_iv(){
		Intent intent = new Intent(getApplicationContext(),DesignActivity_.class);
		intent.putExtra(Constant.STYLE, Constant.FEMALE_STYLE);
		startActivity(intent);
	}
	
	@Click
	void view_home_clothespress_iv(){
		Intent intent = new Intent(getApplicationContext(),DisplayGarderobeActivity.class);
		startActivity(intent);
	}

	/**
	 * 关于我们
	 * 
	 * @author hch
	 * @date 2014年10月30日 下午11:03:53
	 */
	@Click
	void view_home_about_us_iv() {
		startActivity(new Intent(getApplicationContext(),AboutUsActivity.class));
	}

	/**
	 * 帮助
	 * 
	 * @author hch
	 * @date 2014年10月30日 下午11:04:08
	 */
	@Click
	void view_home_help_iv() {
		Intent intent = new Intent(this , UserLoginActivity_.class);
		startActivity(intent);
	}

	/**
	 * 根据不同的屏幕调整首页title的间距
	 * 
	 * @author chengang
	 * @date 2014-10-29 上午9:15:01
	 */
	public void adjustTitleViewForScreen() {
		ViewGroup.LayoutParams titleLp = view_home_all_diy_iv.getLayoutParams();
		// title宽度占据屏幕宽度的90%，左右远离边界
		int marginWidthSize = (int) (screenMetric.widthPixels * 0.9);
		// title高度是宽度的25%
		int marginHeightSize = marginWidthSize / 4;

		titleLp.height = marginHeightSize;
		titleLp.width = marginWidthSize;

		view_home_all_diy_iv.setLayoutParams(titleLp);
	}
}
