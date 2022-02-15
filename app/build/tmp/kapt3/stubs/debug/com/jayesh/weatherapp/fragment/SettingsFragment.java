package com.jayesh.weatherapp.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010(\u001a\u00020)H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000f\u00a8\u0006*"}, d2 = {"Lcom/jayesh/weatherapp/fragment/SettingsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "cvAbout", "Landroidx/cardview/widget/CardView;", "getCvAbout", "()Landroidx/cardview/widget/CardView;", "setCvAbout", "(Landroidx/cardview/widget/CardView;)V", "cvunit", "getCvunit", "setCvunit", "item", "", "", "[Ljava/lang/String;", "mToolbar", "Lcom/google/android/material/appbar/MaterialToolbar;", "getMToolbar", "()Lcom/google/android/material/appbar/MaterialToolbar;", "setMToolbar", "(Lcom/google/android/material/appbar/MaterialToolbar;)V", "selectedItem", "selectedItemIndex", "", "status", "", "getStatus", "()Z", "setStatus", "(Z)V", "themeItem", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "showRadioConfirmationDialog", "", "app_debug"})
public final class SettingsFragment extends androidx.fragment.app.Fragment {
    public com.google.android.material.appbar.MaterialToolbar mToolbar;
    public androidx.cardview.widget.CardView cvunit;
    public androidx.cardview.widget.CardView cvAbout;
    private java.lang.String selectedItem;
    private int selectedItemIndex = 0;
    private final java.lang.String[] item = {"Celsius", "Fahrenheit"};
    private boolean status = false;
    private final java.lang.String[] themeItem = {"Light", "Dark"};
    
    public SettingsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.appbar.MaterialToolbar getMToolbar() {
        return null;
    }
    
    public final void setMToolbar(@org.jetbrains.annotations.NotNull()
    com.google.android.material.appbar.MaterialToolbar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.cardview.widget.CardView getCvunit() {
        return null;
    }
    
    public final void setCvunit(@org.jetbrains.annotations.NotNull()
    androidx.cardview.widget.CardView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.cardview.widget.CardView getCvAbout() {
        return null;
    }
    
    public final void setCvAbout(@org.jetbrains.annotations.NotNull()
    androidx.cardview.widget.CardView p0) {
    }
    
    public final boolean getStatus() {
        return false;
    }
    
    public final void setStatus(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void showRadioConfirmationDialog() {
    }
}