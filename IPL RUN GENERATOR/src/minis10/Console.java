/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minis10;

import java.util.ArrayList;

/**
 *
 * @author VASUDHA SHAH
 */
public class Console {
    
    ArrayList <Country> cList;
     ArrayList <Player> pList;
      ArrayList <Scores> sList;
    public Console() {
    }
    

    void start()
    {
        CountryDB cdb=new CountryDB();
        PlayerDB pdb=new PlayerDB();
        ScoreDB sdb=new ScoreDB();
        cdb.readTable();
        pdb.readTable();
        sdb.readTable();
        cList=cdb.getCList();
        pList=pdb.getPList();
        sList=sdb.getSList();
        System.out.println(cList);
        System.out.println(pList);
        System.out.println(sList);
        
    }
    
}
