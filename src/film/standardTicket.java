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
class standardTicket extends Ticket {

    private int price;

    public standardTicket(String Snum, int p) {
        super(Snum);
        price=p;
    }

    @Override
    public String toString(){
     return "Number of Standard Tickets: " + getFreq();
    }
    
    public void setPrice(int p) {
        price = p;
    }

    public int gettotal() {
        int t = Integer.parseInt(super.getFreq()) * price;
        return t;
    }

}
