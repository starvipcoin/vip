// Generated by view binder compiler. Do not edit!
package com.devlomi.fireapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.devlomi.fireapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowSentStickerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imgSentSticker;

  @NonNull
  public final ImageView messageStatImg;

  @NonNull
  public final ProgressBar progressSentSticker;

  @NonNull
  public final TextView tvTime;

  private RowSentStickerBinding(@NonNull LinearLayout rootView, @NonNull ImageView imgSentSticker,
      @NonNull ImageView messageStatImg, @NonNull ProgressBar progressSentSticker,
      @NonNull TextView tvTime) {
    this.rootView = rootView;
    this.imgSentSticker = imgSentSticker;
    this.messageStatImg = messageStatImg;
    this.progressSentSticker = progressSentSticker;
    this.tvTime = tvTime;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowSentStickerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowSentStickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_sent_sticker, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowSentStickerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_sent_sticker;
      ImageView imgSentSticker = ViewBindings.findChildViewById(rootView, id);
      if (imgSentSticker == null) {
        break missingId;
      }

      id = R.id.message_stat_img;
      ImageView messageStatImg = ViewBindings.findChildViewById(rootView, id);
      if (messageStatImg == null) {
        break missingId;
      }

      id = R.id.progress_sent_sticker;
      ProgressBar progressSentSticker = ViewBindings.findChildViewById(rootView, id);
      if (progressSentSticker == null) {
        break missingId;
      }

      id = R.id.tv_time;
      TextView tvTime = ViewBindings.findChildViewById(rootView, id);
      if (tvTime == null) {
        break missingId;
      }

      return new RowSentStickerBinding((LinearLayout) rootView, imgSentSticker, messageStatImg,
          progressSentSticker, tvTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
