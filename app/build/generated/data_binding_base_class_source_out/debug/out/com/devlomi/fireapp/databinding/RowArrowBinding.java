// Generated by view binder compiler. Do not edit!
package com.devlomi.fireapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.devlomi.fireapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowArrowBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageButton btnArrow;

  @NonNull
  public final FrameLayout layoutArrow;

  private RowArrowBinding(@NonNull FrameLayout rootView, @NonNull ImageButton btnArrow,
      @NonNull FrameLayout layoutArrow) {
    this.rootView = rootView;
    this.btnArrow = btnArrow;
    this.layoutArrow = layoutArrow;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowArrowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowArrowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_arrow, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowArrowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_arrow;
      ImageButton btnArrow = ViewBindings.findChildViewById(rootView, id);
      if (btnArrow == null) {
        break missingId;
      }

      FrameLayout layoutArrow = (FrameLayout) rootView;

      return new RowArrowBinding((FrameLayout) rootView, btnArrow, layoutArrow);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}