public class OrderTest {
   public static void main(String[] args) {
        OrderAction order = new OrderAction();

        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");
        
        order.generateInvoice("Order.pdf" );
        order.sendEmailNotification("johndoe@example.com");

   } 
}
