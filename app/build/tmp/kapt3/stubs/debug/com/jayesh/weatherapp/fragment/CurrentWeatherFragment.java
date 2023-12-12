package com.jayesh.weatherapp.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010D2\b\u0010E\u001a\u0004\u0018\u00010DH\u0002J&\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010K2\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\u0012\u0010N\u001a\u00020B2\b\u0010O\u001a\u0004\u0018\u00010PH\u0003R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0004R\u001a\u0010 \u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010#\"\u0004\b(\u0010%R\u001a\u0010)\u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\u001a\u0010,\u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010#\"\u0004\b.\u0010%R\u001a\u0010/\u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R\u001a\u00102\u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010#\"\u0004\b4\u0010%R\u001a\u00105\u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010#\"\u0004\b7\u0010%R\u001a\u00108\u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010#\"\u0004\b:\u0010%R\u001a\u0010;\u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010#\"\u0004\b=\u0010%R\u001a\u0010>\u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010#\"\u0004\b@\u0010%\u00a8\u0006Q"}, d2 = {"Lcom/jayesh/weatherapp/fragment/CurrentWeatherFragment;", "Landroidx/fragment/app/Fragment;", "status", "", "(Z)V", "llCurrentLayout", "Landroid/widget/LinearLayout;", "getLlCurrentLayout", "()Landroid/widget/LinearLayout;", "setLlCurrentLayout", "(Landroid/widget/LinearLayout;)V", "mToolbar", "Lcom/google/android/material/appbar/MaterialToolbar;", "getMToolbar", "()Lcom/google/android/material/appbar/MaterialToolbar;", "setMToolbar", "(Lcom/google/android/material/appbar/MaterialToolbar;)V", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBar", "(Landroid/widget/ProgressBar;)V", "progressBarLayout", "Landroid/widget/RelativeLayout;", "getProgressBarLayout", "()Landroid/widget/RelativeLayout;", "setProgressBarLayout", "(Landroid/widget/RelativeLayout;)V", "getStatus", "()Z", "setStatus", "txtCity", "Landroid/widget/TextView;", "getTxtCity", "()Landroid/widget/TextView;", "setTxtCity", "(Landroid/widget/TextView;)V", "txtFeelsLike", "getTxtFeelsLike", "setTxtFeelsLike", "txtHumidity", "getTxtHumidity", "setTxtHumidity", "txtMaxTemp", "getTxtMaxTemp", "setTxtMaxTemp", "txtMinTemp", "getTxtMinTemp", "setTxtMinTemp", "txtPressure", "getTxtPressure", "setTxtPressure", "txtTemperature", "getTxtTemperature", "setTxtTemperature", "txtVisibility", "getTxtVisibility", "setTxtVisibility", "txtWeatherInfo", "getTxtWeatherInfo", "setTxtWeatherInfo", "txtWind", "getTxtWind", "setTxtWind", "getJson", "", "lat", "", "long", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setValues", "response", "Lorg/json/JSONObject;", "app_debug"})
public final class CurrentWeatherFragment extends androidx.fragment.app.Fragment {
    private boolean status;
    public com.google.android.material.appbar.MaterialToolbar mToolbar;
    public android.widget.TextView txtTemperature;
    public android.widget.TextView txtWeatherInfo;
    public android.widget.TextView txtMinTemp;
    public android.widget.TextView txtMaxTemp;
    public android.widget.TextView txtPressure;
    public android.widget.TextView txtHumidity;
    public android.widget.TextView txtWind;
    public android.widget.TextView txtVisibility;
    public android.widget.TextView txtCity;
    public android.widget.TextView txtFeelsLike;
    public android.widget.RelativeLayout progressBarLayout;
    public android.widget.ProgressBar progressBar;
    public android.widget.LinearLayout llCurrentLayout;
    
    public CurrentWeatherFragment(boolean status) {
        super();
    }
    
    public final boolean getStatus() {
        return false;
    }
    
    public final void setStatus(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.material.appbar.MaterialToolbar getMToolbar() {
        return null;
    }
    
    public final void setMToolbar(@org.jetbrains.annotations.NotNull
    com.google.android.material.appbar.MaterialToolbar p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTxtTemperature() {
        return null;
    }
    
    public final void setTxtTemperature(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTxtWeatherInfo() {
        return null;
    }
    
    public final void setTxtWeatherInfo(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTxtMinTemp() {
        return null;
    }
    
    public final void setTxtMinTemp(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTxtMaxTemp() {
        return null;
    }
    
    public final void setTxtMaxTemp(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTxtPressure() {
        return null;
    }
    
    public final void setTxtPressure(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTxtHumidity() {
        return null;
    }
    
    public final void setTxtHumidity(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTxtWind() {
        return null;
    }
    
    public final void setTxtWind(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTxtVisibility() {
        return null;
    }
    
    public final void setTxtVisibility(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTxtCity() {
        return null;
    }
    
    public final void setTxtCity(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTxtFeelsLike() {
        return null;
    }
    
    public final void setTxtFeelsLike(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.RelativeLayout getProgressBarLayout() {
        return null;
    }
    
    public final void setProgressBarLayout(@org.jetbrains.annotations.NotNull
    android.widget.RelativeLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.ProgressBar getProgressBar() {
        return null;
    }
    
    public final void setProgressBar(@org.jetbrains.annotations.NotNull
    android.widget.ProgressBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.LinearLayout getLlCurrentLayout() {
        return null;
    }
    
    public final void setLlCurrentLayout(@org.jetbrains.annotations.NotNull
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void getJson(java.lang.String lat, java.lang.String p1_1663806) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void setValues(org.json.JSONObject response) {
    }
}