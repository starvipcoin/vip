// Generated by view binder compiler. Do not edit!
package com.devlomi.fireapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.devlomi.fireapp.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowContactPickerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CircleImageView imgContactPick;

  @NonNull
  public final RelativeLayout rlv;

  @NonNull
  public final TextView tvContactNamePick;

  private RowContactPickerBinding(@NonNull LinearLayout rootView,
      @NonNull CircleImageView imgContactPick, @NonNull RelativeLayout rlv,
      @NonNull TextView tvContactNamePick) {
    this.rootView = rootView;
    this.imgContactPick = imgContactPick;
    this.rlv = rlv;
    this.tvContactNamePick = tvContactNamePick;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowContactPickerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowContactPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_contact_picker, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowContactPickerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_contact_pick;
      CircleImageView imgContactPick = ViewBindings.findChildViewById(rootView, id);
      if (imgContactPick == null) {
        break missingId;
      }

      id = R.id.rlv;
      RelativeLayout rlv = ViewBindings.findChildViewById(rootView, id);
      if (rlv == null) {
        break missingId;
      }

      id = R.id.tv_contact_name_pick;
      TextView tvContactNamePick = ViewBindings.findChildViewById(rootView, id);
      if (tvContactNamePick == null) {
        break missingId;
      }

      return new RowContactPickerBinding((LinearLayout) rootView, imgContactPick, rlv,
          tvContactNamePick);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}