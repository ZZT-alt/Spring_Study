package com.ZZT.domain;

public class Brand {

    private int status;
    private int ordered;
    private String brand_name;
    private String description;
    private String company_name;

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getOrdered() {
        return ordered;
    }

    public void setOrdered(int ordered) {
        this.ordered = ordered;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "status=" + status +
                ", ordered=" + ordered +
                ", brand_name='" + brand_name + '\'' +
                ", description='" + description + '\'' +
                ", company_name='" + company_name + '\'' +
                ", id=" + id +
                '}';
    }
}
