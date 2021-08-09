package com.company;

public class Polar {
    private float radio;
    private float angulo; //radianes

    public Polar (float radio,float angulo)
    {
        this.radio=radio;
        this.angulo=angulo;
    }
    
    public Polar cartesiano_polar(float x, float y)
    {
        float radio=(float)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        float angulo=(float)Math.atan(y/x);
        return new Polar(x,y);
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAngulo() {
        return angulo;
    }

    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }
}
