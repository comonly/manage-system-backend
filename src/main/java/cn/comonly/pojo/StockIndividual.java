package cn.comonly.pojo;

import java.io.Serializable;
import java.util.Date;

public class StockIndividual implements Serializable {
    private Integer iid;

    private String icode;

    private String iname;

    private Integer iindustry;

    private String iconcept;

    private String idescribe;

    private Date itime;

    private Integer ifollow;

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public String getIcode() {
        return icode;
    }

    public void setIcode(String icode) {
        this.icode = icode == null ? null : icode.trim();
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname == null ? null : iname.trim();
    }

    public Integer getIindustry() {
        return iindustry;
    }

    public void setIindustry(Integer iindustry) {
        this.iindustry = iindustry;
    }

    public String getIconcept() {
        return iconcept;
    }

    public void setIconcept(String iconcept) {
        this.iconcept = iconcept == null ? null : iconcept.trim();
    }

    public String getIdescribe() {
        return idescribe;
    }

    public void setIdescribe(String idescribe) {
        this.idescribe = idescribe == null ? null : idescribe.trim();
    }

    public Date getItime() {
        return itime;
    }

    public void setItime(Date itime) {
        this.itime = itime;
    }

    public Integer getIfollow() {
        return ifollow;
    }

    public void setIfollow(Integer ifollow) {
        this.ifollow = ifollow;
    }
}