package com.android.discovery.sendbroadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendBroadCast() {
        Intent intent = new Intent("com.android.discovery.action.VoiceBroadcast");
        //发送显示广播，设置广播接收者的路径:第一个参数是包名路径；第二个参数是类名路径
       /* intent.setComponent(new ComponentName("com.example.broadcaststudy",
                "com.example.broadcaststudy.MyBroadcastReceiver"));*/
        //创建Bundle
        Bundle bundle = new Bundle();
      //  String content  = textView.getText().toString();
        //储存要发送的广播消息内容
        //  bundle.putString("message",content);
        intent.putExtra("message",content);
        //发送广播
        sendBroadcast(intent);
    }
}
