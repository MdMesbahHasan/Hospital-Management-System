package com.example.hospitalmanagement.Model;

public class HospitalMgt {
    private int HospitalMgtId;
    private String HospitalMgtName;
    private int HospitalMgtPrice;
    private String HospitalMgtColor;
    public HospitalMgt(int id,String name,int price,String color){//instance variable..
            setHospitalMgtId(id);
            setHospitalMgtName(name);
            setHospitalMgtColor(color);
            setHospitalMgtPrice(price);//calling the set methods in the constructor..

    }

    public int getHospitalMgtId() {
        return HospitalMgtId;
    }

    public String getHospitalMgtName() {
        return HospitalMgtName;
    }

    public int getHospitalMgtPrice() {
        return HospitalMgtPrice;
    }

    public String getHospitalMgtColor() {
        return HospitalMgtColor;
    }

    public void setHospitalMgtId(int hospitalMgtId) {
        HospitalMgtId = hospitalMgtId;
    }

    public void setHospitalMgtName(String hospitalMgtName) {
        HospitalMgtName = hospitalMgtName;
    }

    public void setHospitalMgtPrice(int hospitalMgtPrice) {
        HospitalMgtPrice = hospitalMgtPrice;
    }

    public void setHospitalMgtColor(String hospitalMgtColor) {
        HospitalMgtColor = hospitalMgtColor;
    }
}
//its a new package under the previous package