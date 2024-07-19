package com.cabir.math;

public class Sigmoid implements DerivativeFunc {
    @Override
    public Matrix calc(Matrix matrix) {return matrix.sigmoid();}

    @Override
    public Matrix derivative(Matrix matrix) {return null; }

    @Override
    public String toString() { return "Sigmoid Function"; }
}