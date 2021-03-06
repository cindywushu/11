package com.example.traffic_app;

import com.google.gson.annotations.SerializedName;

//透過Gsonformat創建的資料庫類別
public class Traffic {

    /**
     * id : 0
     * time : 舒婷測試
     * time-slot : 早
     * place : 北商
     * nums : null
     * sort : null
     * longitude : 121.524
     * latitude : 25.0423
     * category : A2
     * direction : 北向
     * minibus : 0
     * bus : 0
     * smalltruck : 0
     * bigtruck : 1
     * semijoinedcar : 0
     * fullyconnectedcar : 0
     * tractioncar : 0
     */

    private String id;
    private String time;
    @SerializedName("time-slot")
    private String timeslot;
    private String place;
    private Object nums;
    private Object sort;
    private String longitude;
    private String latitude;
    private String category;
    private String direction;
    private String minibus;
    private String bus;
    private String smalltruck;
    private String bigtruck;
    private String semijoinedcar;
    private String fullyconnectedcar;
    private String tractioncar;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Object getNums() {
        return nums;
    }

    public void setNums(Object nums) {
        this.nums = nums;
    }

    public Object getSort() {
        return sort;
    }

    public void setSort(Object sort) {
        this.sort = sort;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getMinibus() {
        return minibus;
    }

    public void setMinibus(String minibus) {
        this.minibus = minibus;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public String getSmalltruck() {
        return smalltruck;
    }

    public void setSmalltruck(String smalltruck) {
        this.smalltruck = smalltruck;
    }

    public String getBigtruck() {
        return bigtruck;
    }

    public void setBigtruck(String bigtruck) {
        this.bigtruck = bigtruck;
    }

    public String getSemijoinedcar() {
        return semijoinedcar;
    }

    public void setSemijoinedcar(String semijoinedcar) {
        this.semijoinedcar = semijoinedcar;
    }

    public String getFullyconnectedcar() {
        return fullyconnectedcar;
    }

    public void setFullyconnectedcar(String fullyconnectedcar) {
        this.fullyconnectedcar = fullyconnectedcar;
    }

    public String getTractioncar() {
        return tractioncar;
    }

    public void setTractioncar(String tractioncar) {
        this.tractioncar = tractioncar;
    }
}
