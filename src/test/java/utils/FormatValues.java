package utils;

public class FormatValues {
    public double finalPrice(String price) {
        return Double.parseDouble(price.split(" ")[0].replace(",", "."));
    }
}
