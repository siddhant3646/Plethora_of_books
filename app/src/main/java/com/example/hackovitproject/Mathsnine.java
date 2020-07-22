package com.example.hackovitproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Mathsnine extends AppCompatActivity {
    Button b1,b2,b3,b4;
    DownloadManager downloadManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathsnine);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager =(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri= Uri.parse("https://firebasestorage.googleapis.com/v0/b/aztecs-521bf.appspot.com/o/NCERT-Class-9-Mathematics.pdf?alt=media&token=493ef176-affb-44ba-8840-02d6bf4d1616");
                DownloadManager.Request request= new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference =downloadManager.enqueue(request);
                Toast.makeText(getApplicationContext(), "DOWNLOAD STARTED", Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager =(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri= Uri.parse("https://firebasestorage.googleapis.com/v0/b/aztecs-521bf.appspot.com/o/Chapter%201%20-%20Number%20Systems.pdf?alt=media&token=050a13ca-8d35-4c30-a6be-fc92e74f9e9a");
                DownloadManager.Request request= new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference =downloadManager.enqueue(request);
                Toast.makeText(getApplicationContext(), "DOWNLOAD STARTED", Toast.LENGTH_SHORT).show();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager =(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri= Uri.parse("https://firebasestorage.googleapis.com/v0/b/aztecs-521bf.appspot.com/o/Chapter%201%20-%20Number%20System.pdf?alt=media&token=afa50962-db76-44a9-bab2-9b36a2dcc613");
                DownloadManager.Request request= new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference =downloadManager.enqueue(request);
                Toast.makeText(getApplicationContext(), "DOWNLOAD STARTED", Toast.LENGTH_SHORT).show();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Mathsnine.this,Main4Activity.class);
                startActivity(intent);

            }
        });
    }
}
