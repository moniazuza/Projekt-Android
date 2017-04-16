package com.kozakteam.asteroids;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/**
 * Created by Monika on 17.04.2017.
 */

public class Background {

    private Bitmap image;
    private int x, y;

    public Background(Bitmap bitmap) {
        image = bitmap;
    }

    public void update() {
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(image, x, y, null);
    }
}
