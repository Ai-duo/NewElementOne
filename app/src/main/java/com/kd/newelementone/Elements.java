package com.kd.newelementone;

public class Elements {
    private String  info ,date, time, wd, max_wd, min_wd, sd, min_sd, fx, fs, js, qy, njd;


    private Elements(Builder builder){
        this.info  = builder.info;
        this.date = builder.date;
        this.time = builder.time;
        this.wd = builder.wd;
        this.max_wd = builder.max_wd;
        this.min_wd = builder.min_wd;
        this.sd = builder.sd;
        this.min_sd = builder.min_sd;
        this.fx = builder.fx;
        this.fs = builder.fs;
        this.js = builder.js;
        this.qy = builder.qy;
        this.njd = builder.njd;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getWd() {
        return wd;
    }

    public String getMax_wd() {
        return max_wd;
    }

    public String getMin_wd() {
        return min_wd;
    }

    public String getSd() {
        return sd;
    }

    public String getMin_sd() {
        return min_sd;
    }

    public String getFx() {
        return fx;
    }

    public String getFs() {
        return fs;
    }

    public String getJs() {
        return js;
    }

    public String getQy() {
        return qy;
    }

    public String getNjd() {
        return njd;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setWd(String wd) {
        this.wd = wd;
    }

    public void setMax_wd(String max_wd) {
        this.max_wd = max_wd;
    }

    public void setMin_wd(String min_wd) {
        this.min_wd = min_wd;
    }

    public void setSd(String sd) {
        this.sd = sd;
    }

    public void setMin_sd(String min_sd) {
        this.min_sd = min_sd;
    }

    public void setFx(String fx) {
        this.fx = fx;
    }

    public void setFs(String fs) {
        this.fs = fs;
    }

    public void setJs(String js) {
        this.js = js;
    }

    public void setQy(String qy) {
        this.qy = qy;
    }

    public void setNjd(String njd) {
        this.njd = njd;
    }

    public static class Builder{
        private String info,date, time, wd, max_wd, min_wd, sd, min_sd, fx, fs, js, qy, njd;
        public Builder info(String info){
            this.info = info;
            return this;
        }
        public Builder date(String date){
            this.date = date;
            return this;
        }
        public Builder time(String time){
            this.time = time;
            return this;
        }
        public Builder wd(String wd){
            this.wd = wd;
            return this;
        }
        public Builder max_wd(String max_wd){
            this.max_wd = max_wd;
            return this;
        }
        public Builder min_wd(String min_wd){
            this.min_wd = min_wd;
            return this;
        }
        public Builder sd(String sd){
            this.sd = sd;
            return this;
        }
        public Builder min_sd(String min_sd){
            this.min_sd = min_sd;
            return this;
        }public Builder fx(String fx){
            this.fx = fx;
            return this;
        }
        public Builder fs(String fs){
            this.fs = fs;
            return this;
        }public Builder js(String js){
            this.js = js;
            return this;
        }
        public Builder qy(String qy){
            this.qy = qy;
            return this;
        }public Builder njd(String njd){
            this.njd = njd;
            return this;
        }
        public Elements build(){
            return new Elements(this);
        }
    }
}
