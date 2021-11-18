// Generated by view binder compiler. Do not edit!
package com.devlomi.fireapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.devlomi.fireapp.R;
import com.devlomi.fireapp.views.AnimButton;
import com.devlomi.fireapp.views.AttachmentView;
import com.devlomi.record_view.RecordView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ReplyStatusBottomsheetBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AttachmentView attachmentView;

  @NonNull
  public final LinearLayout bottomSheetReplyStatus;

  @NonNull
  public final AnimButton recordButton;

  @NonNull
  public final RecordView recordView;

  @NonNull
  public final ImageView replyArrowUp;

  @NonNull
  public final TextView tvReply;

  @NonNull
  public final ConstraintLayout typingLayoutContainer;

  private ReplyStatusBottomsheetBinding(@NonNull LinearLayout rootView,
      @NonNull AttachmentView attachmentView, @NonNull LinearLayout bottomSheetReplyStatus,
      @NonNull AnimButton recordButton, @NonNull RecordView recordView,
      @NonNull ImageView replyArrowUp, @NonNull TextView tvReply,
      @NonNull ConstraintLayout typingLayoutContainer) {
    this.rootView = rootView;
    this.attachmentView = attachmentView;
    this.bottomSheetReplyStatus = bottomSheetReplyStatus;
    this.recordButton = recordButton;
    this.recordView = recordView;
    this.replyArrowUp = replyArrowUp;
    this.tvReply = tvReply;
    this.typingLayoutContainer = typingLayoutContainer;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ReplyStatusBottomsheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReplyStatusBottomsheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.reply_status_bottomsheet, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReplyStatusBottomsheetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.attachment_view;
      AttachmentView attachmentView = ViewBindings.findChildViewById(rootView, id);
      if (attachmentView == null) {
        break missingId;
      }

      LinearLayout bottomSheetReplyStatus = (LinearLayout) rootView;

      id = R.id.record_button;
      AnimButton recordButton = ViewBindings.findChildViewById(rootView, id);
      if (recordButton == null) {
        break missingId;
      }

      id = R.id.record_view;
      RecordView recordView = ViewBindings.findChildViewById(rootView, id);
      if (recordView == null) {
        break missingId;
      }

      id = R.id.reply_arrow_up;
      ImageView replyArrowUp = ViewBindings.findChildViewById(rootView, id);
      if (replyArrowUp == null) {
        break missingId;
      }

      id = R.id.tv_reply;
      TextView tvReply = ViewBindings.findChildViewById(rootView, id);
      if (tvReply == null) {
        break missingId;
      }

      id = R.id.typing_layout_container;
      ConstraintLayout typingLayoutContainer = ViewBindings.findChildViewById(rootView, id);
      if (typingLayoutContainer == null) {
        break missingId;
      }

      return new ReplyStatusBottomsheetBinding((LinearLayout) rootView, attachmentView,
          bottomSheetReplyStatus, recordButton, recordView, replyArrowUp, tvReply,
          typingLayoutContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}