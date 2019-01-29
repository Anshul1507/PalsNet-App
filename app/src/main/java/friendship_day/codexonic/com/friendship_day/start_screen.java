package friendship_day.codexonic.com.friendship_day;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class start_screen extends AppCompatActivity {
    ProgressBar progressBar;
    private ImageView image_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_start_screen);

        progressBar = findViewById(R.id.progress_bar);
        progressBar.setMax(100);
        progressBar.setProgress(0);
        image_logo = findViewById(R.id.logo_screen);
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        progressBar.setProgress(i);

                      sleep(20);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent homeIntent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(homeIntent);
                    finish();
                }
            }
        };
        thread.start();
    }
}
