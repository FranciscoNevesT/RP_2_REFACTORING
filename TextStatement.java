import java.util.Enumeration;

public class TextStatement extends Statement {
    protected String getResult(Customer aCustomer){
        String result = "Rental Record for " + aCustomer.getName() +
        "\n";

        return result;
    }

    protected String getFigure(Rental each){
        String result = "\t" + each.getMovie().getTitle()+ "\t" +
        String.valueOf(each.getCharge()) + "\n";
        
        return result;
    }

    protected String getFooter(Customer aCustomer){
        String result = "Amount owed is " +
        String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";

        return result;
    }
}