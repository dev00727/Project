/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package film;

/**
 *
 * @author devbi_000
 */
abstract public class Ticket {

    private String freq;

    public Ticket(String num) {
        freq = num;
    }
    public String toString(){
     return "Number of Tickets" + freq;
    }
    public String getFreq() {
        return freq;

    }
    //subclasses of Ticket will provide body to these methods
    abstract public int gettotal();

    abstract public void setPrice(int p);

}
