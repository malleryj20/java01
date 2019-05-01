package com.comp;

public class Point3D extends Point {
    private int z;
    public Point3D(int nX, int nY, int nZ){
        super(nX, nY);
        z = nZ;
    }
    public int getZ(){return z;}
    public void setZ(int nZ){
        z = nZ;
    }
}
