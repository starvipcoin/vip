// Generated by view binder compiler. Do not edit!
package com.devlomi.fireapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.devlomi.fireapp.R;
import com.google.android.gms.ads.AdView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentStatusBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AdView adView;

  @NonNull
  public final CardView myStatus;

  @NonNull
  public final RecyclerView rvStatus;

  private FragmentStatusBinding(@NonNull LinearLayout rootView, @NonNull AdView adView,
      @NonNull CardView myStatus, @NonNull RecyclerView rvStatus) {
    this.rootView = rootView;
    this.adView = adView;
    this.myStatus = myStatus;
    this.rvStatus = rvStatus;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentStatusBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentStatusBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_status, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentStatusBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ad_view;
      AdView adView = ViewBindings.findChildViewById(rootView, id);
      if (adView == null) {
        break missingId;
      }

      id = R.id.my_status;
      CardView myStatus = ViewBindings.findChildViewById(rootView, id);
      if (myStatus == null) {
        break missingId;
      }

      id = R.id.rv_status;
      RecyclerView rvStatus = ViewBindings.findChildViewById(rootView, id);
      if (rvStatus == null) {
        break missingId;
      }

      return new FragmentStatusBinding((LinearLayout) rootView, adView, myStatus, rvStatus);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
