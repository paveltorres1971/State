public class Pending implements OrderState {

    @Override
    public void pay(Order order) {
        System.out.println("Pago recibido. Cambiando a PAID.");
        order.changeState(new Paid());
    }

    @Override
    public void ship(Order ctx) {
        throw new IllegalStateException("No se puede enviar: el pedido está PENDING.");
    }

    @Override
	public void cancel(Order ctx) {
		System.out.println("Cancelando Pedido.");
        ctx.changeState(new Cancel());
	}

}
