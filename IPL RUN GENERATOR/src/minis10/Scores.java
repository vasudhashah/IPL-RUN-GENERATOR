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
public class Scores {
 private int rid;
 private int pid;
 private int runs;

    @Override
    public String toString() {
        return "Scores{" + "rid=" + rid + ", pid=" + pid + ", runs=" + runs + '}';
    }

    public Scores(int rid, int pid, int runs) {
        this.rid = rid;
        this.pid = pid;
        this.runs = runs;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public Scores() {
    }
}
