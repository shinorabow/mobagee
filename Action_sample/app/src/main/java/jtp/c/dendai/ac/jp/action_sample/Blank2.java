package jtp.c.dendai.ac.jp.action_sample;

import android.graphics.Canvas;

public class Blank2 extends Ground2 {

    public Blank2(int left, int top, int right, int bottom) {
        super(left, top, right, bottom);
    }

    @Override
    public void draw(Canvas canvas) {
    }

    @Override
    public boolean isSolid() {
        return false;
    }
}