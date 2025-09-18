package com.sol.canvas;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
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

        sv = findViewById(R.id.surfaceView);
        sv.setBackgroundColor(0Xffffffff);


    }

    /** called when the user taps the clear button */
    public void clearButtonBehaviour(View view) {

    }

    /** called when the user taps the draw button */
    public void drawButtonBehaviour(View view) {
        SurfaceHolder sh = sv.getHolder();
        Canvas c = sh.lockCanvas();
        paint.setStyle(Paint.Style.FILL);
        c.drawColor(Color.BLACK);
        c.drawCircle(10, 100, 30, paint);
        sh.unlockCanvasAndPost(c);

        //Graphics2D g = (Graphics2D) canvas.getGraphics();
        //g.setColor(Color.black);
        //bf.show();
        //g.fillOval(width/2 - diameter/2, height/2 - diameter/2, diameter, diameter);
    }
}