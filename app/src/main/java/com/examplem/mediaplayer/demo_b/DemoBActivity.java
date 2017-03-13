
package com.examplem.mediaplayer.demo_b;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;
import com.examplem.mediaplayer.R;
import com.examplem.mediaplayer.VideoUrlRes;


public class DemoBActivity extends AppCompatActivity {


    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_b);

        //注册videoview-设置路径—开始
        videoView = (VideoView) findViewById(R.id.videoview);
        videoView.setVideoPath(VideoUrlRes.getTestVideo1());
        videoView.start();

        //使用控制器——控制视屏的播放
        MediaController mediaController = new MediaController(this);
//        mediaController.setPadding(0,,0,0);
        videoView.setMediaController(mediaController);
    }
}
