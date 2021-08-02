package com.company;

public class Cartesiano {
    private float x;
    private float y;

    public Cartesiano(float x, float y)
    {
        this.x=x;
        this.y=y;
    }

    public Cartesiano polar_cartesiano(float radio, double angulo)
    {
        float x=radio*(float)Math.cos(angulo);
        float y=radio*(float)Math.sin(angulo);
        return new Cartesiano(x,y);
    }

    public Cartesiano polar_cartesiano(Polar p)
    {
       return new Cartesiano(x,y);
    }
    public Polar cartesiano_polar(float x, float y)
    {
        float radio=(float)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        float angulo=(float)Math.atan(y/x);
        return new Polar(x,y);
    }

    public Polar polar_cartesiano(Cartesiano c)
    {
        return new Polar();
    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
