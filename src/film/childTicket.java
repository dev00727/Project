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
class childTicket extends Ticket {

    private int price;

    public childTicket(String chnum, int p) {
        super(chnum);
        price=p;
    }

    @Override
     public String toString(){
     return "Number of Child Tickets: " + getFreq();
    }
    public void setPrice(int p) {
        price = p;
    }

    public int gettotal() {
        int t = Integer.parseInt(super.getFreq()) * price;
        return t;
    }
}
