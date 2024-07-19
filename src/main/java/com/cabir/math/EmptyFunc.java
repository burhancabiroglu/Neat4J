package com.cabir.math;

public class EmptyFunc implements DerivativeFunc {
    @Override
    public Matrix calc(Matrix matrix) {return null; }

    @Override
    public Matrix derivative(Matrix matrix) {return null; }

    @Override
    public String toString() { return "Null Function"; }
}