package com.abc.autoonduty.crawler.entity;

import java.util.List;

public class upsAllstate {
    String sucess;
    int total;
    List<upsDtals> root;

    public String getSucess() {
        return sucess;
    }

    public void setSucess(String sucess) {
        this.sucess = sucess;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<upsDtals> getRoot() {
        return root;
    }

    public void setRoot(List<upsDtals> root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return "upsAllstate{" +
                "sucess='" + sucess + '\'' +
                ", total=" + total +
                ", root=" + root.toString() +
                '}';
    }

    class upsDtals{
        int rowid;
        String ups;
        int branch_id;
        String mfr;
        String model;
        String serial;
        int itime;
        int rbtime;
        int ismon;
        String status;
        String load;
        String charge;
        String bvolt;
        String ivolt;
        String ovolt;
        String temp;
        String lastol;
        String lastob;
        String envtemp;
        String envhum;
        String ofreq;
        String note;
        String branch;

        public int getRowid() {
            return rowid;
        }

        public void setRowid(int rowid) {
            this.rowid = rowid;
        }

        public String getUps() {
            return ups;
        }

        public void setUps(String ups) {
            this.ups = ups;
        }

        public int getBranch_id() {
            return branch_id;
        }

        public void setBranch_id(int branch_id) {
            this.branch_id = branch_id;
        }

        public String getMfr() {
            return mfr;
        }

        public void setMfr(String mfr) {
            this.mfr = mfr;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getSerial() {
            return serial;
        }

        public void setSerial(String serial) {
            this.serial = serial;
        }

        public int getItime() {
            return itime;
        }

        public void setItime(int itime) {
            this.itime = itime;
        }

        public int getRbtime() {
            return rbtime;
        }

        public void setRbtime(int rbtime) {
            this.rbtime = rbtime;
        }

        public int getIsmon() {
            return ismon;
        }

        public void setIsmon(int ismon) {
            this.ismon = ismon;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getLoad() {
            return load;
        }

        public void setLoad(String load) {
            this.load = load;
        }

        public String getCharge() {
            return charge;
        }

        public void setCharge(String charge) {
            this.charge = charge;
        }

        public String getBvolt() {
            return bvolt;
        }

        public void setBvolt(String bvolt) {
            this.bvolt = bvolt;
        }

        public String getIvolt() {
            return ivolt;
        }

        public void setIvolt(String ivolt) {
            this.ivolt = ivolt;
        }

        public String getOvolt() {
            return ovolt;
        }

        public void setOvolt(String ovolt) {
            this.ovolt = ovolt;
        }

        public String getTemp() {
            return temp;
        }

        public void setTemp(String temp) {
            this.temp = temp;
        }

        public String getLastol() {
            return lastol;
        }

        public void setLastol(String lastol) {
            this.lastol = lastol;
        }

        public String getLastob() {
            return lastob;
        }

        public void setLastob(String lastob) {
            this.lastob = lastob;
        }

        public String getEnvtemp() {
            return envtemp;
        }

        public void setEnvtemp(String envtemp) {
            this.envtemp = envtemp;
        }

        public String getEnvhum() {
            return envhum;
        }

        public void setEnvhum(String envhum) {
            this.envhum = envhum;
        }

        public String getOfreq() {
            return ofreq;
        }

        public void setOfreq(String ofreq) {
            this.ofreq = ofreq;
        }

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }

        public String getBranch() {
            return branch;
        }

        public void setBranch(String branch) {
            this.branch = branch;
        }

        @Override
        public String toString() {
            return "upsDtals{" +
                    "rowid=" + rowid +
                    ", ups='" + ups + '\'' +
                    ", branch_id=" + branch_id +
                    ", mfr='" + mfr + '\'' +
                    ", model='" + model + '\'' +
                    ", serial='" + serial + '\'' +
                    ", itime=" + itime +
                    ", rbtime=" + rbtime +
                    ", ismon=" + ismon +
                    ", status='" + status + '\'' +
                    ", load='" + load + '\'' +
                    ", charge='" + charge + '\'' +
                    ", bvolt='" + bvolt + '\'' +
                    ", ivolt='" + ivolt + '\'' +
                    ", ovolt='" + ovolt + '\'' +
                    ", temp='" + temp + '\'' +
                    ", lastol='" + lastol + '\'' +
                    ", lastob='" + lastob + '\'' +
                    ", envtemp='" + envtemp + '\'' +
                    ", envhum='" + envhum + '\'' +
                    ", ofreq='" + ofreq + '\'' +
                    ", note='" + note + '\'' +
                    ", branch='" + branch + '\'' +
                    '}';
        }
    }
}
