public class Shipped implements OrderState {

    public void pay(Order ctx) {
        throw new IllegalStateException("Ya fue pagada.");
    }

    public void ship(Order ctx) {
        System.out.println("Ya está SHIPPED.");
    }

    @Override
	public void cancel(Order ctx) {
		System.out.println("Cancelando Pedido.");
        ctx.changeState(new Cancel());
	}

}
