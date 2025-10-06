public class PaymentProcessor {

    public void processPayment(String method, double amount, String currency) {

        if (amount <= 0) {

            throw new IllegalArgumentException("Monto inválido");

        }

        if ("CREDIT_CARD".equalsIgnoreCase(method)) {

            System.out.println("[CC] Verificando fondos...");

            System.out.println("[CC] Cobro de " + amount + " " + currency + " aprobado.");

        } else if ("PAYPAL".equalsIgnoreCase(method)) {

            System.out.println("[PP] Redirigiendo a PayPal...");

            System.out.println("[PP] Cobro de " + amount + " " + currency + " aprobado.");

        } else {

            throw new UnsupportedOperationException("Método no soportado: " + method);

        }

        System.out.println("Notificando al usuario...");

        System.out.println("Registrando transacción en el log...");

    }

    public static void main(String[] args) {

        PaymentProcessor p = new PaymentProcessor();

        p.processPayment("CREDIT_CARD", 120.0, "USD");

        p.processPayment("PAYPAL", 89.99, "USD");

     }

}