package com.jayesh.weatherapp.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010K\u001a\u00020L2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010M\u001a\u00020L2\b\u0010N\u001a\u0004\u0018\u00010OH\u0014J\b\u0010P\u001a\u00020LH\u0002J\u0012\u0010Q\u001a\u00020L2\b\u0010R\u001a\u0004\u0018\u00010SH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\u001a\u00100\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R\u001a\u00103\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010*\"\u0004\b5\u0010,R\u001a\u00106\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,R\u001a\u00109\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010*\"\u0004\b;\u0010,R\u001a\u0010<\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010*\"\u0004\b>\u0010,R\u001a\u0010?\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010*\"\u0004\bA\u0010,R\u001a\u0010B\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010*\"\u0004\bD\u0010,R\u001a\u0010E\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010*\"\u0004\bG\u0010,R\u001a\u0010H\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010*\"\u0004\bJ\u0010,\u00a8\u0006T"}, d2 = {"Lcom/jayesh/weatherapp/activity/SearchByCityActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "appbar", "Lcom/google/android/material/appbar/AppBarLayout;", "getAppbar", "()Lcom/google/android/material/appbar/AppBarLayout;", "setAppbar", "(Lcom/google/android/material/appbar/AppBarLayout;)V", "etSearch", "Landroid/widget/EditText;", "getEtSearch", "()Landroid/widget/EditText;", "setEtSearch", "(Landroid/widget/EditText;)V", "llMainLayout", "Landroid/widget/LinearLayout;", "getLlMainLayout", "()Landroid/widget/LinearLayout;", "setLlMainLayout", "(Landroid/widget/LinearLayout;)V", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBar", "(Landroid/widget/ProgressBar;)V", "progressBarLayout", "Landroid/widget/RelativeLayout;", "getProgressBarLayout", "()Landroid/widget/RelativeLayout;", "setProgressBarLayout", "(Landroid/widget/RelativeLayout;)V", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "setToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "txtCity", "Landroid/widget/TextView;", "getTxtCity", "()Landroid/widget/TextView;", "setTxtCity", "(Landroid/widget/TextView;)V", "txtFeelsLike", "getTxtFeelsLike", "setTxtFeelsLike", "txtHumidity", "getTxtHumidity", "setTxtHumidity", "txtInfoTime", "getTxtInfoTime", "setTxtInfoTime", "txtMaxTemp", "getTxtMaxTemp", "setTxtMaxTemp", "txtMinTemp", "getTxtMinTemp", "setTxtMinTemp", "txtPressure", "getTxtPressure", "setTxtPressure", "txtTemperature", "getTxtTemperature", "setTxtTemperature", "txtVisibility", "getTxtVisibility", "setTxtVisibility", "txtWeatherInfo", "getTxtWeatherInfo", "setTxtWeatherInfo", "txtWind", "getTxtWind", "setTxtWind", "getJson", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setUpToolbar", "setValues", "response", "Lorg/json/JSONObject;", "app_debug"})
public final class SearchByCityActivity extends androidx.appcompat.app.AppCompatActivity {
    public com.google.android.material.appbar.AppBarLayout appbar;
    public androidx.appcompat.widget.Toolbar toolbar;
    public android.widget.EditText etSearch;
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
    public android.widget.TextView txtInfoTime;
    public android.widget.RelativeLayout progressBarLayout;
    public android.widget.ProgressBar progressBar;
    public android.widget.LinearLayout llMainLayout;
    
    public SearchByCityActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.material.appbar.AppBarLayout getAppbar() {
        return null;
    }
    
    public final void setAppbar(@org.jetbrains.annotations.NotNull
    com.google.android.material.appbar.AppBarLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    public final void setToolbar(@org.jetbrains.annotations.NotNull
    androidx.appcompat.widget.Toolbar p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEtSearch() {
        return null;
    }
    
    public final void setEtSearch(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
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
    public final android.widget.TextView getTxtInfoTime() {
        return null;
    }
    
    public final void setTxtInfoTime(@org.jetbrains.annotations.NotNull
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
    public final android.widget.LinearLayout getLlMainLayout() {
        return null;
    }
    
    public final void setLlMainLayout(@org.jetbrains.annotations.NotNull
    android.widget.LinearLayout p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpToolbar() {
    }
    
    private final void getJson(android.widget.EditText etSearch) {
    }
    
    private final void setValues(org.json.JSONObject response) {
    }
}