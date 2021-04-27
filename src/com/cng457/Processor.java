package com.cng457;

public class Processor {

    private String modelName;
    private float clockFrequency;

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setClockFrequency(float clockFrequency) {
        this.clockFrequency = clockFrequency;
    }

    public String getModelName() {
        return modelName;
    }

    public float getClockFrequency() {
        return clockFrequency;
    }

    public Processor(String modelName, float clockFrequency) {
        this.modelName = modelName;
        this.clockFrequency = clockFrequency;
    }
}
