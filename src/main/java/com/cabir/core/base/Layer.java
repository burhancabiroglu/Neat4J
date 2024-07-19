package com.cabir.core.base;

import com.cabir.math.Matrix;

public abstract class Layer {

    protected Matrix input = null;
    protected Matrix output = null;

    public Matrix forward(Matrix m) { return null; }

    public void backward(Matrix m){}
    
    public Matrix weight(){ return null; }

    public Matrix bias(){ return null; }
}