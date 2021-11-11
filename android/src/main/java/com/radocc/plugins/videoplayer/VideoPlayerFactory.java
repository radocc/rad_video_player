package com.radocc.plugins.videoplayer;

import android.content.Context;

import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

public class VideoPlayerFactory extends PlatformViewFactory {

    private VideoView videoView;

    public VideoPlayerFactory(Context context) {
        super(StandardMessageCodec.INSTANCE);
        videoView = new VideoView(context);
    }

    @Override
    public PlatformView create(Context context, int viewId, Object args) {

        return videoView;
    }

    public VideoView getVideoView() {
        return videoView;
    }
}
