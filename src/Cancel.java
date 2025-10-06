public class Cancel implements OrderState {

    @Override
    public void pay(Order ctx) {
        throw new IllegalStateException("La Orden está Cancelada.");
    }

    @Override
    public void ship(Order ctx) {
    	throw new IllegalStateException("La Orden está Cancelada.");
    }
    
    public void cancel(Order ctx) {
        System.out.println("El Pedido se esta Cancelando. ");
        ctx.changeState(new Cancel());
    }  
        
}
