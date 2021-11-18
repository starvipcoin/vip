// Generated by view binder compiler. Do not edit!
package com.devlomi.fireapp.databinding;

import ak.sh.ay.musicwave.MusicWave;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.devlomi.fireapp.R;
import com.devlomi.fireapp.views.DevlomiSeekbar;
import com.devlomi.fireapp.views.backgroundtintlayouts.LinearLayoutWithBackgroundTint;
import com.github.abdularis.buttonprogress.DownloadButtonProgress;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowSentAudioBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final LinearLayoutWithBackgroundTint container;

  @NonNull
  public final FrameLayout frameLayoutAudioInfo;

  @NonNull
  public final ImageView imgHeadset;

  @NonNull
  public final ImageView messageStatImg;

  @NonNull
  public final DownloadButtonProgress progressButton;

  @NonNull
  public final TextView tvAudioSize;

  @NonNull
  public final TextView tvDuration;

  @NonNull
  public final TextView tvTime;

  @NonNull
  public final ImageView voicePlayBtn;

  @NonNull
  public final DevlomiSeekbar voiceSeekbar;

  @NonNull
  public final MusicWave waveView;

  private RowSentAudioBinding(@NonNull FrameLayout rootView,
      @NonNull LinearLayoutWithBackgroundTint container, @NonNull FrameLayout frameLayoutAudioInfo,
      @NonNull ImageView imgHeadset, @NonNull ImageView messageStatImg,
      @NonNull DownloadButtonProgress progressButton, @NonNull TextView tvAudioSize,
      @NonNull TextView tvDuration, @NonNull TextView tvTime, @NonNull ImageView voicePlayBtn,
      @NonNull DevlomiSeekbar voiceSeekbar, @NonNull MusicWave waveView) {
    this.rootView = rootView;
    this.container = container;
    this.frameLayoutAudioInfo = frameLayoutAudioInfo;
    this.imgHeadset = imgHeadset;
    this.messageStatImg = messageStatImg;
    this.progressButton = progressButton;
    this.tvAudioSize = tvAudioSize;
    this.tvDuration = tvDuration;
    this.tvTime = tvTime;
    this.voicePlayBtn = voicePlayBtn;
    this.voiceSeekbar = voiceSeekbar;
    this.waveView = waveView;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowSentAudioBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowSentAudioBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_sent_audio, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowSentAudioBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.container;
      LinearLayoutWithBackgroundTint container = ViewBindings.findChildViewById(rootView, id);
      if (container == null) {
        break missingId;
      }

      id = R.id.frame_layout_audio_info;
      FrameLayout frameLayoutAudioInfo = ViewBindings.findChildViewById(rootView, id);
      if (frameLayoutAudioInfo == null) {
        break missingId;
      }

      id = R.id.img_headset;
      ImageView imgHeadset = ViewBindings.findChildViewById(rootView, id);
      if (imgHeadset == null) {
        break missingId;
      }

      id = R.id.message_stat_img;
      ImageView messageStatImg = ViewBindings.findChildViewById(rootView, id);
      if (messageStatImg == null) {
        break missingId;
      }

      id = R.id.progress_button;
      DownloadButtonProgress progressButton = ViewBindings.findChildViewById(rootView, id);
      if (progressButton == null) {
        break missingId;
      }

      id = R.id.tv_audio_size;
      TextView tvAudioSize = ViewBindings.findChildViewById(rootView, id);
      if (tvAudioSize == null) {
        break missingId;
      }

      id = R.id.tv_duration;
      TextView tvDuration = ViewBindings.findChildViewById(rootView, id);
      if (tvDuration == null) {
        break missingId;
      }

      id = R.id.tv_time;
      TextView tvTime = ViewBindings.findChildViewById(rootView, id);
      if (tvTime == null) {
        break missingId;
      }

      id = R.id.voice_play_btn;
      ImageView voicePlayBtn = ViewBindings.findChildViewById(rootView, id);
      if (voicePlayBtn == null) {
        break missingId;
      }

      id = R.id.voice_seekbar;
      DevlomiSeekbar voiceSeekbar = ViewBindings.findChildViewById(rootView, id);
      if (voiceSeekbar == null) {
        break missingId;
      }

      id = R.id.wave_view;
      MusicWave waveView = ViewBindings.findChildViewById(rootView, id);
      if (waveView == null) {
        break missingId;
      }

      return new RowSentAudioBinding((FrameLayout) rootView, container, frameLayoutAudioInfo,
          imgHeadset, messageStatImg, progressButton, tvAudioSize, tvDuration, tvTime, voicePlayBtn,
          voiceSeekbar, waveView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
