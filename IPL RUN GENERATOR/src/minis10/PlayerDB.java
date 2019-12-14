/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minis10;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author VASUDHA SHAH
 */
public class PlayerDB {
     ArrayList<Player> pList;
    Connection con;
    Statement sm;
    PreparedStatement psm;
    ResultSet rs;
    String query;

    public PlayerDB() {
        con=(Connection) ConnectionFactory.getConnection();
        query="create database if not exists cricket";
        try{
            sm=(Statement) con.createStatement();
            sm.execute(query);
        }
        catch(Exception e){
            e.getMessage();
        }
        try
        {
            query="use cricket";
            sm.execute(query);
            query="create table player(pid int(4),cid int(4) ,pname varchar(20),primary key(pid))";
            sm.execute(query);
           // System.out.println("abc");
        }
        catch(Exception e)
        {
            e.getMessage();
        }
        readTable();
    }
    void readTable()
    {
        pList=new ArrayList<Player>();
        Player p=null;
        try{
          query="select * from player";
          rs=sm.executeQuery(query);
          while(rs.next())
          {
              int pid=rs.getInt("pid");
              int cid=rs.getInt("cid");
              String pname=rs.getString("pname");
              
              p=new Player(pid,cid,pname);
              pList.add(p);
              //System.out.println("123");
          }//while
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
    ArrayList<Player> getPList()
    {
        return pList;
    }
}
