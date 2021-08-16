package com.example.demo.entity;

public class Qr {
    private Integer qr_id;
    private String qr_code;
    private Boolean qr_status;

    public Integer getQr_id() {
        return qr_id;
    }

    public void setQr_id(Integer qr_id) {
        this.qr_id = qr_id;
    }

    public String getQr_code() {
        return qr_code;
    }

    public void setQr_code(String qr_code) {
        this.qr_code = qr_code;
    }

    public Boolean getQr_status() {
        return qr_status;
    }

    public void setQr_status(Boolean qr_status) {
        this.qr_status = qr_status;
    }

    @Override
    public String toString() {
        return "Qr{" +
                "qr_id=" + qr_id +
                ", qr_code='" + qr_code + '\'' +
                ", qr_status=" + qr_status +
                '}';
    }
}
