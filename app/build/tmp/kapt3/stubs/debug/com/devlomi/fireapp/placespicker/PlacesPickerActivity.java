package com.devlomi.fireapp.placespicker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\"\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0018\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0011H\u0016J\u0012\u0010 \u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0017\u0010#\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010\nH\u0017\u00a2\u0006\u0002\b%J+\u0010&\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00062\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010*\u001a\u00020+H\u0016\u00a2\u0006\u0002\u0010,J\b\u0010-\u001a\u00020\u0015H\u0002J\u0014\u0010.\u001a\u00020\u00152\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/devlomi/fireapp/placespicker/PlacesPickerActivity;", "Lcom/devlomi/fireapp/placespicker/ScopedActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/devlomi/fireapp/placespicker/NearbyPlacesAdapter$OnClickListener;", "()V", "REQUEST_CODE_ASK_PERMISSIONS", "", "mAdapter", "Lcom/devlomi/fireapp/placespicker/NearbyPlacesAdapter;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "mMarker", "Lcom/google/android/gms/maps/model/Marker;", "markerOptions", "Lcom/google/android/gms/maps/model/MarkerOptions;", "places", "", "Lcom/devlomi/fireapp/placespicker/Place;", "viewModel", "Lcom/devlomi/fireapp/placespicker/PlacesPickerViewModel;", "checkPermissions", "", "enableGps", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "view", "Landroid/view/View;", "place", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "map", "onMapReady1", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "setupAdapter", "showDialog", "app_debug"})
public abstract class PlacesPickerActivity extends com.devlomi.fireapp.placespicker.ScopedActivity implements com.google.android.gms.maps.OnMapReadyCallback, com.devlomi.fireapp.placespicker.NearbyPlacesAdapter.OnClickListener {
    private com.devlomi.fireapp.placespicker.PlacesPickerViewModel viewModel;
    private com.google.android.gms.maps.GoogleMap mMap;
    private com.google.android.gms.maps.model.MarkerOptions markerOptions;
    private com.google.android.gms.maps.model.Marker mMarker;
    private final java.util.List<com.devlomi.fireapp.placespicker.Place> places = null;
    private com.devlomi.fireapp.placespicker.NearbyPlacesAdapter mAdapter;
    private final int REQUEST_CODE_ASK_PERMISSIONS = 1;
    private java.util.HashMap _$_findViewCache;
    
    public PlacesPickerActivity() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void enableGps() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.devlomi.fireapp.placespicker.Place place) {
    }
    
    private final void setupAdapter() {
    }
    
    private final void checkPermissions() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void showDialog(com.devlomi.fireapp.placespicker.Place place) {
    }
    
    @kotlin.jvm.JvmName(name = "onMapReady1")
    @kotlin.Suppress(names = {"INAPPLICABLE_JVM_NAME"})
    @java.lang.Override()
    public void onMapReady1(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap map) {
    }
}