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
public class ScoreDB {
     ArrayList<Scores> sList;
    Connection con;
    Statement sm;
    PreparedStatement psm;
    ResultSet rs;
    String query;
    public ScoreDB() {
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
            query="create table scores(rid int(4),pid int(4),runs int(4) ,primary key(rid))";
            sm.execute(query);
            System.out.println("abc");
        }
        catch(Exception e)
        {
            e.getMessage();
        }
        readTable();
    }
    void readTable()
    {
        sList=new ArrayList<Scores>();
        Scores s=null;
        try{
          query="select * from scores";
          rs=sm.executeQuery(query);
          while(rs.next())
          {
              int sid=rs.getInt("sid");
              int pid=rs.getInt("pid");
              int runs=rs.getInt("runs");
              
              s=new Scores(sid,pid,runs);
              sList.add(s);
             // System.out.println("123");
          }//while
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
    ArrayList<Scores> getSList()
    {
        return sList;
    }
}
