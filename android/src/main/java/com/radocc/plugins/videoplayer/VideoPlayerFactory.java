package com.radocc.plugins.videoplayer;

import android.content.Context;

import com.radocc.plugin.common.StandardMessageCodec;
import com.radocc.plugin.platform.PlatformView;
import com.radocc.plugin.platform.PlatformViewFactory;

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
