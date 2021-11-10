package com.radocc.plugins.videoplayer;

import android.content.Context;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

import io.flutter.plugin.platform.PlatformView;

public class VideoView implements PlatformView {
    private static final String TAG = "VideoPlayerView";

    private SurfaceView surfaceView;

    VideoView(@NonNull Context context) {
        this.surfaceView = new SurfaceView(context);
    }

    @Override
    public SurfaceView getView() {
        return surfaceView;
    }

    @Override
    public void dispose() {
        surfaceView = null;
    }
}