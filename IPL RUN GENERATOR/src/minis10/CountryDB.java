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
import java.util.*;

/**
 *
 * @author VASUDHA SHAH
 */
public class CountryDB {
    ArrayList<Country> cList;
    Connection con;
    Statement sm;
    PreparedStatement psm;
    ResultSet rs;
    String query;

    public CountryDB() {
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
            query="create table country(cid int(4) ,cname varchar(20),primary key(cid))";
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
        cList=new ArrayList<Country>();
        Country c=null;
        try{
          query="select * from country";
          rs=sm.executeQuery(query);
          while(rs.next())
          {
              int cid=rs.getInt("cid");
              String cname=rs.getString("cname");
              
              c=new Country(cid,cname);
              cList.add(c);
              //System.out.println("123");
          }//while
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
    ArrayList<Country> getCList()
    {
        return cList;
    }
}
