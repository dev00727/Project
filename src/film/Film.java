/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package film;

import java.util.*;

/**
 *
 * @author devbi_000
 */
public class Film {
    private String movie;
    private String day;
    private String time;
    private ArrayList<Ticket> t; 
   
    /*public Film(String m, String d, String t, ArrayList<Ticket> o){
       movie=m;
       day=d;
       this.time=t;
       this.t=o;
   }*/
    public Film(){
        
    }
   
   public void setMovie(String m){
       movie= m;
   }
   public String getMovie(){
       return movie;
   }
    public void setDay(String d){
       day= d;
   }
   public String getday(){
       return day;
   }
    public void setTime(String t){
       time= t;
   }
   public String getTime(){
       return time;
   }
    public void setTicket(ArrayList<Ticket> t){
       this.t= t;
   }
   public ArrayList<Ticket> getTicket(){
       return t;
   }
   
}
