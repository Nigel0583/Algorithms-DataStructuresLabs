package OOMedals;

public class Main {

    public static void main(String[] args) {
        Medals medals = new Medals();
        medals.set(0,0, 1);
        medals.set(0, 2, 1);
        medals.set(1, 0, 1);

        //etc
        medals.display();

        int totalMedals = medals.total();

        System.out.println("\n\nTotal medals " + totalMedals);

        int[] countryTotals = medals.calculateRowTotals();

        //Display the row totals
        System.out.println("Row Totals: ");
        for (int countryTotal : countryTotals) {
            System.out.println(countryTotal);
        }

        int[] medalTotals = medals.calculateColumnTotals();

        System.out.println("Column Totals: ");
        for (int medalTotal : medalTotals) {
            System.out.println(medalTotal);
        }
    }
}
