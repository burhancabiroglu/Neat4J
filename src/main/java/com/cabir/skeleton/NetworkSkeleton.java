package com.cabir.skeleton;

import java.util.ArrayList;

public class NetworkSkeleton {
    private final ArrayList<LayerSkeleton> layerSkeletons;

    public NetworkSkeleton(){
        layerSkeletons  = new ArrayList<>();
    }

    public NetworkSkeleton(ArrayList<LayerSkeleton> list){
        layerSkeletons = new ArrayList<>(list);
    }

    public void add(LayerSkeleton layerSkeleton){
        layerSkeletons.add(layerSkeleton);
    }

    public ArrayList<LayerSkeleton> get(){
        return  layerSkeletons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NetworkSkeleton skeleton = (NetworkSkeleton) o;

        return layerSkeletons.equals(skeleton.layerSkeletons);
    }

    @Override
    public int hashCode() {
        return layerSkeletons.hashCode();
    }

    public NetworkSkeleton clone() {
        return new NetworkSkeleton(layerSkeletons);
    }

    @Override
    public String toString() {
        return "Skeleton{ layerSkeletons=" + layerSkeletons + '}';
    }
}