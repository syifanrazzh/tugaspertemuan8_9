package com.syifa.tugas8;

/**
 *
 * @author Syifa Nur Azizah Suhud - 2305056
 */
public class ObjekGeometris {
    private String color = "putih";
    private boolean filled = false;

    public ObjekGeometris() {
    }

    public ObjekGeometris(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter
    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    // Setter
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
