public class OrderAction implements OrderPlacer,OrderCalculator,EmailSender,InvoiceGenerator{
   public void calculateTotal(double price, int quantity){
     double total = price * quantity;
     System.out.println("Order total: $" + total);
   } 

   public void placeOrder(String customerName, String address){
    System.out.println("Order placed for "+ customerName +  "At" + address);
   }

   public void generateInvoice(String fileName){
    System.out.println("Invoice generated: "+ fileName);
   }
   public void sendEmailNotification(String email){
    System.out.println("Email notification sent to: "+ email);
   }



}
