// Generated by view binder compiler. Do not edit!
package com.devlomi.fireapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.devlomi.fireapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowPhoneNumberBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CheckedTextView checkTextViewNumber;

  private RowPhoneNumberBinding(@NonNull CardView rootView,
      @NonNull CheckedTextView checkTextViewNumber) {
    this.rootView = rootView;
    this.checkTextViewNumber = checkTextViewNumber;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static RowPhoneNumberBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowPhoneNumberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_phone_number, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowPhoneNumberBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.check_text_view_number;
      CheckedTextView checkTextViewNumber = ViewBindings.findChildViewById(rootView, id);
      if (checkTextViewNumber == null) {
        break missingId;
      }

      return new RowPhoneNumberBinding((CardView) rootView, checkTextViewNumber);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
