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
class oapTicket extends Ticket {

    private int price;

    public oapTicket(String Onum, int p) {
        super(Onum);
        price=p;
    }

    @Override
     public String toString(){
     return "Number of OAP Tickets: " + getFreq();
    }
    public void setPrice(int p) {
        price = p;
    }

    public int gettotal() {
        int t = Integer.parseInt(super.getFreq()) * price;
        return t;
    }

}
