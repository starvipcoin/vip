// Generated by view binder compiler. Do not edit!
package com.devlomi.fireapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.devlomi.fireapp.R;
import com.devlomi.fireapp.views.IgnoreBottomInsetFrameLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFullscreenBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final IgnoreBottomInsetFrameLayout appbar;

  @NonNull
  public final LinearLayout appbarWrapper;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView toolbarName;

  @NonNull
  public final TextView toolbarTime;

  @NonNull
  public final ViewPager viewPager;

  private ActivityFullscreenBinding(@NonNull View rootView,
      @NonNull IgnoreBottomInsetFrameLayout appbar, @NonNull LinearLayout appbarWrapper,
      @NonNull Toolbar toolbar, @NonNull TextView toolbarName, @NonNull TextView toolbarTime,
      @NonNull ViewPager viewPager) {
    this.rootView = rootView;
    this.appbar = appbar;
    this.appbarWrapper = appbarWrapper;
    this.toolbar = toolbar;
    this.toolbarName = toolbarName;
    this.toolbarTime = toolbarTime;
    this.viewPager = viewPager;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFullscreenBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.activity_fullscreen, parent);
    return bind(parent);
  }

  @NonNull
  public static ActivityFullscreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appbar;
      IgnoreBottomInsetFrameLayout appbar = ViewBindings.findChildViewById(rootView, id);
      if (appbar == null) {
        break missingId;
      }

      id = R.id.appbar_wrapper;
      LinearLayout appbarWrapper = ViewBindings.findChildViewById(rootView, id);
      if (appbarWrapper == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.toolbar_name;
      TextView toolbarName = ViewBindings.findChildViewById(rootView, id);
      if (toolbarName == null) {
        break missingId;
      }

      id = R.id.toolbar_time;
      TextView toolbarTime = ViewBindings.findChildViewById(rootView, id);
      if (toolbarTime == null) {
        break missingId;
      }

      id = R.id.view_pager;
      ViewPager viewPager = ViewBindings.findChildViewById(rootView, id);
      if (viewPager == null) {
        break missingId;
      }

      return new ActivityFullscreenBinding(rootView, appbar, appbarWrapper, toolbar, toolbarName,
          toolbarTime, viewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
