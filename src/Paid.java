public class Paid implements OrderState {

    @Override
    public void pay(Order ctx) {
        throw new IllegalStateException("Ya está pagado.");
    }

    @Override
    public void ship(Order ctx) {
        System.out.println("Enviando pedido. Cambiando a SHIPPED.");
        ctx.changeState(new Shipped());
    }

	@Override
	public void cancel(Order ctx) {
		System.out.println("Cancelando Pedido.");
        ctx.changeState(new Cancel());
	}

}
