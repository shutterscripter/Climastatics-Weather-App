package com.jayesh.weatherapp.activity;

import java.lang.System;

@android.annotation.SuppressLint(value = {"CustomSplashScreen"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0003J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J-\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u000e2\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016\u00a2\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/jayesh/weatherapp/activity/SplashScreen;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "exitTime", "", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "mFusedLocation", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getMFusedLocation", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setMFusedLocation", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "secreteRequestCode", "", "LocationEnable", "", "checkPermission", "getLastLocation", "", "newLocation", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestPermission", "app_debug"})
public final class SplashScreen extends androidx.appcompat.app.AppCompatActivity {
    private final long exitTime = 4000L;
    private int secreteRequestCode = 194018;
    public com.google.android.gms.location.FusedLocationProviderClient mFusedLocation;
    private com.google.android.gms.location.LocationCallback locationCallback;
    
    public SplashScreen() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.gms.location.FusedLocationProviderClient getMFusedLocation() {
        return null;
    }
    
    public final void setMFusedLocation(@org.jetbrains.annotations.NotNull
    com.google.android.gms.location.FusedLocationProviderClient p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getLastLocation() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void newLocation() {
    }
    
    private final boolean LocationEnable() {
        return false;
    }
    
    private final void requestPermission() {
    }
    
    private final boolean checkPermission() {
        return false;
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
}