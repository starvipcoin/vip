// Generated by view binder compiler. Do not edit!
package com.devlomi.fireapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.devlomi.fireapp.R;
import com.google.android.gms.ads.AdView;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNewChatBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final AdView adView;

  @NonNull
  public final AppBarLayout appBar;

  @NonNull
  public final Button btnInvite;

  @NonNull
  public final LinearLayout noContactsContainer;

  @NonNull
  public final ProgressBar progressBarSync;

  @NonNull
  public final LinearLayout recyclerContainer;

  @NonNull
  public final ImageButton refreshContactsBtn;

  @NonNull
  public final RecyclerView rvNewChat;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView tvNoContacts;

  private ActivityNewChatBinding(@NonNull RelativeLayout rootView, @NonNull AdView adView,
      @NonNull AppBarLayout appBar, @NonNull Button btnInvite,
      @NonNull LinearLayout noContactsContainer, @NonNull ProgressBar progressBarSync,
      @NonNull LinearLayout recyclerContainer, @NonNull ImageButton refreshContactsBtn,
      @NonNull RecyclerView rvNewChat, @NonNull Toolbar toolbar, @NonNull TextView tvNoContacts) {
    this.rootView = rootView;
    this.adView = adView;
    this.appBar = appBar;
    this.btnInvite = btnInvite;
    this.noContactsContainer = noContactsContainer;
    this.progressBarSync = progressBarSync;
    this.recyclerContainer = recyclerContainer;
    this.refreshContactsBtn = refreshContactsBtn;
    this.rvNewChat = rvNewChat;
    this.toolbar = toolbar;
    this.tvNoContacts = tvNoContacts;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNewChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNewChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_new_chat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNewChatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ad_view;
      AdView adView = ViewBindings.findChildViewById(rootView, id);
      if (adView == null) {
        break missingId;
      }

      id = R.id.app_bar;
      AppBarLayout appBar = ViewBindings.findChildViewById(rootView, id);
      if (appBar == null) {
        break missingId;
      }

      id = R.id.btn_invite;
      Button btnInvite = ViewBindings.findChildViewById(rootView, id);
      if (btnInvite == null) {
        break missingId;
      }

      id = R.id.no_contacts_container;
      LinearLayout noContactsContainer = ViewBindings.findChildViewById(rootView, id);
      if (noContactsContainer == null) {
        break missingId;
      }

      id = R.id.progress_bar_sync;
      ProgressBar progressBarSync = ViewBindings.findChildViewById(rootView, id);
      if (progressBarSync == null) {
        break missingId;
      }

      id = R.id.recycler_container;
      LinearLayout recyclerContainer = ViewBindings.findChildViewById(rootView, id);
      if (recyclerContainer == null) {
        break missingId;
      }

      id = R.id.refresh_contacts_btn;
      ImageButton refreshContactsBtn = ViewBindings.findChildViewById(rootView, id);
      if (refreshContactsBtn == null) {
        break missingId;
      }

      id = R.id.rv_new_chat;
      RecyclerView rvNewChat = ViewBindings.findChildViewById(rootView, id);
      if (rvNewChat == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.tv_no_contacts;
      TextView tvNoContacts = ViewBindings.findChildViewById(rootView, id);
      if (tvNoContacts == null) {
        break missingId;
      }

      return new ActivityNewChatBinding((RelativeLayout) rootView, adView, appBar, btnInvite,
          noContactsContainer, progressBarSync, recyclerContainer, refreshContactsBtn, rvNewChat,
          toolbar, tvNoContacts);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
