// Generated by view binder compiler. Do not edit!
package com.devlomi.fireapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.devlomi.fireapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AcceptInviteBottomSheetBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnCancel;

  @NonNull
  public final Button btnJoinGroup;

  @NonNull
  public final Group cgroupFetching;

  @NonNull
  public final Group cgroupGroupInfo;

  @NonNull
  public final ImageView imgGroupIcon;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView rv;

  @NonNull
  public final TextView tvFetchingGroup;

  @NonNull
  public final TextView tvGroupCreator;

  @NonNull
  public final TextView tvGroupName;

  @NonNull
  public final TextView tvParticipantsCount;

  private AcceptInviteBottomSheetBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnCancel, @NonNull Button btnJoinGroup, @NonNull Group cgroupFetching,
      @NonNull Group cgroupGroupInfo, @NonNull ImageView imgGroupIcon,
      @NonNull ProgressBar progressBar, @NonNull RecyclerView rv, @NonNull TextView tvFetchingGroup,
      @NonNull TextView tvGroupCreator, @NonNull TextView tvGroupName,
      @NonNull TextView tvParticipantsCount) {
    this.rootView = rootView;
    this.btnCancel = btnCancel;
    this.btnJoinGroup = btnJoinGroup;
    this.cgroupFetching = cgroupFetching;
    this.cgroupGroupInfo = cgroupGroupInfo;
    this.imgGroupIcon = imgGroupIcon;
    this.progressBar = progressBar;
    this.rv = rv;
    this.tvFetchingGroup = tvFetchingGroup;
    this.tvGroupCreator = tvGroupCreator;
    this.tvGroupName = tvGroupName;
    this.tvParticipantsCount = tvParticipantsCount;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AcceptInviteBottomSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AcceptInviteBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.accept_invite_bottom_sheet, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AcceptInviteBottomSheetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_cancel;
      Button btnCancel = ViewBindings.findChildViewById(rootView, id);
      if (btnCancel == null) {
        break missingId;
      }

      id = R.id.btn_join_group;
      Button btnJoinGroup = ViewBindings.findChildViewById(rootView, id);
      if (btnJoinGroup == null) {
        break missingId;
      }

      id = R.id.cgroup_fetching;
      Group cgroupFetching = ViewBindings.findChildViewById(rootView, id);
      if (cgroupFetching == null) {
        break missingId;
      }

      id = R.id.cgroup_group_info;
      Group cgroupGroupInfo = ViewBindings.findChildViewById(rootView, id);
      if (cgroupGroupInfo == null) {
        break missingId;
      }

      id = R.id.img_group_icon;
      ImageView imgGroupIcon = ViewBindings.findChildViewById(rootView, id);
      if (imgGroupIcon == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.rv;
      RecyclerView rv = ViewBindings.findChildViewById(rootView, id);
      if (rv == null) {
        break missingId;
      }

      id = R.id.tv_fetching_group;
      TextView tvFetchingGroup = ViewBindings.findChildViewById(rootView, id);
      if (tvFetchingGroup == null) {
        break missingId;
      }

      id = R.id.tv_group_creator;
      TextView tvGroupCreator = ViewBindings.findChildViewById(rootView, id);
      if (tvGroupCreator == null) {
        break missingId;
      }

      id = R.id.tv_group_name;
      TextView tvGroupName = ViewBindings.findChildViewById(rootView, id);
      if (tvGroupName == null) {
        break missingId;
      }

      id = R.id.tv_participants_count;
      TextView tvParticipantsCount = ViewBindings.findChildViewById(rootView, id);
      if (tvParticipantsCount == null) {
        break missingId;
      }

      return new AcceptInviteBottomSheetBinding((ConstraintLayout) rootView, btnCancel,
          btnJoinGroup, cgroupFetching, cgroupGroupInfo, imgGroupIcon, progressBar, rv,
          tvFetchingGroup, tvGroupCreator, tvGroupName, tvParticipantsCount);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
