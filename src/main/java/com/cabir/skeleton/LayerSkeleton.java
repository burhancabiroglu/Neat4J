package com.cabir.skeleton;


import com.cabir.core.annotation.ActivationAnnotation;
import com.cabir.core.annotation.LayerAnnotation;
import com.cabir.core.base.Layer;
import com.cabir.layer.Activation;
import com.cabir.layer.Linear;
import com.cabir.math.Shape;

public class LayerSkeleton {
    private Shape shape = null;
    private final String layer;
    private String activation = null;

    public LayerSkeleton(Shape shape){
        this.shape = shape;
        layer = LayerAnnotation.Linear;
    }

    public LayerSkeleton(int inputSize,int outputSize){
        shape = new Shape(inputSize,outputSize);
        layer = LayerAnnotation.Linear;
    }

    public LayerSkeleton(@ActivationAnnotation String activation){
        this.activation = activation;
        this.layer = LayerAnnotation.Activation;
    }

    public Layer generate(){
        if(layer.equals(LayerAnnotation.Activation)){
            return new Activation(activation);
        }
        else return new Linear(shape);
    }

    @Override
    public String toString() {
        return "LayerSkeleton{" +
                "shape=" + shape +
                ", layerType=" + layer +
                ", activationType=" + activation +
                '}';
    }
}