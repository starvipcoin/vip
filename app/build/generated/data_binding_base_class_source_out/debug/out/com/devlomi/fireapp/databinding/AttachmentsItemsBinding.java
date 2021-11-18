// Generated by view binder compiler. Do not edit!
package com.devlomi.fireapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.devlomi.fireapp.R;
import io.codetail.widget.RevealFrameLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AttachmentsItemsBinding implements ViewBinding {
  @NonNull
  private final RevealFrameLayout rootView;

  @NonNull
  public final LinearLayout attachmentAudio;

  @NonNull
  public final LinearLayout attachmentCamera;

  @NonNull
  public final LinearLayout attachmentContact;

  @NonNull
  public final LinearLayout attachmentDocument;

  @NonNull
  public final LinearLayout attachmentGallery;

  @NonNull
  public final LinearLayout attachmentLocation;

  @NonNull
  public final CardView cardViewAttachments;

  @NonNull
  public final RevealFrameLayout revealLayout;

  private AttachmentsItemsBinding(@NonNull RevealFrameLayout rootView,
      @NonNull LinearLayout attachmentAudio, @NonNull LinearLayout attachmentCamera,
      @NonNull LinearLayout attachmentContact, @NonNull LinearLayout attachmentDocument,
      @NonNull LinearLayout attachmentGallery, @NonNull LinearLayout attachmentLocation,
      @NonNull CardView cardViewAttachments, @NonNull RevealFrameLayout revealLayout) {
    this.rootView = rootView;
    this.attachmentAudio = attachmentAudio;
    this.attachmentCamera = attachmentCamera;
    this.attachmentContact = attachmentContact;
    this.attachmentDocument = attachmentDocument;
    this.attachmentGallery = attachmentGallery;
    this.attachmentLocation = attachmentLocation;
    this.cardViewAttachments = cardViewAttachments;
    this.revealLayout = revealLayout;
  }

  @Override
  @NonNull
  public RevealFrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AttachmentsItemsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AttachmentsItemsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.attachments_items, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AttachmentsItemsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.attachment_audio;
      LinearLayout attachmentAudio = ViewBindings.findChildViewById(rootView, id);
      if (attachmentAudio == null) {
        break missingId;
      }

      id = R.id.attachment_camera;
      LinearLayout attachmentCamera = ViewBindings.findChildViewById(rootView, id);
      if (attachmentCamera == null) {
        break missingId;
      }

      id = R.id.attachment_contact;
      LinearLayout attachmentContact = ViewBindings.findChildViewById(rootView, id);
      if (attachmentContact == null) {
        break missingId;
      }

      id = R.id.attachment_document;
      LinearLayout attachmentDocument = ViewBindings.findChildViewById(rootView, id);
      if (attachmentDocument == null) {
        break missingId;
      }

      id = R.id.attachment_gallery;
      LinearLayout attachmentGallery = ViewBindings.findChildViewById(rootView, id);
      if (attachmentGallery == null) {
        break missingId;
      }

      id = R.id.attachment_location;
      LinearLayout attachmentLocation = ViewBindings.findChildViewById(rootView, id);
      if (attachmentLocation == null) {
        break missingId;
      }

      id = R.id.card_view_attachments;
      CardView cardViewAttachments = ViewBindings.findChildViewById(rootView, id);
      if (cardViewAttachments == null) {
        break missingId;
      }

      RevealFrameLayout revealLayout = (RevealFrameLayout) rootView;

      return new AttachmentsItemsBinding((RevealFrameLayout) rootView, attachmentAudio,
          attachmentCamera, attachmentContact, attachmentDocument, attachmentGallery,
          attachmentLocation, cardViewAttachments, revealLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
