public interface OrderState {
    void pay(Order ctx);
    void ship(Order ctx);
    void cancel(Order ctx);
}
