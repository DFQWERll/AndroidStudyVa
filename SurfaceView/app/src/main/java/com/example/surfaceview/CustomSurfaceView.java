package com.example.surfaceview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

public class CustomSurfaceView extends SurfaceView implements SurfaceHolder.Callback,Runnable {

    private SurfaceHolder mHolder;
    private Canvas mCanvas;
    private boolean mIsRunning;
    private Bitmap mBitmap;

    public CustomSurfaceView(Context context) {
        super(context);
        init();
    }

    public void init()
    {
        mHolder = getHolder();
        mHolder.addCallback(this);
        mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.pic);

    }



    @Override
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
        mIsRunning = true;
        new Thread(this).start();
    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
        mIsRunning = false;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        while(mIsRunning)
        {
            draw();
        }

    }
    private void draw()
    {
        mCanvas = mHolder.lockCanvas();
        if(mCanvas != null)
        {
            try {
                mCanvas.drawBitmap(mBitmap, 0, 0, null);
                //使用获得的Canvas做具体的绘制
            }catch (Exception e) {
                e.printStackTrace();
            }finally {
                mHolder.unlockCanvasAndPost(mCanvas);
            }
        }

    }
}
