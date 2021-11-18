// Generated by view binder compiler. Do not edit!
package com.devlomi.fireapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.devlomi.fireapp.R;
import com.google.android.gms.maps.MapView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowSentLocationBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final LinearLayout addressLayout;

  @NonNull
  public final CardView container;

  @NonNull
  public final MapView mapView;

  @NonNull
  public final ImageView messageStatImg;

  @NonNull
  public final TextView placeAddress;

  @NonNull
  public final TextView placeName;

  @NonNull
  public final TextView tvTime;

  private RowSentLocationBinding(@NonNull FrameLayout rootView, @NonNull LinearLayout addressLayout,
      @NonNull CardView container, @NonNull MapView mapView, @NonNull ImageView messageStatImg,
      @NonNull TextView placeAddress, @NonNull TextView placeName, @NonNull TextView tvTime) {
    this.rootView = rootView;
    this.addressLayout = addressLayout;
    this.container = container;
    this.mapView = mapView;
    this.messageStatImg = messageStatImg;
    this.placeAddress = placeAddress;
    this.placeName = placeName;
    this.tvTime = tvTime;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowSentLocationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowSentLocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_sent_location, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowSentLocationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.address_layout;
      LinearLayout addressLayout = ViewBindings.findChildViewById(rootView, id);
      if (addressLayout == null) {
        break missingId;
      }

      id = R.id.container;
      CardView container = ViewBindings.findChildViewById(rootView, id);
      if (container == null) {
        break missingId;
      }

      id = R.id.map_view;
      MapView mapView = ViewBindings.findChildViewById(rootView, id);
      if (mapView == null) {
        break missingId;
      }

      id = R.id.message_stat_img;
      ImageView messageStatImg = ViewBindings.findChildViewById(rootView, id);
      if (messageStatImg == null) {
        break missingId;
      }

      id = R.id.place_address;
      TextView placeAddress = ViewBindings.findChildViewById(rootView, id);
      if (placeAddress == null) {
        break missingId;
      }

      id = R.id.place_name;
      TextView placeName = ViewBindings.findChildViewById(rootView, id);
      if (placeName == null) {
        break missingId;
      }

      id = R.id.tv_time;
      TextView tvTime = ViewBindings.findChildViewById(rootView, id);
      if (tvTime == null) {
        break missingId;
      }

      return new RowSentLocationBinding((FrameLayout) rootView, addressLayout, container, mapView,
          messageStatImg, placeAddress, placeName, tvTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
