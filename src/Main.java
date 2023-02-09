public class Main {
    public static void main(String[] args) {

        int [] sales = {34, 54, 21, 76, 345, 643, 12, 456, 68};
        SalesManager salesManager = new SalesManager(sales);

        System.out.println(salesManager.max());
    }
}
