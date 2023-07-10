package com.ubo.microservices.limitsservice.bean;

public class Limits
{
    private int minimum;
    private int maximum;

    public Limits()
    {
        super();
    }

    public Limits(int minimum, int maximum)
    {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMaximum() {
        return maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    @Override
    public String toString() {
        return "Limits{" +
                "minimum=" + minimum +
                ", maximum=" + maximum +
                '}';
    }
}
