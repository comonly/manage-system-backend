package cn.comonly.pojo;

import java.io.Serializable;
import java.util.Date;

public class StockIndustry implements Serializable {
    private Integer iid;

    private String iname;

    private String idescribe;

    private Integer ifollow;

    private Date itime;

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname == null ? null : iname.trim();
    }

    public String getIdescribe() {
        return idescribe;
    }

    public void setIdescribe(String idescribe) {
        this.idescribe = idescribe == null ? null : idescribe.trim();
    }

    public Integer getIfollow() {
        return ifollow;
    }

    public void setIfollow(Integer ifollow) {
        this.ifollow = ifollow;
    }

    public Date getItime() {
        return itime;
    }

    public void setItime(Date itime) {
        this.itime = itime;
    }
}