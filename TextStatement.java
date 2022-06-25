import java.util.Enumeration;

public class TextStatement extends Statement {
    private String getResult(Customer aCustomer){
        String result = "Rental Record for " + aCustomer.getName() +
        "\n";

        return result;
    }

    private String getFigure(Rental each){
        String result = "\t" + each.getMovie().getTitle()+ "\t" +
        String.valueOf(each.getCharge()) + "\n";
        
        return result;
    }

    private String getFooter(Customer aCustomer){
        String result = "Amount owed is " +
        String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";

        return result;
    }

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getResult(aCustomer);
        while (rentals.hasMoreElements()) {
           Rental each = (Rental) rentals.nextElement();
           //show figures for each rental
           result += getFigure(each);
        }
        //add footer lines
        result += getFooter(aCustomer);
        return result;
     }
}