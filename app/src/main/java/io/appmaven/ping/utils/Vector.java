package io.appmaven.ping.utils;

import androidx.annotation.NonNull;

public class Vector {
    public int x;
    public int y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vector add(Vector vector) {
        return new Vector((this.x + vector.x), (this.y + vector.y));
    }

    public Vector mult(int magnitude) {
        return new Vector(this.x * magnitude, this.y * magnitude);
    }

    @NonNull
    @Override
    public String toString() {
        return "Vector(" + this.x + ", " + this.y + ")";
    }
}
