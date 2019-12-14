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
public class Player {
    private int pid;
    private int cid;
    private String pname;

    @Override
    public String toString() {
        return "Player{" + "pid=" + pid + ", cid=" + cid + ", pname=" + pname + '}';
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Player(int pid, int cid, String pname) {
        this.pid = pid;
        this.cid = cid;
        this.pname = pname;
    }

    public Player() {
    }
}
