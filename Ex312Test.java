public class Ex312Test {
  public static void main(String[] args) {
    Ex312 invoice1 = new Ex312("A300", "Hammer", 6, 14.97);
    Ex312 invoice2 = new Ex312("A301", "1 Inch Nails", 43, 0.95);
    Ex312 invoice3 = new Ex312("A302", "Large Level", 3, 22.99);
    Ex312 invoice4 = new Ex312("A303", "Pocket Level", 7, 13.95);
    Ex312 invoice5 = new Ex312("A304", "Ratcheting Screwdriver 65pc", 6, 29.99);

    System.out.printf("Invoice for %s (%s): %d @ $%.2f each %nTotal: $%.2f%n", 
      invoice1.getPartNumber(), invoice1.getPartDescription(),
      invoice1.getQuantity(), invoice1.getPricePerItem(), 
      invoice1.getInvoiceAmount());
    System.out.printf("Invoice for %s (%s): %d @ $%.2f each %nTotal: $%.2f%n", 
      invoice2.getPartNumber(), invoice2.getPartDescription(),
      invoice2.getQuantity(), invoice2.getPricePerItem(), 
      invoice2.getInvoiceAmount());
    System.out.printf("Invoice for %s (%s): %d @ $%.2f each %nTotal: $%.2f%n", 
      invoice3.getPartNumber(), invoice3.getPartDescription(),
      invoice3.getQuantity(), invoice3.getPricePerItem(), 
      invoice3.getInvoiceAmount());
    System.out.printf("Invoice for %s (%s): %d @ $%.2f each %nTotal: $%.2f%n", 
      invoice4.getPartNumber(), invoice4.getPartDescription(),
      invoice4.getQuantity(), invoice4.getPricePerItem(), 
      invoice4.getInvoiceAmount());
    System.out.printf("Invoice for %s (%s): %d @ $%.2f each %nTotal: $%.2f%n", 
      invoice5.getPartNumber(), invoice5.getPartDescription(),
      invoice5.getQuantity(), invoice5.getPricePerItem(), 
      invoice5.getInvoiceAmount());




  }// close main

} // close class