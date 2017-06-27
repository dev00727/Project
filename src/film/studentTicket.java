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
public class studentTicket extends Ticket {

    private int price;

    public studentTicket(String n, int p) {
        super(n);
        price=p;
    }

    @Override
    public String toString(){
     return "Number of Student Tickets: " + getFreq();
    }
    public void setPrice(int p) {
        price = p;
    }

    public int gettotal() {
        int t = Integer.parseInt(super.getFreq()) * price;
        return t;
    }

}
