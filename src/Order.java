public class Order {
    
    private OrderState state = new Pending();
    
    public void pay()  { 
        state.pay(this); 
    }
    
    public void ship() { 
        state.ship(this); 
    }
    
    public void cancel() { 
        state.ship(this); 
    }
    
    void changeState(OrderState s) {
        this.state = s; 
    }

}
