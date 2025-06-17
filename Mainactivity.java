package com.example.practical_18; 
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;
import android.widget.MediaController;
import androidx.appcompat.app.AppCompatActivity; 
public class MainActivity extends AppCompatActivity {
private VideoView videoView; private Button btnPlay;
@Override
protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main); videoView = findViewById(R.id.videoView); btnPlay = findViewById(R.id.btnPlay);
String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.first;
Uri uri = Uri.parse(videoPath); videoView.setVideoURI(uri);
MediaController mediaController = new MediaController(this);
mediaController.setAnchorView(videoView); videoView.setMediaController(mediaController);
btnPlay.setOnClickListener(new View.OnClickListener() { @Override
public void onClick(View v) { videoView.start();
}
});
}
}
