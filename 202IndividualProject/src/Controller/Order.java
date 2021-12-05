package Controller;

import View.Client;

public class Order {

    private OrderState state = new ValidOrderState();

    public void setState(OrderState o){
        this.state = o;
    }

    public OrderState getState(){
        return this.state;
    }

    public void previousState(){
        state.prev(this);

    }

    public void nextState(){
        state.next(this);

    }

    public void printStatus(){
        state.printStatus();
    }



}
