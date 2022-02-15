package com.jayesh.weatherapp.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0012\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010\u001fH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006*"}, d2 = {"Lcom/jayesh/weatherapp/fragment/HistoryFragment;", "Landroidx/fragment/app/Fragment;", "()V", "historyList", "Ljava/util/ArrayList;", "Lcom/jayesh/weatherapp/model/Weather;", "mToolbar", "Lcom/google/android/material/appbar/MaterialToolbar;", "getMToolbar", "()Lcom/google/android/material/appbar/MaterialToolbar;", "setMToolbar", "(Lcom/google/android/material/appbar/MaterialToolbar;)V", "recyclerWeather", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerWeather", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerWeather", "(Landroidx/recyclerview/widget/RecyclerView;)V", "rlHistory", "Landroid/widget/RelativeLayout;", "getRlHistory", "()Landroid/widget/RelativeLayout;", "setRlHistory", "(Landroid/widget/RelativeLayout;)V", "weatherAdapter", "Lcom/jayesh/weatherapp/adapter/WeatherAdapter;", "getWeatherAdapter", "()Lcom/jayesh/weatherapp/adapter/WeatherAdapter;", "setWeatherAdapter", "(Lcom/jayesh/weatherapp/adapter/WeatherAdapter;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setUpRecyclerView", "", "view", "weatherAsync", "app_debug"})
public final class HistoryFragment extends androidx.fragment.app.Fragment {
    public com.google.android.material.appbar.MaterialToolbar mToolbar;
    public androidx.recyclerview.widget.RecyclerView recyclerWeather;
    public com.jayesh.weatherapp.adapter.WeatherAdapter weatherAdapter;
    public android.widget.RelativeLayout rlHistory;
    private java.util.ArrayList<com.jayesh.weatherapp.model.Weather> historyList;
    
    public HistoryFragment() {
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
    public final androidx.recyclerview.widget.RecyclerView getRecyclerWeather() {
        return null;
    }
    
    public final void setRecyclerWeather(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jayesh.weatherapp.adapter.WeatherAdapter getWeatherAdapter() {
        return null;
    }
    
    public final void setWeatherAdapter(@org.jetbrains.annotations.NotNull()
    com.jayesh.weatherapp.adapter.WeatherAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RelativeLayout getRlHistory() {
        return null;
    }
    
    public final void setRlHistory(@org.jetbrains.annotations.NotNull()
    android.widget.RelativeLayout p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setUpRecyclerView(android.view.View view) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000e\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/jayesh/weatherapp/fragment/HistoryFragment$weatherAsync;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/jayesh/weatherapp/database/WeatherEntity;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "db", "Lcom/jayesh/weatherapp/database/WeatherDatabase;", "getDb", "()Lcom/jayesh/weatherapp/database/WeatherDatabase;", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/util/List;", "app_debug"})
    public static final class weatherAsync extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.util.List<? extends com.jayesh.weatherapp.database.WeatherEntity>> {
        @org.jetbrains.annotations.NotNull()
        private final com.jayesh.weatherapp.database.WeatherDatabase db = null;
        
        public weatherAsync(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.jayesh.weatherapp.database.WeatherDatabase getDb() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.util.List<com.jayesh.weatherapp.database.WeatherEntity> doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
    }
}