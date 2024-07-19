package com.cabir.layer;


import com.cabir.core.annotation.ActivationAnnotation;
import com.cabir.core.annotation.LayerAnnotation;
import com.cabir.core.base.Layer;
import com.cabir.math.*;

@LayerAnnotation(type = LayerAnnotation.Activation)
public class Activation extends Layer {
    private final DerivativeFunc mathFunction;

    public Activation(@ActivationAnnotation String type) {
        switch (type) {
            case ActivationAnnotation.ReLU -> mathFunction = new ReLU();
            case ActivationAnnotation.Sigmoid -> mathFunction = new Sigmoid();
            default -> mathFunction = new EmptyFunc();
        }
    }

    @Override
    public Matrix forward(Matrix m) {
        input = m.clone();
        output = mathFunction.calc(input);
        return output.clone();
    }

    @Override
    public String toString() {
        return "\nActivation{mathFunction=" + mathFunction + '}';
    }
}
