package com.sol.canvas;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CanvasActivity extends AppCompatActivity {
    SurfaceView sv;
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_canvas);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Handler handler = new Handler();
        sv = findViewById(R.id.surfaceView);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        handler.postDelayed(new Runnable() {
            public void run() {
                SurfaceHolder sh = sv.getHolder();
                Canvas c = sh.lockCanvas();
                c.drawColor(Color.WHITE);
                //c.drawCircle(10, 100, 30, paint);
                sh.unlockCanvasAndPost(c);
            }
        }, 100);
    }

    /** called when the user taps the clear button */
    public void clearButtonBehaviour(View view) {
        SurfaceHolder sh = sv.getHolder();
        Canvas c = sh.lockCanvas();
        c.drawColor(Color.WHITE);
        sh.unlockCanvasAndPost(c);
    }

    /** called when the user taps the draw button */
    public void drawButtonBehaviour(View view) {
        SurfaceHolder sh = sv.getHolder();
        Canvas c = sh.lockCanvas();
        c.drawColor(Color.WHITE);
        float width = sv.getWidth();
        float height = sv.getHeight();
        float diameter = 200;
        c.drawCircle(width/2, height/2, diameter, paint);
        sh.unlockCanvasAndPost(c);
    }
}