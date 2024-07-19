package com.cabir.loss;

import com.cabir.math.Matrix;

public class MSELoss {
    public static double calc(Matrix yTrue, Matrix yPred){
        return Matrix.sub(yTrue,yPred).power().mean();
    }
}