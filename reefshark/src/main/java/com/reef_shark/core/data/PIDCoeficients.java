package com.reef_shark.core.data;

public final class PIDCoeficients {
    private final int p;
    private final int i;
    private final int d;

    public PIDCoeficients(int p, int i, int d) {
        this.p = p;
        this.i = i;
        this.d = d;
    }

    public int getP() {
        return p;
    }

    public int getI() {
        return i;
    }

    public int getD() {
        return d;
    }


}
