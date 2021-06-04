package com.mkayacdev.restapiexp.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "trade_mark_name")
    private String tradeMark;
    @Column(name = "model_name")
    private String model;
    @Column(name = "mile_age")
    private Long mileAge;
    @Column(name = "horse_power")
    private Long horsePower;
    @Column(name = "transmission_kind")
    private String transmission;

    public Auto() {

    }

    public Auto(String tradeMark, String model, Long mileAge, Long horsePower, String transmission) {
        this.tradeMark = tradeMark;
        this.model = model;
        this.mileAge = mileAge;
        this.horsePower = horsePower;
        this.transmission = transmission;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getMileAge() {
        return mileAge;
    }

    public void setMileAge(Long mileAge) {
        this.mileAge = mileAge;
    }

    public Long getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Long horsePower) {
        this.horsePower = horsePower;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
