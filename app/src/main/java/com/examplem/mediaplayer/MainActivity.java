package com.examplem.mediaplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.examplem.mediaplayer.demo_a.First_Mediaplayer;
import com.examplem.mediaplayer.demo_b.DemoBActivity;
import com.examplem.mediaplayer.demo_c.DemoCActivity;
import com.examplem.mediaplayer.demo_d.DemoDActivity;
import com.examplem.mediaplayer.demo_e.DemoEActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private ListView mlv;
    private String[] datas;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlv = (ListView) findViewById(R.id.main_lv);

        datas = new String[]{
                "Android MediaPlayer + SurfaceView/TextureView",
                "Android VideoView + MediaController",
                "Vitamio MediaPlayer + SurfaceView/TextureView",
                "Vitamio VideoView + MediaController",
                "Vitamio中VideoView Buffer 缓冲处理"
        };

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datas);
        mlv.setAdapter(adapter);

        mlv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent;
        switch (position) {
            case 0:
                intent = new Intent(MainActivity.this, First_Mediaplayer.class);
                startActivity(intent);
                break;
            case 1:
                intent = new Intent(MainActivity.this, DemoBActivity.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(MainActivity.this, DemoCActivity.class);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(MainActivity.this, DemoDActivity.class);
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(MainActivity.this, DemoEActivity.class);
                startActivity(intent);
                break;
        }
    }
}
