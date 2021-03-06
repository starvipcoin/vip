// Generated by view binder compiler. Do not edit!
package com.devlomi.fireapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.devlomi.fireapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNewGroupBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView_;

  @NonNull
  public final FloatingActionButton fabNext;

  @NonNull
  public final CoordinatorLayout rootView;

  @NonNull
  public final RecyclerView rvGroup;

  @NonNull
  public final RecyclerView rvSelectedUsersNewGroup;

  @NonNull
  public final Toolbar toolbarForward;

  @NonNull
  public final TextView toolbarTitle;

  @NonNull
  public final TextView tvAddParticipantsTvToolbar;

  private ActivityNewGroupBinding(@NonNull CoordinatorLayout rootView_,
      @NonNull FloatingActionButton fabNext, @NonNull CoordinatorLayout rootView,
      @NonNull RecyclerView rvGroup, @NonNull RecyclerView rvSelectedUsersNewGroup,
      @NonNull Toolbar toolbarForward, @NonNull TextView toolbarTitle,
      @NonNull TextView tvAddParticipantsTvToolbar) {
    this.rootView_ = rootView_;
    this.fabNext = fabNext;
    this.rootView = rootView;
    this.rvGroup = rvGroup;
    this.rvSelectedUsersNewGroup = rvSelectedUsersNewGroup;
    this.toolbarForward = toolbarForward;
    this.toolbarTitle = toolbarTitle;
    this.tvAddParticipantsTvToolbar = tvAddParticipantsTvToolbar;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView_;
  }

  @NonNull
  public static ActivityNewGroupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNewGroupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_new_group, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNewGroupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fab_next;
      FloatingActionButton fabNext = ViewBindings.findChildViewById(rootView, id);
      if (fabNext == null) {
        break missingId;
      }

      CoordinatorLayout rootView_ = (CoordinatorLayout) rootView;

      id = R.id.rv_group;
      RecyclerView rvGroup = ViewBindings.findChildViewById(rootView, id);
      if (rvGroup == null) {
        break missingId;
      }

      id = R.id.rv_selected_users_new_group;
      RecyclerView rvSelectedUsersNewGroup = ViewBindings.findChildViewById(rootView, id);
      if (rvSelectedUsersNewGroup == null) {
        break missingId;
      }

      id = R.id.toolbar_forward;
      Toolbar toolbarForward = ViewBindings.findChildViewById(rootView, id);
      if (toolbarForward == null) {
        break missingId;
      }

      id = R.id.toolbar_title;
      TextView toolbarTitle = ViewBindings.findChildViewById(rootView, id);
      if (toolbarTitle == null) {
        break missingId;
      }

      id = R.id.tv_add_participants_tv_toolbar;
      TextView tvAddParticipantsTvToolbar = ViewBindings.findChildViewById(rootView, id);
      if (tvAddParticipantsTvToolbar == null) {
        break missingId;
      }

      return new ActivityNewGroupBinding((CoordinatorLayout) rootView, fabNext, rootView_, rvGroup,
          rvSelectedUsersNewGroup, toolbarForward, toolbarTitle, tvAddParticipantsTvToolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
