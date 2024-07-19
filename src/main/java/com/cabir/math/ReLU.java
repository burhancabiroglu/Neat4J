package com.cabir.math;

public class ReLU implements DerivativeFunc {
    @Override
    public Matrix calc(Matrix matrix) { return matrix.relu(); }

    @Override
    public Matrix derivative(Matrix matrix) { return null; }

    @Override
    public String toString() { return "Rectified Linear Unit Function"; }
}