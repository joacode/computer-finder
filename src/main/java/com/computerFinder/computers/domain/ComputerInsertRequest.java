package com.computerFinder.computers.domain;

public class ComputerInsertRequest {
    String modelName;
    String brand;
    String displayResolution;
    String displaySize;
    String cpu;
    String gpu;
    String ram;
    Boolean expandableRam;
    String baseStorage;
    Boolean expandableStorage;
    Boolean isSsd;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDisplayResolution() {
        return displayResolution;
    }

    public void setDisplayResolution(String displayResolution) {
        this.displayResolution = displayResolution;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public Boolean getExpandableRam() {
        return expandableRam;
    }

    public void setExpandableRam(Boolean expandableRam) {
        this.expandableRam = expandableRam;
    }

    public String getBaseStorage() {
        return baseStorage;
    }

    public void setBaseStorage(String baseStorage) {
        this.baseStorage = baseStorage;
    }

    public Boolean getExpandableStorage() {
        return expandableStorage;
    }

    public void setExpandableStorage(Boolean expandableStorage) {
        this.expandableStorage = expandableStorage;
    }

    public Boolean getSsd() {
        return isSsd;
    }

    public void setSsd(Boolean ssd) {
        isSsd = ssd;
    }
}
