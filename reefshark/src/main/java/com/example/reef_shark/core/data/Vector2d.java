package com.example.reef_shark.core.data;

public class Vector2d {
    private final int x;
    private final int y;

    public Vector2d(int x, int y, int heading) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
