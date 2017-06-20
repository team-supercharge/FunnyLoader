package io.supercharge.funnyloader.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import io.supercharge.funnyloader.FunnyLoader;

public class MainActivity extends AppCompatActivity {

    FunnyLoader funnyLoader;
    Button toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        funnyLoader = (FunnyLoader) findViewById(R.id.textView1);
        toggle = (Button) findViewById(R.id.button);

        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (funnyLoader.isRunning()) {
                    funnyLoader.stop();
                } else {
                    funnyLoader.start();
                }
            }
        });

    }
}
