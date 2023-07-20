package me.ssagan.distance.util;

import me.ssagan.distance.model.Point;

public class Geometry {
    public static double getDistance(Point a, Point b) {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }
}
