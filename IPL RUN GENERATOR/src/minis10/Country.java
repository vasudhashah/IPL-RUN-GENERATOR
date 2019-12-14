/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minis10;

/**
 *
 * @author VASUDHA SHAH
 */
public class Country {
    private int cid;
    private String cname;

    @Override
    public String toString() {
        return "Country{" + "cid=" + cid + ", cname=" + cname + '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Country(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Country() {
    }
}
