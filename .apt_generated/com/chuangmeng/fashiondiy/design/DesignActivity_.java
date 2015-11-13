//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0.1.
//


package com.chuangmeng.fashiondiy.design;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.chuangmeng.fashiondiy.R.id;
import com.chuangmeng.fashiondiy.R.layout;
import com.chuangmeng.fashiondiy.view.HorizontalListView;
import com.chuangmeng.fashiondiy.view.NOScrollViewPager;
import org.androidannotations.api.SdkVersionHelper;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class DesignActivity_
    extends DesignActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.activity_design_main);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static DesignActivity_.IntentBuilder_ intent(Context context) {
        return new DesignActivity_.IntentBuilder_(context);
    }

    public static DesignActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new DesignActivity_.IntentBuilder_(fragment);
    }

    public static DesignActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new DesignActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (((SdkVersionHelper.getSdkInt()< 5)&&(keyCode == KeyEvent.KEYCODE_BACK))&&(event.getRepeatCount() == 0)) {
            onBackPressed();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        design_take_select_photo_rl = ((LinearLayout) hasViews.findViewById(id.design_take_select_photo_rl));
        design_cloth_child_title = ((LinearLayout) hasViews.findViewById(id.design_cloth_child_title));
        design_bottom_operate_hide_iv = ((ImageView) hasViews.findViewById(id.design_bottom_operate_hide_iv));
        design_couple_title_female_back_iv = ((Button) hasViews.findViewById(id.design_couple_title_female_back_iv));
        design_title_couple_include = ((LinearLayout) hasViews.findViewById(id.design_title_couple_include));
        design_model_operate_text_color_listview = ((HorizontalListView) hasViews.findViewById(id.design_model_operate_text_color_listview));
        design_cloth_detail_viewpager = ((NOScrollViewPager) hasViews.findViewById(id.design_cloth_detail_viewpager));
        design_couple_title_male_back_iv = ((Button) hasViews.findViewById(id.design_couple_title_male_back_iv));
        design_title_preview_iv = ((Button) hasViews.findViewById(id.design_title_preview_iv));
        design_couple_title_back_iv = ((Button) hasViews.findViewById(id.design_couple_title_back_iv));
        design_bottom_pattern_iv = ((ImageView) hasViews.findViewById(id.design_bottom_pattern_iv));
        design_couple_title_female_front_iv = ((Button) hasViews.findViewById(id.design_couple_title_female_front_iv));
        design_bottom_camera_iv = ((ImageView) hasViews.findViewById(id.design_bottom_camera_iv));
        design_couple_title_male_front_iv = ((Button) hasViews.findViewById(id.design_couple_title_male_front_iv));
        design_bottom_detail_ll = ((LinearLayout) hasViews.findViewById(id.design_bottom_detail_ll));
        design_bottom_model_iv = ((ImageView) hasViews.findViewById(id.design_bottom_model_iv));
        design_bottom_word_iv = ((ImageView) hasViews.findViewById(id.design_bottom_word_iv));
        {
            View view = hasViews.findViewById(id.design_couple_title_male_back_iv);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DesignActivity_.this.design_couple_title_male_back_iv();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.design_couple_title_female_front_iv);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DesignActivity_.this.design_couple_title_female_front_iv();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.design_couple_title_female_back_iv);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DesignActivity_.this.design_couple_title_female_back_iv();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.design_couple_title_male_front_iv);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DesignActivity_.this.design_couple_title_male_front_iv();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.design_bottom_model_iv);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DesignActivity_.this.design_bottom_model_iv();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.design_bottom_operate_hide_iv);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DesignActivity_.this.design_bottom_operate_hide_iv();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.design_couple_title_preview_iv);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DesignActivity_.this.design_couple_title_preview_iv();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.design_title_preview_iv);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DesignActivity_.this.design_title_preview_iv();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.design_title_backward_iv);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DesignActivity_.this.design_title_backward_iv();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.design_bottom_camera_iv);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DesignActivity_.this.design_bottom_camera_iv();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.design_title_forward_iv);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DesignActivity_.this.design_title_forward_iv();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.design_take_photo_iv);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DesignActivity_.this.design_take_photo_iv();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.design_select_local_photo_iv);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DesignActivity_.this.design_select_local_photo_iv();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.design_bottom_word_iv);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DesignActivity_.this.design_bottom_word_iv();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.design_title_back_iv);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DesignActivity_.this.design_title_back_iv();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.design_bottom_background_iv);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DesignActivity_.this.design_bottom_background_iv();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.design_couple_title_back_iv);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DesignActivity_.this.design_couple_title_back_iv();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.design_bottom_pattern_iv);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DesignActivity_.this.design_bottom_pattern_iv();
                    }

                }
                );
            }
        }
        initData();
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;
        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, DesignActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            fragment_ = fragment;
            context_ = fragment.getActivity();
            intent_ = new Intent(context_, DesignActivity_.class);
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            fragmentSupport_ = fragment;
            context_ = fragment.getActivity();
            intent_ = new Intent(context_, DesignActivity_.class);
        }

        public Intent get() {
            return intent_;
        }

        public DesignActivity_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent_, requestCode);
            } else {
                if (fragment_!= null) {
                    fragment_.startActivityForResult(intent_, requestCode);
                } else {
                    if (context_ instanceof Activity) {
                        ((Activity) context_).startActivityForResult(intent_, requestCode);
                    } else {
                        context_.startActivity(intent_);
                    }
                }
            }
        }

    }

}
