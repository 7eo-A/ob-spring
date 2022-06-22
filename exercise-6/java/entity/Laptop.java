package com.code.obspring.entity;

import javax.persistence.*;

@Entity
public class Laptop {

    /**
     *
     * @param id
     * Parts of a computer:
     * @param motherboard
     * @param cpu
     * @param gpu
     * @param ram
     * @param storage
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String motherboard;
    private String cpu;
    private String gpu;
    private String ram;
    private String storage;

    public Laptop() { }

    public Laptop(String motherboard, String cpu, String gpu, String ram, String storage) {
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.storage = storage;
    }

    public Integer getId() {
        return id;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
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

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

}
